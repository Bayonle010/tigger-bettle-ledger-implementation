package mapper;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e\u00a8\u0006\u000f"}, d2 = {"Lmapper/TransactionMapper;", "", "<init>", "()V", "toDomain", "Ldomain/Transaction;", "request", "Ldto/TransactionRequest;", "idempotencyKey", "Ljava/util/UUID;", "toResponse", "Ldto/TransactionResponse;", "transaction", "fee", "Ldomain/Fee;", "ledger"})
public final class TransactionMapper {
    @org.jetbrains.annotations.NotNull()
    public static final mapper.TransactionMapper INSTANCE = null;
    
    private TransactionMapper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final domain.Transaction toDomain(@org.jetbrains.annotations.NotNull()
    dto.TransactionRequest request, @org.jetbrains.annotations.NotNull()
    java.util.UUID idempotencyKey) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dto.TransactionResponse toResponse(@org.jetbrains.annotations.NotNull()
    domain.Transaction transaction, @org.jetbrains.annotations.NotNull()
    domain.Fee fee) {
        return null;
    }
}