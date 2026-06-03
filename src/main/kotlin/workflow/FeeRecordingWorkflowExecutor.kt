package com.cashi.workflow

import domain.Fee
import domain.Transaction

interface FeeRecordingWorkflowExecutor {
    suspend fun recordFee(
        transaction : Transaction,
        fee: Fee
    )
}