package common.response;

@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u0002H\u0006\u00a2\u0006\u0002\u0010\u000bJ$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b\u00a8\u0006\u0010"}, d2 = {"Lcommon/response/ResponseFactory;", "", "<init>", "()V", "success", "Lcommon/response/ApiResponse;", "T", "message", "", "details", "data", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcommon/response/ApiResponse;", "error", "", "statusCode", "", "ledger"})
public final class ResponseFactory {
    @org.jetbrains.annotations.NotNull()
    public static final common.response.ResponseFactory INSTANCE = null;
    
    private ResponseFactory() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>common.response.ApiResponse<T> success(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String details, T data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final common.response.ApiResponse error(int statusCode, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String details) {
        return null;
    }
}