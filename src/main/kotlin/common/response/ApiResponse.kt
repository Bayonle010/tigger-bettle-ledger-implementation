package common.response

import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse<T>(
    val status: Boolean,
    val statusCode: Int,
    val message: String,
    val details: String?,
    val data: T?,
    val timeStamp: String
)
