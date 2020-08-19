package com.jlmari.apidatasource.service

import com.jlmari.apidatasource.models.LoginResponseModel
import com.jlmari.apidatasource.models.RegisterResponseModel
import com.jlmari.apidatasource.models.UserApiModel
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {

    @POST("api/register")
    suspend fun register(@Body user: UserApiModel): RegisterResponseModel

    @POST("api/login")
    suspend fun login(@Body user: UserApiModel): LoginResponseModel

    @POST("api/logout")
    suspend fun logout(@Body user: UserApiModel): String
}
