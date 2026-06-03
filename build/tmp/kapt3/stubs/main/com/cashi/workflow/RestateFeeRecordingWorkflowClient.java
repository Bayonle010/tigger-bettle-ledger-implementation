package com.cashi.workflow;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/cashi/workflow/RestateFeeRecordingWorkflowClient;", "Lcom/cashi/workflow/FeeRecordingWorkflowExecutor;", "restateBaseUrl", "", "<init>", "(Ljava/lang/String;)V", "recordFee", "", "transaction", "Ldomain/Transaction;", "fee", "Ldomain/Fee;", "(Ldomain/Transaction;Ldomain/Fee;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ledger"})
public final class RestateFeeRecordingWorkflowClient implements com.cashi.workflow.FeeRecordingWorkflowExecutor {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String restateBaseUrl = null;
    
    public RestateFeeRecordingWorkflowClient(@org.jetbrains.annotations.NotNull()
    java.lang.String restateBaseUrl) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object recordFee(@org.jetbrains.annotations.NotNull()
    domain.Transaction transaction, @org.jetbrains.annotations.NotNull()
    domain.Fee fee, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public RestateFeeRecordingWorkflowClient() {
        super();
    }
}