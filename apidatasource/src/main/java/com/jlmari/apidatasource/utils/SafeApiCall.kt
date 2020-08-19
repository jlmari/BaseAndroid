package com.jlmari.apidatasource.utils

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.jlmari.apidatasource.models.ErrorApiModel
import com.jlmari.domain.models.ErrorModel
import com.jlmari.domain.utils.Failure
import com.jlmari.domain.utils.Response
import com.jlmari.domain.utils.Success
import retrofit2.HttpException

/**
 * This function is used to wrap a [call] to an API in a safe way. The result is expressed as a
 * Coroutine Response which is a sealed class that contains the result of the operation.
 */
suspend fun <T> safeApiCall(
    call: suspend () -> T
): Response<T, ErrorModel> =
    try {
        val response = call()
        if (response == null) {
            Failure(ErrorModel(""))
        } else {
            Success(response)
        }
    } catch (exception: Exception) {
        when(exception) {
            is HttpException -> {
                val gson = Gson()
                val type = object : TypeToken<ErrorApiModel>() {}.type
                val error: ErrorApiModel? = gson.fromJson(exception.response()?.errorBody()?.charStream(), type)
                Failure(ErrorModel(error?.errorMessage ?: exception.message() ?: ""))
            }
            else -> Failure(ErrorModel(exception.message ?: ""))
        }
    }
