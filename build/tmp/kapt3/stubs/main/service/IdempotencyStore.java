package service;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0006J\u0016\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lservice/IdempotencyStore;", "", "<init>", "()V", "responses", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/UUID;", "Ldto/TransactionResponse;", "get", "key", "save", "response", "ledger"})
public final class IdempotencyStore {
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.ConcurrentHashMap<java.util.UUID, dto.TransactionResponse> responses = null;
    
    public IdempotencyStore() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final dto.TransactionResponse get(@org.jetbrains.annotations.NotNull()
    java.util.UUID key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dto.TransactionResponse save(@org.jetbrains.annotations.NotNull()
    java.util.UUID key, @org.jetbrains.annotations.NotNull()
    dto.TransactionResponse response) {
        return null;
    }
}