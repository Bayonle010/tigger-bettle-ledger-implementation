package routes

import common.exception.MissingIdempotencyKeyException
import common.http.IDEMPOTENCY_KEY_HEADER
import common.response.ResponseFactory
import dto.TransactionRequest
import io.ktor.http.HttpStatusCode
import io.ktor.server.request.receive
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.post
import mapper.TransactionMapper
import service.IdempotencyStore
import service.TransactionFeeService
import java.util.UUID

fun Route.transactionRoutes(
    transactionFeeService: TransactionFeeService,
    idempotencyStore: IdempotencyStore
) {
    post("/transaction/fee") {
        val idempotencyKey = call.request.headers[IDEMPOTENCY_KEY_HEADER]
            ?: throw MissingIdempotencyKeyException()

        val idempotencyKeyId = UUID.fromString(idempotencyKey)

        val existingResponse = idempotencyStore.get(idempotencyKeyId)

        if (existingResponse != null) {
            call.respond(
                HttpStatusCode.OK,
                ResponseFactory.success(
                    message = "Fee Retrieved Successfully",
                    details = "Duplicate request detected. Returning previous response.",
                    data = existingResponse
                )
            )
            return@post
        }

        val request = call.receive<TransactionRequest>()

        val transaction = TransactionMapper.toDomain(
            request = request,
            idempotencyKey = idempotencyKeyId
        )

        val fee = transactionFeeService.calculateFee(transaction)

        val response = TransactionMapper.toResponse(
            transaction = transaction,
            fee = fee
        )

        idempotencyStore.save(
            key = idempotencyKeyId,
            response = response
        )

        call.respond(
            HttpStatusCode.OK,
            ResponseFactory.success(
                message = "Fee Calculated Successfully",
                details = "Transaction fee processed successfully",
                data = response
            )
        )
    }
}