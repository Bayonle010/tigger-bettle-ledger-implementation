package com.cashi.service

import com.cashi.workflow.FeeRecordingWorkflowExecutor
import domain.Fee
import domain.Money
import domain.Transaction
import enums.Asset
import enums.AssetType
import enums.TransactionState
import enums.TransactionType
import io.kotest.core.spec.style.FeatureSpec
import io.kotest.matchers.shouldBe
import service.FeeCalculator
import service.TransactionFeeService
import java.math.BigDecimal
import java.time.Instant
import java.util.UUID

class TransactionFeeServiceFeatureTest : FeatureSpec({

    feature("Transaction fee processing") {

        scenario("Calculate fee and invoke fee recording workflow") {
            val fakeWorkflowExecutor = FakeFeeRecordingWorkflowExecutor()

            val service = TransactionFeeService(
                feeCalculator = FeeCalculator(),
                workflowExecutor = fakeWorkflowExecutor
            )

            val transaction = Transaction(
                id = UUID.randomUUID(),
                idempotencyKey = UUID.randomUUID(),
                money = Money(
                    amount = BigDecimal("1000.00"),
                    asset = Asset.USD
                ),
                assetType = AssetType.FIAT,
                type = TransactionType.MOBILE_TOP_UP,
                state = TransactionState.PENDING,
                createdAt = Instant.now()
            )

            val fee = service.calculateFee(transaction)

            fee.money.amount shouldBe BigDecimal("1.50")
            fakeWorkflowExecutor.wasCalled shouldBe true
            fakeWorkflowExecutor.recordedTransaction shouldBe transaction
            fakeWorkflowExecutor.recordedFee shouldBe fee
        }
    }
})

private class FakeFeeRecordingWorkflowExecutor : FeeRecordingWorkflowExecutor {
    var wasCalled = false
    var recordedTransaction: Transaction? = null
    var recordedFee: Fee? = null

    override suspend fun recordFee(
        transaction: Transaction,
        fee: Fee
    ) {
        wasCalled = true
        recordedTransaction = transaction
        recordedFee = fee
    }
}