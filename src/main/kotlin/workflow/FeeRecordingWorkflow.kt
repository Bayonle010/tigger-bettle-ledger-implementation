package com.cashi.workflow

import com.cashi.ledger.LedgerTransferResult
import com.cashi.ledger.RecordFeeLedgerCommand
import com.cashi.ledger.service.LedgerService
import dev.restate.sdk.WorkflowContext
import dev.restate.sdk.annotation.Workflow
import enums.TransactionType
import java.util.UUID

@Workflow
class FeeRecordingWorkflow(
    private val ledgerService: LedgerService
) {

    @Workflow
    fun run(
        ctx: WorkflowContext,
        command: RecordFeeCommand
    ): LedgerTransferResult {
        return ctx.run(LedgerTransferResult::class.java) {
            ledgerService.recordFee(
                RecordFeeLedgerCommand(
                    transferId = UUID.fromString(command.idempotencyKey),
                    transactionId = UUID.fromString(command.transactionId),
                    feeMinorUnits = command.feeMinorUnits,
                    transactionTypeOrdinal = TransactionType.valueOf(command.transactionType).ordinal,
                    createdAtEpochMillis = command.createdAtEpochMillis
                )
            )
        }
    }
}