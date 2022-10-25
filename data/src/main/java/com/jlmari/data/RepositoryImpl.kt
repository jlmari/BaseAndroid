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

    override suspend fun getAvailableEmails(): Response<List<String>, ErrorModel> =
        apiDataSource.getAvailableEmails()

    override suspend fun register(user: UserModel): Response<Unit, ErrorModel> =
        apiDataSource.register(user).map {
            storeUserData(user.email, it)
            memoryDataSource.token = it
        }

    override suspend fun login(user: UserModel): Response<Unit, ErrorModel> =
        apiDataSource.login(user).map {
            storeUserData(user.email, it)
            memoryDataSource.token = it
        }

    override suspend fun logout(): Response<Unit, ErrorModel> =
        apiDataSource.logout(UserModel(memoryDataSource.email, memoryDataSource.token)).map {
            memoryDataSource.token = ""
        }

    override fun getToken(): String =
        memoryDataSource.token

    private fun storeUserData(email: String, token: String) {
        with(memoryDataSource) {
            this.email = email
            this.token = token
        }
    }
}
