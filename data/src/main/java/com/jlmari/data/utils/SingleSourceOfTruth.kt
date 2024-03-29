package com.jlmari.data.utils

import com.jlmari.domain.utils.Failure
import com.jlmari.domain.utils.Response
import com.jlmari.domain.utils.Success
import com.jlmari.domain.utils.either

/**
 * Single source of truth pattern. Database serves as SSOT in this case. Network calls are used
 * to store the values in the database.
 */
suspend fun <V, E> singleSourceOfTruth(
    dbDataSource: suspend (Unit) -> Response<V, E>,
    apiDataSource: suspend (Unit) -> Response<V, E>,
    dbCallback: suspend (V) -> Response<V, E>
): Response<V, E> =
    dbDataSource(Unit).either(
        onSuccess = { Success(it) },
        onFailure = {
            apiDataSource(Unit).either(
                onSuccess = { apiResult -> dbCallback.invoke(apiResult) },
                onFailure = { error -> Failure(error) })
        }
    )
