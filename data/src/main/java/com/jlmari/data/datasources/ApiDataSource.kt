package com.jlmari.data.datasources

import com.jlmari.domain.models.ErrorModel
import com.jlmari.domain.models.UserModel
import com.jlmari.domain.utils.Response

interface ApiDataSource {

    suspend fun getAvailableEmails(): Response<List<String>, ErrorModel>

    suspend fun register(user: UserModel): Response<String, ErrorModel>

    suspend fun login(user: UserModel): Response<String, ErrorModel>

    suspend fun logout(user: UserModel): Response<Unit, ErrorModel>
}
