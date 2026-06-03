package service;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lservice/TransactionFeeService;", "", "feeCalculator", "Lservice/FeeCalculator;", "ledgerService", "Lcom/cashi/ledger/service/LedgerService;", "<init>", "(Lservice/FeeCalculator;Lcom/cashi/ledger/service/LedgerService;)V", "calculateFee", "Ldomain/Fee;", "transaction", "Ldomain/Transaction;", "(Ldomain/Transaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ledger"})
public final class TransactionFeeService {
    @org.jetbrains.annotations.NotNull()
    private final service.FeeCalculator feeCalculator = null;
    @org.jetbrains.annotations.NotNull()
    private final com.cashi.ledger.service.LedgerService ledgerService = null;
    
    public TransactionFeeService(@org.jetbrains.annotations.NotNull()
    service.FeeCalculator feeCalculator, @org.jetbrains.annotations.NotNull()
    com.cashi.ledger.service.LedgerService ledgerService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object calculateFee(@org.jetbrains.annotations.NotNull()
    domain.Transaction transaction, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super domain.Fee> $completion) {
        return null;
    }
}