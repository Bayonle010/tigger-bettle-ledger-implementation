package service

import dto.TransactionResponse
import java.util.UUID
import java.util.concurrent.ConcurrentHashMap

class IdempotencyStore {

    private val responses = ConcurrentHashMap<UUID, TransactionResponse>()

    fun get(key: UUID): TransactionResponse? {
        return responses[key]
    }

    fun save(
        key: UUID,
        response: TransactionResponse
    ): TransactionResponse {
        responses[key] = response
        return response
    }
}