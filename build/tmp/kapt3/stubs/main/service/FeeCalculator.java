package service;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u00a8\u0006\u000b"}, d2 = {"Lservice/FeeCalculator;", "", "<init>", "()V", "calculate", "Ldto/FeeCalculationResult;", "amount", "Ljava/math/BigDecimal;", "transactionType", "Lenums/TransactionType;", "Companion", "ledger"})
public final class FeeCalculator {
    private static final int MONEY_SCALE = 2;
    @org.jetbrains.annotations.NotNull()
    private static final java.math.BigDecimal MOBILE_TOP_UP_RATE = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.math.BigDecimal BILL_PAYMENT_RATE = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.math.BigDecimal BANK_TRANSFER_RATE = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.math.BigDecimal CARD_PAYMENT_RATE = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.math.BigDecimal CRYPTO_PURCHASE_RATE = null;
    @org.jetbrains.annotations.NotNull()
    public static final service.FeeCalculator.Companion Companion = null;
    
    public FeeCalculator() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dto.FeeCalculationResult calculate(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
    enums.TransactionType transactionType) {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lservice/FeeCalculator$Companion;", "", "<init>", "()V", "MONEY_SCALE", "", "MOBILE_TOP_UP_RATE", "Ljava/math/BigDecimal;", "BILL_PAYMENT_RATE", "BANK_TRANSFER_RATE", "CARD_PAYMENT_RATE", "CRYPTO_PURCHASE_RATE", "ledger"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}