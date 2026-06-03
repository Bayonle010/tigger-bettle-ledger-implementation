package service;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\t"}, d2 = {"Lservice/FeeCalculator;", "", "<init>", "()V", "calculate", "Ldto/FeeCalculationResult;", "amount", "Ljava/math/BigDecimal;", "Companion", "ledger"})
public final class FeeCalculator {
    @org.jetbrains.annotations.NotNull()
    private static final java.math.BigDecimal DEFAULT_RATE = null;
    private static final int MONEY_SCALE = 2;
    @org.jetbrains.annotations.NotNull()
    public static final service.FeeCalculator.Companion Companion = null;
    
    public FeeCalculator() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dto.FeeCalculationResult calculate(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount) {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lservice/FeeCalculator$Companion;", "", "<init>", "()V", "DEFAULT_RATE", "Ljava/math/BigDecimal;", "MONEY_SCALE", "", "ledger"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}