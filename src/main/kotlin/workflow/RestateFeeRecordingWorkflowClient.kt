package com.cashi.workflow

import domain.Fee
import domain.Transaction

class RestateFeeRecordingWorkflowClient(
    private val restateBaseUrl: String = "http://localhost:8080"
) : FeeRecordingWorkflowExecutor {

    override suspend fun recordFee(
        transaction: Transaction,
        fee: Fee
    ) {
        val command = RecordFeeCommand(
            transactionId = transaction.id.toString(),
            idempotencyKey = transaction.idempotencyKey.toString(),
            feeMinorUnits = fee.money.toMinorUnits(),
            asset = transaction.money.asset.name,
            transactionType = transaction.type.name,
            createdAtEpochMillis = transaction.createdAt.toEpochMilli()
        )

        FeeRecordingWorkflowClient
            .connect(
                restateBaseUrl,
                transaction.idempotencyKey.toString()
            )
            .submit(command)
    }
}