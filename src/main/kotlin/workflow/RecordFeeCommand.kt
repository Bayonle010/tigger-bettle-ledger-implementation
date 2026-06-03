package com.cashi.workflow

data class RecordFeeCommand(
    val transactionId: String,
    val idempotencyKey: String,
    val feeMinorUnits: Long,
    val asset: String,
    val transactionType: String,
    val createdAtEpochMillis: Long
)