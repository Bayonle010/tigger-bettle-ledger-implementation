package com.cashi.ledger;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0006H\u00c6\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0006H\u00c6\u0001J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u001d\u001a\u00020\bH\u00d6\u0081\u0004J\n\u0010\u001e\u001a\u00020\u001fH\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010\u00a8\u0006 "}, d2 = {"Lcom/cashi/ledger/RecordFeeLedgerCommand;", "", "transferId", "Ljava/util/UUID;", "transactionId", "feeMinorUnits", "", "transactionTypeOrdinal", "", "createdAtEpochMillis", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;JIJ)V", "getTransferId", "()Ljava/util/UUID;", "getTransactionId", "getFeeMinorUnits", "()J", "getTransactionTypeOrdinal", "()I", "getCreatedAtEpochMillis", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "ledger"})
public final class RecordFeeLedgerCommand {
    @org.jetbrains.annotations.NotNull()
    private final java.util.UUID transferId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.UUID transactionId = null;
    private final long feeMinorUnits = 0L;
    private final int transactionTypeOrdinal = 0;
    private final long createdAtEpochMillis = 0L;
    
    public RecordFeeLedgerCommand(@org.jetbrains.annotations.NotNull()
    java.util.UUID transferId, @org.jetbrains.annotations.NotNull()
    java.util.UUID transactionId, long feeMinorUnits, int transactionTypeOrdinal, long createdAtEpochMillis) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getTransferId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getTransactionId() {
        return null;
    }
    
    public final long getFeeMinorUnits() {
        return 0L;
    }
    
    public final int getTransactionTypeOrdinal() {
        return 0;
    }
    
    public final long getCreatedAtEpochMillis() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID component2() {
        return null;
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final long component5() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.cashi.ledger.RecordFeeLedgerCommand copy(@org.jetbrains.annotations.NotNull()
    java.util.UUID transferId, @org.jetbrains.annotations.NotNull()
    java.util.UUID transactionId, long feeMinorUnits, int transactionTypeOrdinal, long createdAtEpochMillis) {
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