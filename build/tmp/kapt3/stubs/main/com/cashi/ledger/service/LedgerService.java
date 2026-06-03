package com.cashi.ledger.service;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n\u00c0\u0006\u0003"}, d2 = {"Lcom/cashi/ledger/service/LedgerService;", "", "recordFee", "Lcom/cashi/ledger/LedgerTransferResult;", "transaction", "Ldomain/Transaction;", "fee", "Ldomain/Fee;", "command", "Lcom/cashi/ledger/RecordFeeLedgerCommand;", "ledger"})
public abstract interface LedgerService {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.cashi.ledger.LedgerTransferResult recordFee(@org.jetbrains.annotations.NotNull()
    domain.Transaction transaction, @org.jetbrains.annotations.NotNull()
    domain.Fee fee);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.cashi.ledger.LedgerTransferResult recordFee(@org.jetbrains.annotations.NotNull()
    com.cashi.ledger.RecordFeeLedgerCommand command);
}