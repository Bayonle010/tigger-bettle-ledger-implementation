package dto

import common.serializer.BigDecimalSerializer
import kotlinx.serialization.Serializable
import java.math.BigDecimal

data class FeeCalculationResult(

    @Serializable(with = BigDecimalSerializer::class)
    val fee: BigDecimal,

    @Serializable(with = BigDecimalSerializer::class)
    val rate: BigDecimal
)
