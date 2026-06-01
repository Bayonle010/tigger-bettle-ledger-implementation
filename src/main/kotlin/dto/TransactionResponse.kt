package dto

import enums.Asset
import enums.TransactionType
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import shared.serializer.BigDecimalSerializer
import shared.serializer.UUIDSerializer
import java.math.BigDecimal
import java.util.UUID

@Serializable
data class TransactionResponse(
    @SerialName("transaction_id")
    @Serializable(with = UUIDSerializer::class)
    val transactionId: UUID,

    @Serializable(with = BigDecimalSerializer::class)
    val amount: BigDecimal,

    val asset: Asset,

    val type: TransactionType,

    @Serializable(with = BigDecimalSerializer::class)
    val fee: BigDecimal,

    @Serializable(with = BigDecimalSerializer::class)
    val rate: BigDecimal,

    val description: String

)
