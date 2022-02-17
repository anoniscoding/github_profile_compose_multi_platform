package com.oozou.common.util

import retrofit2.HttpException

suspend fun <T> tryApiCall(apiCall: suspend () -> T): T {
    return try {
        apiCall()
    } catch (throwable: Throwable) {
        when (throwable) {
            is HttpException -> {
                throw resolveHttpException(throwable)
            }
            else -> throw Exception(throwable.message)
        }
    }
}

fun resolveHttpException(exception: HttpException): Exception {
    return when(exception.code()) {
        401 -> AuthorizationException(exception.message())
        else -> exception
    }
}

class AuthorizationException(message: String): Exception()