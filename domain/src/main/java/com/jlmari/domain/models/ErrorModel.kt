package com.jlmari.domain.models

data class ErrorModel(
    val errorMessage: String? = null,
    val errorCode: Int? = null
) : Throwable()
