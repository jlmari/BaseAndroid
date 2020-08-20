package com.jlmari.domain.repositories

import com.jlmari.domain.models.ErrorModel
import com.jlmari.domain.models.UserModel
import com.jlmari.domain.utils.Response

interface Repository {

    suspend fun register(user: UserModel): Response<Unit, ErrorModel>

    suspend fun login(user: UserModel): Response<Unit, ErrorModel>

    suspend fun logout(user: UserModel): Response<Unit, ErrorModel>

    fun getToken(): String
}