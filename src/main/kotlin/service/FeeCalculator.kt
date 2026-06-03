package service

import dto.FeeCalculationResult
import enums.TransactionType
import java.math.BigDecimal
import java.math.RoundingMode

class FeeCalculator {
    companion object {
        private const val MONEY_SCALE = 2

        private val MOBILE_TOP_UP_RATE = BigDecimal("0.0015") //0.15%
        private val BILL_PAYMENT_RATE = BigDecimal("0.0020") // 0.20 %
        private val BANK_TRANSFER_RATE = BigDecimal("0.0030") // 0.30%
        private val CARD_PAYMENT_RATE = BigDecimal("0.0250") // 2.5%
        private val CRYPTO_PURCHASE_RATE = BigDecimal("0.0100") // 1%
    }

    fun calculate(
        amount: BigDecimal,
        transactionType: TransactionType
    ): FeeCalculationResult {
        val rate = when (transactionType) {
            TransactionType.MOBILE_TOP_UP -> MOBILE_TOP_UP_RATE
            TransactionType.BILL_PAYMENT -> BILL_PAYMENT_RATE
            TransactionType.BANK_TRANSFER -> BANK_TRANSFER_RATE
            TransactionType.CARD_PAYMENT -> CARD_PAYMENT_RATE
            TransactionType.CRYPTO_PURCHASE -> CRYPTO_PURCHASE_RATE
        }

        val fee = amount
            .multiply(rate)
            .setScale(MONEY_SCALE, RoundingMode.HALF_UP)

        return FeeCalculationResult(
            fee = fee,
            rate = rate
        )
    }
}