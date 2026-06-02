package com.cashi.ledger.service

import com.cashi.ledger.LedgerTransferResult
import domain.Fee
import domain.Transaction

interface LedgerService {
    fun recordFee(
        transaction: Transaction,
        fee : Fee
    ) : LedgerTransferResult
}