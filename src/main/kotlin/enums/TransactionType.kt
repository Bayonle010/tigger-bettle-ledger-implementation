package enums

enum class TransactionType(
    val displayName: String,
) {
    MOBILE_TOP_UP("Mobile Top Up"),
    BILL_PAYMENT("Bill Payment"),
    BANK_TRANSFER("Bank Transfer"),
    CARD_PAYMENT("Card Payment"),
    CRYPTO_PURCHASE("Crypto Purchase")
}