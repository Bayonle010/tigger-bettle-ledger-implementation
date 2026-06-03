package com.cashi.service;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0002\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001b"}, d2 = {"Lcom/cashi/service/FakeFeeRecordingWorkflowExecutor;", "Lcom/cashi/workflow/FeeRecordingWorkflowExecutor;", "<init>", "()V", "wasCalled", "", "getWasCalled", "()Z", "setWasCalled", "(Z)V", "recordedTransaction", "Ldomain/Transaction;", "getRecordedTransaction", "()Ldomain/Transaction;", "setRecordedTransaction", "(Ldomain/Transaction;)V", "recordedFee", "Ldomain/Fee;", "getRecordedFee", "()Ldomain/Fee;", "setRecordedFee", "(Ldomain/Fee;)V", "recordFee", "", "transaction", "fee", "(Ldomain/Transaction;Ldomain/Fee;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ledger_test"})
final class FakeFeeRecordingWorkflowExecutor implements com.cashi.workflow.FeeRecordingWorkflowExecutor {
    private boolean wasCalled = false;
    @org.jetbrains.annotations.Nullable()
    private domain.Transaction recordedTransaction;
    @org.jetbrains.annotations.Nullable()
    private domain.Fee recordedFee;
    
    public FakeFeeRecordingWorkflowExecutor() {
        super();
    }
    
    public final boolean getWasCalled() {
        return false;
    }
    
    public final void setWasCalled(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final domain.Transaction getRecordedTransaction() {
        return null;
    }
    
    public final void setRecordedTransaction(@org.jetbrains.annotations.Nullable()
    domain.Transaction p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final domain.Fee getRecordedFee() {
        return null;
    }
    
    public final void setRecordedFee(@org.jetbrains.annotations.Nullable()
    domain.Fee p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object recordFee(@org.jetbrains.annotations.NotNull()
    domain.Transaction transaction, @org.jetbrains.annotations.NotNull()
    domain.Fee fee, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}