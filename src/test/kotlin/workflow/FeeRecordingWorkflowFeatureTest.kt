package com.cashi.workflow

import com.cashi.ledger.LedgerTransferResult
import com.cashi.ledger.LedgerTransferStatus
import com.cashi.ledger.RecordFeeLedgerCommand
import com.cashi.ledger.service.LedgerService
import dev.restate.common.function.ThrowingSupplier
import dev.restate.sdk.WorkflowContext
import domain.Fee
import domain.Transaction
import io.kotest.core.spec.style.FeatureSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk
import java.util.UUID

class FeeRecordingWorkflowFeatureTest : FeatureSpec({

    feature("Fee recording workflow") {

        scenario("Convert workflow command into ledger command") {
            val fakeLedgerService = FakeLedgerService()
            val workflow = FeeRecordingWorkflow(fakeLedgerService)

            val ctx = mockk<WorkflowContext>()

            val command = RecordFeeCommand(
                transactionId = UUID.randomUUID().toString(),
                idempotencyKey = UUID.randomUUID().toString(),
                feeMinorUnits = 150,
                asset = "USD",
                transactionType = "MOBILE_TOP_UP",
                createdAtEpochMillis = 1717420000000
            )

            every {
                ctx.run(
                    LedgerTransferResult::class.java,
                    any<ThrowingSupplier<LedgerTransferResult>>()
                )
            } answers {
                secondArg<ThrowingSupplier<LedgerTransferResult>>().get()
            }

            val result = workflow.run(ctx, command)

            result.status shouldBe LedgerTransferStatus.CREATED
            fakeLedgerService.lastCommand?.feeMinorUnits shouldBe 150
            fakeLedgerService.lastCommand?.transferId.toString() shouldBe command.idempotencyKey
            fakeLedgerService.lastCommand?.transactionId.toString() shouldBe command.transactionId
        }
    }
})

private class FakeLedgerService : LedgerService {
    var lastCommand: RecordFeeLedgerCommand? = null

    override fun recordFee(command: RecordFeeLedgerCommand): LedgerTransferResult {
        lastCommand = command

        return LedgerTransferResult(
            transferId = command.transferId,
            status = LedgerTransferStatus.CREATED
        )
    }

    override fun recordFee(
        transaction: Transaction,
        fee: Fee
    ): LedgerTransferResult {
        error("Domain-object recordFee should not be used by workflow")
    }
}