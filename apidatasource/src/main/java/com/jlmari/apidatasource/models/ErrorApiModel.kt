package com.jlmari.apidatasource.models

import com.google.gson.annotations.SerializedName

data class ErrorApiModel(
    @SerializedName("error")
    val errorMessage: String
)
