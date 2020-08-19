package com.jlmari.apidatasource

import com.jlmari.apidatasource.client.ApiClient
import com.jlmari.apidatasource.mappers.UserInMapper
import com.jlmari.apidatasource.service.ApiService
import com.jlmari.apidatasource.utils.safeApiCall
import com.jlmari.data.datasources.ApiDataSource
import com.jlmari.domain.models.ErrorModel
import com.jlmari.domain.models.UserModel
import com.jlmari.domain.utils.Response
import javax.inject.Inject

class ApiDataSourceImpl @Inject constructor(
    apiClient: ApiClient,
    private val userInMapper: UserInMapper
) : ApiDataSource {

    private val apiService: ApiService = apiClient.service

    override suspend fun register(user: UserModel): Response<String, ErrorModel> {
        return safeApiCall { apiService.register(userInMapper.map(user)).token }
    }

    override suspend fun login(user: UserModel): Response<String, ErrorModel> {
        return safeApiCall { apiService.login(userInMapper.map(user)).token }
    }

    override suspend fun logout(user: UserModel): Response<Unit, ErrorModel> {
        return safeApiCall { apiService.logout(userInMapper.map(user)) }
    }
}
