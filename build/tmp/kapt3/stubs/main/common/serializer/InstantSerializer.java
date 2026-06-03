package common.serializer;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0080\u0004J\u0012\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004R\u0015\u0010\u0005\u001a\u00020\u0006X\u0096\u0084\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lcommon/serializer/InstantSerializer;", "Lkotlinx/serialization/KSerializer;", "Ljava/time/Instant;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ledger"})
public final class InstantSerializer implements kotlinx.serialization.KSerializer<java.time.Instant> {
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = null;
    @org.jetbrains.annotations.NotNull()
    public static final common.serializer.InstantSerializer INSTANCE = null;
    
    private InstantSerializer() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return null;
    }
    
    @java.lang.Override()
    public void serialize(@org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
    java.time.Instant value) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.time.Instant deserialize(@org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.Decoder decoder) {
        return null;
    }
}