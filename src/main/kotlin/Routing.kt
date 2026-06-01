package com.cashi

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject
import routes.transactionRoutes
import service.FeeCalculator
import service.IdempotencyStore
import service.TransactionFeeService

fun Application.configureRouting() {

    val transactionService by inject<TransactionFeeService>()
    val idempotencyStore by inject<IdempotencyStore>()

    routing {
        transactionRoutes(
            transactionService,
            idempotencyStore = idempotencyStore
        )
    }
}