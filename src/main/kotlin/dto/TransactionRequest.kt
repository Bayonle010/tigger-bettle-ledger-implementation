package dto

import enums.Asset
import enums.AssetType
import enums.TransactionState
import enums.TransactionType
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import common.serializer.BigDecimalSerializer
import common.serializer.InstantSerializer
import java.math.BigDecimal
import java.time.Instant

@Serializable
data class TransactionRequest(
    @Serializable(with = BigDecimalSerializer::class)
    val amount: BigDecimal,

    val asset: Asset,

    @SerialName("asset_type")
    val assetType: AssetType,

    val type: TransactionType,

    val state: TransactionState,

    @SerialName("created_at")
    @Serializable(with = InstantSerializer::class)
    val createdAt: Instant
)
