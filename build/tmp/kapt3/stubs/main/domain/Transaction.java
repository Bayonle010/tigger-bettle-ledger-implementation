package domain;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0006H\u00c6\u0003J\t\u0010!\u001a\u00020\bH\u00c6\u0003J\t\u0010\"\u001a\u00020\nH\u00c6\u0003J\t\u0010#\u001a\u00020\fH\u00c6\u0003J\t\u0010$\u001a\u00020\u000eH\u00c6\u0003JO\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u00c6\u0001J\u0014\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010)\u001a\u00020*H\u00d6\u0081\u0004J\n\u0010+\u001a\u00020,H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006-"}, d2 = {"Ldomain/Transaction;", "", "id", "Ljava/util/UUID;", "idempotencyKey", "money", "Ldomain/Money;", "assetType", "Lenums/AssetType;", "type", "Lenums/TransactionType;", "state", "Lenums/TransactionState;", "createdAt", "Ljava/time/Instant;", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Ldomain/Money;Lenums/AssetType;Lenums/TransactionType;Lenums/TransactionState;Ljava/time/Instant;)V", "getId", "()Ljava/util/UUID;", "getIdempotencyKey", "getMoney", "()Ldomain/Money;", "getAssetType", "()Lenums/AssetType;", "getType", "()Lenums/TransactionType;", "getState", "()Lenums/TransactionState;", "getCreatedAt", "()Ljava/time/Instant;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ledger"})
public final class Transaction {
    @org.jetbrains.annotations.NotNull()
    private final java.util.UUID id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.UUID idempotencyKey = null;
    @org.jetbrains.annotations.NotNull()
    private final domain.Money money = null;
    @org.jetbrains.annotations.NotNull()
    private final enums.AssetType assetType = null;
    @org.jetbrains.annotations.NotNull()
    private final enums.TransactionType type = null;
    @org.jetbrains.annotations.NotNull()
    private final enums.TransactionState state = null;
    @org.jetbrains.annotations.NotNull()
    private final java.time.Instant createdAt = null;
    
    public Transaction(@org.jetbrains.annotations.NotNull()
    java.util.UUID id, @org.jetbrains.annotations.NotNull()
    java.util.UUID idempotencyKey, @org.jetbrains.annotations.NotNull()
    domain.Money money, @org.jetbrains.annotations.NotNull()
    enums.AssetType assetType, @org.jetbrains.annotations.NotNull()
    enums.TransactionType type, @org.jetbrains.annotations.NotNull()
    enums.TransactionState state, @org.jetbrains.annotations.NotNull()
    java.time.Instant createdAt) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getIdempotencyKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final domain.Money getMoney() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final enums.AssetType getAssetType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final enums.TransactionType getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final enums.TransactionState getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.Instant getCreatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final domain.Money component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final enums.AssetType component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final enums.TransactionType component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final enums.TransactionState component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.Instant component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final domain.Transaction copy(@org.jetbrains.annotations.NotNull()
    java.util.UUID id, @org.jetbrains.annotations.NotNull()
    java.util.UUID idempotencyKey, @org.jetbrains.annotations.NotNull()
    domain.Money money, @org.jetbrains.annotations.NotNull()
    enums.AssetType assetType, @org.jetbrains.annotations.NotNull()
    enums.TransactionType type, @org.jetbrains.annotations.NotNull()
    enums.TransactionState state, @org.jetbrains.annotations.NotNull()
    java.time.Instant createdAt) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}