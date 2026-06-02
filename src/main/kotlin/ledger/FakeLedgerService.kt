package com.cashi.ledger

import domain.Fee
import domain.Transaction

class FakeLedgerService: LedgerService {
    override suspend fun recordFee(transaction: Transaction, fee: Fee): LedgerTransferResult {
        return LedgerTransferResult(
            transferId = transaction.idempotencyKey,
            status = LedgerTransferStatus.CREATED
        )
    }
}