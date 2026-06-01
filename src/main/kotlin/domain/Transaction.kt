package domain

import enums.Asset
import enums.TransactionState
import enums.TransactionType
import java.time.Instant
import java.util.UUID

data class Transaction(
    val id: UUID,
    val idempotencyKey: UUID,
    val money: Money,
    val assetType: Asset,
    val type: TransactionType,
    val state: TransactionState,
    val createdAt: Instant,
)