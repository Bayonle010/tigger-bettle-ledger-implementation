package mapper

import domain.Fee
import domain.Money
import domain.Transaction
import dto.TransactionRequest
import dto.TransactionResponse
import java.util.UUID

object TransactionMapper {

    fun toDomain(
        request: TransactionRequest,
        idempotencyKey: UUID
    ): Transaction {
        return Transaction(
            id = UUID.randomUUID(),
            idempotencyKey = idempotencyKey,
            money = Money(
                amount = request.amount,
                asset = request.asset
            ),
            assetType = request.assetType,
            type = request.type,
            state = request.state,
            createdAt = request.createdAt
        )
    }

    fun toResponse(
        transaction: Transaction,
        fee: Fee
    ): TransactionResponse {
        return TransactionResponse(
            transactionId = transaction.id,
            amount = transaction.money.amount,
            asset = transaction.money.asset,
            type = transaction.type.displayName,
            fee = fee.money.amount,
            rate = fee.rate,
            description = fee.description
        )
    }
}