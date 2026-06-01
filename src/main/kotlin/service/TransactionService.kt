package service

import domain.Fee
import domain.Money
import domain.Transaction
import dto.FeeCalculationResult

class TransactionService(
    private val feeCalculator: FeeCalculator
) {
    fun calculate(transaction: Transaction): Fee {
        val result = feeCalculator.calculate(transaction.money.amount)

        return Fee(
            transactionId = transaction.id,
            money = Money(
                amount = result.fee,
                asset = transaction.money.asset
            ),
            rate = result.rate,
            description = "Standard fee rate of 0.15%"
        )
    }

}