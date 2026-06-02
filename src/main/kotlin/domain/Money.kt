package domain

import enums.Asset
import java.math.BigDecimal
import java.math.RoundingMode

data class Money(
    val amount: BigDecimal,
    val asset: Asset
) {
    init {
        require(amount > BigDecimal.ZERO) {
            "Amount must be greater than zero"
        }

        require(amount.scale() <= asset.scale) {
            "Amount scale exceeds supported scale for ${asset.name}"
        }
    }

    fun toMinorUnits(): Long {
        return amount
            .movePointRight(asset.scale)
            .setScale(0, RoundingMode.UNNECESSARY)
            .longValueExact()
    }

    fun percentage(rate: BigDecimal): Money {
        val fee = amount
            .multiply(rate)
            .setScale(asset.scale, RoundingMode.HALF_UP)

        return Money(
            amount = fee,
            asset = asset
        )
    }
}