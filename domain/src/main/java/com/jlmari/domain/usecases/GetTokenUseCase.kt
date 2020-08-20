package com.jlmari.domain.usecases

import com.jlmari.domain.repositories.Repository
import kotlinx.coroutines.withContext
import javax.inject.Inject

class GetTokenUseCase @Inject constructor(private val repository: Repository) {

    fun execute() = repository.getToken()
}
