package com.cashi.service

import com.cashi.dto.FeeCalculationResult
import java.math.BigDecimal
import java.math.RoundingMode

class FeeCalculator {
    companion object {
        private val DEFAULT_RATE = BigDecimal("0.0015")
    }

    fun calculate(
        amount: BigDecimal
    ): FeeCalculationResult {
        val  fee = amount.multiply(DEFAULT_RATE)
            .setScale(2, RoundingMode.HALF_UP)

        return FeeCalculationResult(
            fee = fee,
            rate = DEFAULT_RATE
        )
    }
}