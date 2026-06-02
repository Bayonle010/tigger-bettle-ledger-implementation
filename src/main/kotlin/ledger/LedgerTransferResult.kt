package com.cashi.ledger

import java.util.UUID

data class LedgerTransferResult(
    val transferId: UUID,
    val status: LedgerTransferStatus
)
