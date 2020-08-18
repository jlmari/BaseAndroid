package com.jlmari.apidatasource

import com.jlmari.apidatasource.client.ApiClient
import com.jlmari.apidatasource.service.ApiService
import com.jlmari.apidatasource.utils.safeApiCall
import com.jlmari.data.datasources.ApiDataSource
import com.jlmari.domain.models.ErrorModel
import com.jlmari.domain.models.UserModel
import com.jlmari.domain.utils.Response
import javax.inject.Inject

class ApiDataSourceImpl @Inject constructor(apiClient: ApiClient) : ApiDataSource {

    private val apiService: ApiService = apiClient.service

    override suspend fun register(user: UserModel): Response<String, ErrorModel> {
        return safeApiCall { apiService.register(user) }
    }

    override suspend fun login(user: UserModel): Response<String, ErrorModel> {
        return safeApiCall { apiService.login(user) }
    }

    override suspend fun logout(user: UserModel): Response<Unit, ErrorModel> {
        return safeApiCall { apiService.logout(user) }
    }
}
