package com.cashi.dto

import java.math.BigDecimal

data class FeeCalculationResult(
    val fee: BigDecimal,
    val rate: BigDecimal
)
