package com.jlmari.domain.usecases

import com.jlmari.domain.dispatchers.AppDispatchers
import com.jlmari.domain.repositories.Repository
import kotlinx.coroutines.withContext
import javax.inject.Inject

class GetAvailableEmailsUseCase @Inject constructor(
    appDispatchers: AppDispatchers,
    private val repository: Repository
) {

    private val ioDispatcher = appDispatchers.io

    suspend fun execute() = withContext(ioDispatcher) {
        repository.getAvailableEmails()
    }
}
