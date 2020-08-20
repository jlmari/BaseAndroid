package com.jlmari.data

import com.jlmari.data.datasources.ApiDataSource
import com.jlmari.data.datasources.MemoryDataSource
import com.jlmari.domain.models.ErrorModel
import com.jlmari.domain.models.UserModel
import com.jlmari.domain.repositories.Repository
import com.jlmari.domain.utils.Response
import com.jlmari.domain.utils.map
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val apiDataSource: ApiDataSource,
    private val memoryDataSource: MemoryDataSource
) : Repository {

    override suspend fun register(user: UserModel): Response<Unit, ErrorModel> {
        return apiDataSource.register(user).map {
            memoryDataSource.token = it
        }
    }

    override suspend fun login(user: UserModel): Response<Unit, ErrorModel> {
        return apiDataSource.login(user).map {
            memoryDataSource.token = it
        }
    }

    override suspend fun logout(user: UserModel): Response<Unit, ErrorModel> {
        return apiDataSource.logout(user)
    }

    override fun getToken(): String {
        return memoryDataSource.token
    }
}
