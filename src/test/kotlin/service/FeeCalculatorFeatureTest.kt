package service

import io.kotest.core.spec.style.FeatureSpec
import io.kotest.matchers.shouldBe
import java.math.BigDecimal

class FeeCalculatorFeatureTest : FeatureSpec({

    feature("Transaction fee calculation") {

        scenario("Calculate standard fee for a mobile top up transaction") {
            val feeCalculator = FeeCalculator()

            val result = feeCalculator.calculate(BigDecimal("1000.00"))

            result.fee shouldBe BigDecimal("1.50")
            result.rate shouldBe BigDecimal("0.0015")
        }

        scenario("Round calculated fee to two decimal places") {
            val feeCalculator = FeeCalculator()

            val result = feeCalculator.calculate(BigDecimal("999.99"))

            result.fee shouldBe BigDecimal("1.50")
        }
    }
})