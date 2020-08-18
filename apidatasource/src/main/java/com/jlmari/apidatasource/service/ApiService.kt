package com.jlmari.apidatasource.service

import com.jlmari.domain.models.UserModel
import retrofit2.http.POST

interface ApiService {

    @POST("register")
    suspend fun register(userModel: UserModel): String

    @POST("login")
    suspend fun login(userModel: UserModel): String

    @POST("logout")
    suspend fun logout(userModel: UserModel): UserModel
}
