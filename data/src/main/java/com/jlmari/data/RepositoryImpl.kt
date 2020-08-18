package com.jlmari.data

import com.jlmari.data.datasources.ApiDataSource
import com.jlmari.domain.models.ErrorModel
import com.jlmari.domain.models.UserModel
import com.jlmari.domain.repositories.Repository
import com.jlmari.domain.utils.Response
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiDataSource: ApiDataSource) : Repository {

    override suspend fun register(user: UserModel): Response<String, ErrorModel> {
        return apiDataSource.register(user)
    }

    override suspend fun login(user: UserModel): Response<String, ErrorModel> {
        return apiDataSource.login(user)
    }

    override suspend fun logout(user: UserModel): Response<Unit, ErrorModel> {
        return apiDataSource.logout(user)
    }
}
