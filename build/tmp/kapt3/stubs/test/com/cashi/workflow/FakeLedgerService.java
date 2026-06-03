package com.cashi.workflow;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0011"}, d2 = {"Lcom/cashi/workflow/FakeLedgerService;", "Lcom/cashi/ledger/service/LedgerService;", "<init>", "()V", "lastCommand", "Lcom/cashi/ledger/RecordFeeLedgerCommand;", "getLastCommand", "()Lcom/cashi/ledger/RecordFeeLedgerCommand;", "setLastCommand", "(Lcom/cashi/ledger/RecordFeeLedgerCommand;)V", "recordFee", "Lcom/cashi/ledger/LedgerTransferResult;", "command", "transaction", "Ldomain/Transaction;", "fee", "Ldomain/Fee;", "ledger_test"})
final class FakeLedgerService implements com.cashi.ledger.service.LedgerService {
    @org.jetbrains.annotations.Nullable()
    private com.cashi.ledger.RecordFeeLedgerCommand lastCommand;
    
    public FakeLedgerService() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.cashi.ledger.RecordFeeLedgerCommand getLastCommand() {
        return null;
    }
    
    public final void setLastCommand(@org.jetbrains.annotations.Nullable()
    com.cashi.ledger.RecordFeeLedgerCommand p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.cashi.ledger.LedgerTransferResult recordFee(@org.jetbrains.annotations.NotNull()
    com.cashi.ledger.RecordFeeLedgerCommand command) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.cashi.ledger.LedgerTransferResult recordFee(@org.jetbrains.annotations.NotNull()
    domain.Transaction transaction, @org.jetbrains.annotations.NotNull()
    domain.Fee fee) {
        return null;
    }
}