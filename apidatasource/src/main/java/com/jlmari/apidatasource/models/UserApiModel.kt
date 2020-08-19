package com.jlmari.apidatasource.models

import com.google.gson.annotations.SerializedName

data class UserApiModel(
    @SerializedName("email")
    val email: String,
    @SerializedName("password")
    val password: String)
