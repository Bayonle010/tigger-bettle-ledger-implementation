package enums

enum class TransactionState (
    val displayName: String,
){
    PENDING("PENDING"),
    PROCESSING("PROCESSING"),
    COMPLETED("COMPLETED"),
    FAILED("FAILED"),
    REVERSED("REVERSED")
}