package service

import com.cashi.workflow.FeeRecordingWorkflowExecutor
import domain.Fee
import domain.Money
import domain.Transaction
import java.math.BigDecimal

class TransactionFeeService(
    private val feeCalculator: FeeCalculator,
    private val workflowExecutor: FeeRecordingWorkflowExecutor
) {
    suspend fun calculateFee(transaction: Transaction): Fee {
        val result = feeCalculator.calculate(
            amount = transaction.money.amount,
            transactionType = transaction.type
        )

        val fee = Fee(
            transactionId = transaction.id,
            money = Money(
                amount = result.fee,
                asset = transaction.money.asset
            ),
            rate = result.rate,

            description = "Standard fee rate of ${
                result.rate
                    .multiply(BigDecimal("100"))
                    .stripTrailingZeros()
                    .toPlainString()
            }%"
        )

        workflowExecutor.recordFee(
            transaction = transaction,
            fee = fee
        )

        return fee
    }
}