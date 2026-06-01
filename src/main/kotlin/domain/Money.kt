package domain

import enums.Asset
import java.math.BigDecimal
import java.math.RoundingMode

class Money(
    val amount: BigDecimal,
    val asset: Asset
) {
    init {
        require(amount > BigDecimal.ZERO) { "Amount must be positive" }
    }

    fun percentage(rate: BigDecimal): Money{
        val fee = amount
            .multiply(rate)
            .setScale(asset.scale)
        return Money(fee, asset)
    }

}