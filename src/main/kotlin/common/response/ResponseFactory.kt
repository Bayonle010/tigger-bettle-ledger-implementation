package common.response

import java.time.Instant

object ResponseFactory {

    fun <T> success(
        message: String,
        details: String,
        data: T
    ): ApiResponse<T> {
        return ApiResponse(
            status = true,
            statusCode = 0,
            message = message,
            details = details,
            data = data,
            timeStamp = Instant.now().toString()
        )
    }

    fun error(
        statusCode: Int,
        message: String,
        details: String
    ): ApiResponse<Nothing> {
        return ApiResponse(
            status = false,
            statusCode = 99,
            message = message,
            details = details,
            data = null,
            timeStamp = Instant.now().toString()
        )
    }
}