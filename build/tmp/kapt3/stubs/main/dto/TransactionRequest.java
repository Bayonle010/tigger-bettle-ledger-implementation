package dto;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002./B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0007H\u00c6\u0003J\t\u0010#\u001a\u00020\tH\u00c6\u0003J\t\u0010$\u001a\u00020\u000bH\u00c6\u0003J\t\u0010%\u001a\u00020\rH\u00c6\u0003JE\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\u0014\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010*\u001a\u00020+H\u00d6\u0081\u0004J\n\u0010,\u001a\u00020-H\u00d6\u0081\u0004R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u001f\u00a8\u00060"}, d2 = {"Ldto/TransactionRequest;", "", "amount", "Ljava/math/BigDecimal;", "asset", "Lenums/Asset;", "assetType", "Lenums/AssetType;", "type", "Lenums/TransactionType;", "state", "Lenums/TransactionState;", "createdAt", "Ljava/time/Instant;", "<init>", "(Ljava/math/BigDecimal;Lenums/Asset;Lenums/AssetType;Lenums/TransactionType;Lenums/TransactionState;Ljava/time/Instant;)V", "getAmount$annotations", "()V", "getAmount", "()Ljava/math/BigDecimal;", "getAsset", "()Lenums/Asset;", "getAssetType$annotations", "getAssetType", "()Lenums/AssetType;", "getType", "()Lenums/TransactionType;", "getState", "()Lenums/TransactionState;", "getCreatedAt$annotations", "getCreatedAt", "()Ljava/time/Instant;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "$serializer", "Companion", "ledger"})
public final class TransactionRequest {
    @org.jetbrains.annotations.NotNull()
    private final java.math.BigDecimal amount = null;
    @org.jetbrains.annotations.NotNull()
    private final enums.Asset asset = null;
    @org.jetbrains.annotations.NotNull()
    private final enums.AssetType assetType = null;
    @org.jetbrains.annotations.NotNull()
    private final enums.TransactionType type = null;
    @org.jetbrains.annotations.NotNull()
    private final enums.TransactionState state = null;
    @org.jetbrains.annotations.NotNull()
    private final java.time.Instant createdAt = null;
    @org.jetbrains.annotations.NotNull()
    public static final dto.TransactionRequest.Companion Companion = null;
    
    public TransactionRequest(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
    enums.Asset asset, @org.jetbrains.annotations.NotNull()
    enums.AssetType assetType, @org.jetbrains.annotations.NotNull()
    enums.TransactionType type, @org.jetbrains.annotations.NotNull()
    enums.TransactionState state, @org.jetbrains.annotations.NotNull()
    java.time.Instant createdAt) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getAmount() {
        return null;
    }
    
    @kotlinx.serialization.Serializable(with = common.serializer.BigDecimalSerializer.class)
    @java.lang.Deprecated()
    public static void getAmount$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final enums.Asset getAsset() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final enums.AssetType getAssetType() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "asset_type")
    @java.lang.Deprecated()
    public static void getAssetType$annotations() {
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
    
    @kotlinx.serialization.SerialName(value = "created_at")
    @kotlinx.serialization.Serializable(with = common.serializer.InstantSerializer.class)
    @java.lang.Deprecated()
    public static void getCreatedAt$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final enums.Asset component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final enums.AssetType component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final enums.TransactionType component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final enums.TransactionState component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.Instant component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dto.TransactionRequest copy(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
    enums.Asset asset, @org.jetbrains.annotations.NotNull()
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
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006H\u0086\u0080\u0004\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0080\u0004J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0086\u0080\u0004R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"dto/TransactionRequest.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Ldto/TransactionRequest;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "ledger"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<dto.TransactionRequest> {
        @org.jetbrains.annotations.NotNull()
        public static final dto.TransactionRequest.$serializer INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = null;
        
        private $serializer() {
            super();
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public final dto.TransactionRequest deserialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
        
        @java.lang.Override()
        public final void serialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
        dto.TransactionRequest value) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a8\u0006\u0007"}, d2 = {"Ldto/TransactionRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ldto/TransactionRequest;", "ledger"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<dto.TransactionRequest> serializer() {
            return null;
        }
    }
}