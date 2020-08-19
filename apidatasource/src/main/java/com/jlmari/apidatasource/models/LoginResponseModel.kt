package com.jlmari.apidatasource.models

import com.google.gson.annotations.SerializedName

data class LoginResponseModel(
    @SerializedName("token")
    val token: String
)
