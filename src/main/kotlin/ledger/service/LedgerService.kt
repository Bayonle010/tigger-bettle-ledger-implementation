package com.cashi.ledger.service

import com.cashi.ledger.LedgerTransferResult
import com.cashi.ledger.RecordFeeLedgerCommand
import domain.Fee
import domain.Transaction

interface LedgerService {
    fun recordFee(
        command: RecordFeeLedgerCommand
    ): LedgerTransferResult
}