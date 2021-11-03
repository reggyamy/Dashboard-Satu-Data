package com.reggya.dashboard.data

data class ApiResponse<out T>(val type: ApiResponseType, val data: T?, val message: String?){
    companion object{
        fun loading() = ApiResponse(ApiResponseType.LOADING, null, null)
        fun error(message: String?) = ApiResponse(ApiResponseType.ERROR, null, message)
        fun <T> success(value: T) = ApiResponse(ApiResponseType.SUCCESS, value, null)
    }
}

enum class ApiResponseType {
    LOADING, ERROR, SUCCESS
}


