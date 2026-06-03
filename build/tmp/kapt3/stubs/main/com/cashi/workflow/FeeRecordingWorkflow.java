package com.cashi.workflow;

@dev.restate.sdk.annotation.Workflow()
@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/cashi/workflow/FeeRecordingWorkflow;", "", "ledgerService", "Lcom/cashi/ledger/service/LedgerService;", "<init>", "(Lcom/cashi/ledger/service/LedgerService;)V", "run", "Lcom/cashi/ledger/LedgerTransferResult;", "ctx", "Ldev/restate/sdk/WorkflowContext;", "command", "Lcom/cashi/workflow/RecordFeeCommand;", "ledger"})
public final class FeeRecordingWorkflow {
    @org.jetbrains.annotations.NotNull()
    private final com.cashi.ledger.service.LedgerService ledgerService = null;
    
    public FeeRecordingWorkflow(@org.jetbrains.annotations.NotNull()
    com.cashi.ledger.service.LedgerService ledgerService) {
        super();
    }
    
    @dev.restate.sdk.annotation.Workflow()
    @org.jetbrains.annotations.NotNull()
    public final com.cashi.ledger.LedgerTransferResult run(@org.jetbrains.annotations.NotNull()
    dev.restate.sdk.WorkflowContext ctx, @org.jetbrains.annotations.NotNull()
    com.cashi.workflow.RecordFeeCommand command) {
        return null;
    }
}