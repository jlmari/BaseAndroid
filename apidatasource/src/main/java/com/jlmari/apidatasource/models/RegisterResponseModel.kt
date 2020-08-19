package com.jlmari.apidatasource.models

import com.google.gson.annotations.SerializedName

data class RegisterResponseModel(
    @SerializedName("token")
    val token: String,
    @SerializedName("id")
    val id: String
)
