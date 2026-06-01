package service

import domain.Fee
import domain.Money
import domain.Transaction

class TransactionFeeService(
    private val feeCalculator: FeeCalculator
) {
    fun calculateFee(transaction: Transaction): Fee {
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