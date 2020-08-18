package com.jlmari.domain.usecases

import com.jlmari.domain.models.UserModel
import com.jlmari.domain.repositories.Repository
import javax.inject.Inject

class LoginUseCase @Inject constructor(private val repository: Repository) {

    // TODO: Add io dispatcher coroutine
    suspend fun execute(user: UserModel) = repository.login(user)
}
