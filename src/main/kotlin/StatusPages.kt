package com.cashi

import common.exception.MissingIdempotencyKeyException
import common.response.ResponseFactory
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.application.log
import io.ktor.server.plugins.BadRequestException
import io.ktor.server.plugins.statuspages.StatusPages
import io.ktor.server.response.respond

fun Application.configureStatusPages() {
    install(StatusPages) {

        exception<MissingIdempotencyKeyException> { call, cause ->
            call.application.log.warn("Missing idempotency key", cause)

            call.respond(
                HttpStatusCode.BadRequest,
                ResponseFactory.error(
                    statusCode = 99,
                    message = "Missing Idempotency Key",
                    details = cause.message ?: "Idempotency-Key header is required"
                )
            )
        }

        exception<BadRequestException> { call, cause ->
            call.application.log.warn("Bad request", cause)

            call.respond(
                HttpStatusCode.BadRequest,
                ResponseFactory.error(
                    statusCode = 99,
                    message = "Invalid Request",
                    details = "Request body is invalid or cannot be deserialized"
                )
            )
        }

        exception<IllegalArgumentException> { call, cause ->
            call.application.log.warn("Validation error", cause)

            call.respond(
                HttpStatusCode.BadRequest,
                ResponseFactory.error(
                    statusCode = 99,
                    message = "Validation Error",
                    details = cause.message ?: "Invalid request"
                )
            )
        }

        exception<Throwable> { call, cause ->
            call.application.log.error("Unhandled application error", cause)

            call.respond(
                HttpStatusCode.InternalServerError,
                ResponseFactory.error(
                    statusCode = 99,
                    message = "Internal Server Error",
                    details = "An unexpected error occurred"
                )
            )
        }
    }
}