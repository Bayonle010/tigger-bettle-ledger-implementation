package com.cashi.ledger.service;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a8\u0006\f"}, d2 = {"Lcom/cashi/ledger/service/TigerBeetleLedgerService;", "Lcom/cashi/ledger/service/LedgerService;", "<init>", "()V", "recordFee", "Lcom/cashi/ledger/LedgerTransferResult;", "transaction", "Ldomain/Transaction;", "fee", "Ldomain/Fee;", "command", "Lcom/cashi/ledger/RecordFeeLedgerCommand;", "ledger"})
public final class TigerBeetleLedgerService implements com.cashi.ledger.service.LedgerService {
    
    public TigerBeetleLedgerService() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.cashi.ledger.LedgerTransferResult recordFee(@org.jetbrains.annotations.NotNull()
    domain.Transaction transaction, @org.jetbrains.annotations.NotNull()
    domain.Fee fee) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.cashi.ledger.LedgerTransferResult recordFee(@org.jetbrains.annotations.NotNull()
    com.cashi.ledger.RecordFeeLedgerCommand command) {
        return null;
    }
}