package service

import com.cashi.ledger.service.LedgerService
import domain.Fee
import domain.Money
import domain.Transaction

class TransactionFeeService(
    private val feeCalculator: FeeCalculator,
    private val ledgerService: LedgerService
) {
    suspend fun calculateFee(transaction: Transaction): Fee {
        val result = feeCalculator.calculate(transaction.money.amount)

        val fee = Fee(
            transactionId = transaction.id,
            money = Money(
                amount = result.fee,
                asset = transaction.money.asset
            ),
            rate = result.rate,
            description = "Standard fee rate of 0.15%"
        )

        ledgerService.recordFee(
            transaction = transaction,
            fee = fee
        )

        return fee
    }
}