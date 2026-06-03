package domain

import enums.Asset
import enums.AssetType
import enums.TransactionState
import enums.TransactionType
import java.time.Instant
import java.util.UUID

data class Transaction(
    val id: UUID,
    val idempotencyKey: UUID,
    val money: Money,
    val assetType: AssetType,
    val type: TransactionType,
    val state: TransactionState,
    val createdAt: Instant,
)