package com.cashi.workflow

import com.cashi.ledger.LedgerTransferResult
import com.cashi.ledger.service.LedgerService
import dev.restate.sdk.WorkflowContext
import dev.restate.sdk.annotation.Workflow

@Workflow
class FeeRecordingWorkflow  (
    private val ledgerService: LedgerService
){

    @Workflow
    fun run (
        ctx : WorkflowContext,
        command : RecordFeeCommand
    ): LedgerTransferResult{
        return ctx.run(LedgerTransferResult::class.java){
            ledgerService.recordFee(command.transaction, command.fee)
        }
    }
}