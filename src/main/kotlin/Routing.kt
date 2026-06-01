package com.cashi

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import routes.transactionRoutes
import service.FeeCalculator
import service.IdempotencyStore
import service.TransactionFeeService

fun Application.configureRouting() {
    val feeCalculator = FeeCalculator()
    val idempotencyStore = IdempotencyStore()

    val transactionService = TransactionFeeService(feeCalculator)

    routing {
        transactionRoutes(transactionService,
            idempotencyStore = idempotencyStore
        )
    }
}