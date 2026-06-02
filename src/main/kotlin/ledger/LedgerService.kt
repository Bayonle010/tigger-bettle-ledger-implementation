package com.cashi.ledger

import domain.Fee
import domain.Transaction

interface LedgerService {
    suspend fun recordFee(
        transaction: Transaction,
        fee : Fee
    ) : LedgerTransferResult
}