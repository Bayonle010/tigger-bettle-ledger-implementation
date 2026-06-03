package com.cashi.workflow;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t\u00c0\u0006\u0003"}, d2 = {"Lcom/cashi/workflow/FeeRecordingWorkflowExecutor;", "", "recordFee", "", "transaction", "Ldomain/Transaction;", "fee", "Ldomain/Fee;", "(Ldomain/Transaction;Ldomain/Fee;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ledger"})
public abstract interface FeeRecordingWorkflowExecutor {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object recordFee(@org.jetbrains.annotations.NotNull()
    domain.Transaction transaction, @org.jetbrains.annotations.NotNull()
    domain.Fee fee, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}