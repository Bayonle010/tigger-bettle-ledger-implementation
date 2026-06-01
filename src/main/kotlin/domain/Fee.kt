package domain

import java.math.BigDecimal
import java.util.UUID

data class Fee(
    val transactionId: UUID,
    val money: Money,
    val rate: BigDecimal,
    val description: String,
)