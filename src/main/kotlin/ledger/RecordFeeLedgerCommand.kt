package com.cashi.ledger

import java.util.UUID

data class RecordFeeLedgerCommand(
    val transferId: UUID,
    val transactionId: UUID,
    val feeMinorUnits: Long,
    val transactionTypeOrdinal: Int,
    val createdAtEpochMillis: Long
)
