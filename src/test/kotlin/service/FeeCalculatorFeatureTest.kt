package service

import enums.TransactionType
import io.kotest.core.spec.style.FeatureSpec
import io.kotest.matchers.shouldBe
import java.math.BigDecimal

class FeeCalculatorFeatureTest : FeatureSpec({

    feature("Transaction fee calculation") {

        scenario("Calculate standard fee for a mobile top up transaction") {
            val feeCalculator = FeeCalculator()

            val result = feeCalculator.calculate(
                amount = BigDecimal("1000.00"),
                transactionType = TransactionType.MOBILE_TOP_UP
            )

            result.fee shouldBe BigDecimal("1.50")
            result.rate shouldBe BigDecimal("0.0015")
        }

        scenario("Calculate bank transfer fee"){
            val feeCalculator = FeeCalculator()

            val result = feeCalculator.calculate(
                amount = BigDecimal("1000.00"),
                transactionType = TransactionType.BANK_TRANSFER
            )

            result.fee shouldBe BigDecimal("3.00")
            result.rate shouldBe BigDecimal("0.0030")
        }


        scenario("Calculate bill payment fee") {
            val feeCalculator = FeeCalculator()

            val result = feeCalculator.calculate(
                amount = BigDecimal("1000.00"),
                transactionType = TransactionType.BILL_PAYMENT
            )

            result.fee shouldBe BigDecimal("2.00")
            result.rate shouldBe BigDecimal("0.0020")
        }

        scenario("Calculate card payment fee") {
            val feeCalculator = FeeCalculator()

            val result = feeCalculator.calculate(
                amount = BigDecimal("1000.00"),
                transactionType = TransactionType.CARD_PAYMENT
            )

            result.fee shouldBe BigDecimal("25.00")
            result.rate shouldBe BigDecimal("0.0250")
        }

        scenario("Calculate crypto purchase fee") {
            val feeCalculator = FeeCalculator()

            val result = feeCalculator.calculate(
                amount = BigDecimal("1000.00"),
                transactionType = TransactionType.CRYPTO_PURCHASE
            )

            result.fee shouldBe BigDecimal("10.00")
            result.rate shouldBe BigDecimal("0.0100")
        }

        scenario("Round calculated fee to two decimal places") {
            val feeCalculator = FeeCalculator()

            val result = feeCalculator.calculate(
                amount = BigDecimal("999.99"),
                transactionType = TransactionType.MOBILE_TOP_UP
            )

            result.fee shouldBe BigDecimal("1.50")
        }
    }
})