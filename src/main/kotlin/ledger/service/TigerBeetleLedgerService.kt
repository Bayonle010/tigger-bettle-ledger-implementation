package com.cashi.ledger.service

import com.cashi.common.exception.LedgerException
import com.cashi.ledger.mapper.LedgerIds
import com.cashi.ledger.mapper.LedgerTransferCode
import com.cashi.ledger.LedgerTransferResult
import com.cashi.ledger.LedgerTransferStatus
import com.cashi.ledger.RecordFeeLedgerCommand
import com.cashi.ledger.TigerBeetleClientFactory
import com.cashi.ledger.mapper.TigerBeetleIdMapper
import com.tigerbeetle.CreateTransferStatus
import com.tigerbeetle.TransferBatch
import domain.Fee
import domain.Transaction

class TigerBeetleLedgerService : LedgerService {

    override fun recordFee(
        transaction: Transaction,
        fee: Fee
    ): LedgerTransferResult {
        val transferId = transaction.idempotencyKey
        val amountMinorUnits = fee.money.toMinorUnits()

        TigerBeetleClientFactory.create().use { client ->
            val transfers = TransferBatch(1)

            transfers.add()
            transfers.setId(TigerBeetleIdMapper.fromUuid(transferId))
            transfers.setDebitAccountId(SystemAccountId.CUSTOMER_LIABILITY_POOL)
            transfers.setCreditAccountId(SystemAccountId.PLATFORM_FEE_REVENUE)
            transfers.setAmount(amountMinorUnits)
            transfers.setLedger(LedgerIds.USD)
            transfers.setCode(LedgerTransferCode.FEE_COLLECTION)
            transfers.setUserData128(TigerBeetleIdMapper.fromUuid(transaction.id))
            transfers.setUserData64(transaction.createdAt.toEpochMilli())
            transfers.setUserData32(transaction.type.ordinal)

            val results = client.createTransfers(transfers)

            while (results.next()) {
                return when (val status = results.getStatus()) {
                    CreateTransferStatus.Created -> LedgerTransferResult(
                        transferId = transferId,
                        status = LedgerTransferStatus.CREATED
                    )

                    CreateTransferStatus.Exists -> LedgerTransferResult(
                        transferId = transferId,
                        status = LedgerTransferStatus.ALREADY_EXISTS
                    )

                    else -> throw LedgerException(
                        "TigerBeetle fee transfer failed with status: $status"
                    )
                }
            }
        }

        throw LedgerException("TigerBeetle returned no transfer result")
    }

    override fun recordFee(command: RecordFeeLedgerCommand): LedgerTransferResult {
        TigerBeetleClientFactory.create().use { client ->
            val transfers = TransferBatch(1)

            transfers.add()
            transfers.setId(TigerBeetleIdMapper.fromUuid(command.transferId))
            transfers.setDebitAccountId(SystemAccountId.CUSTOMER_LIABILITY_POOL)
            transfers.setCreditAccountId(SystemAccountId.PLATFORM_FEE_REVENUE)
            transfers.setAmount(command.feeMinorUnits)
            transfers.setLedger(LedgerIds.USD)
            transfers.setCode(LedgerTransferCode.FEE_COLLECTION)
            transfers.setUserData128(TigerBeetleIdMapper.fromUuid(command.transactionId))
            transfers.setUserData64(command.createdAtEpochMillis)
            transfers.setUserData32(command.transactionTypeOrdinal)

            val results = client.createTransfers(transfers)

            while (results.next()) {
                return when (val status = results.getStatus()) {
                    CreateTransferStatus.Created -> LedgerTransferResult(
                        transferId = command.transferId,
                        status = LedgerTransferStatus.CREATED
                    )

                    CreateTransferStatus.Exists -> LedgerTransferResult(
                        transferId = command.transferId,
                        status = LedgerTransferStatus.ALREADY_EXISTS
                    )

                    else -> throw LedgerException(
                        "TigerBeetle fee transfer failed with status: $status"
                    )
                }
            }
        }

        throw LedgerException("TigerBeetle returned no transfer result")
    }
}