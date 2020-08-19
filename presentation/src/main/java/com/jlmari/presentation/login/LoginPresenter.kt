package com.jlmari.presentation.login

import com.jlmari.domain.dispatchers.AppDispatchers
import com.jlmari.domain.models.UserModel
import com.jlmari.domain.usecases.LoginUseCase
import com.jlmari.domain.utils.either
import com.jlmari.presentation.base.BasePresenter
import com.jlmari.presentation.utils.isValidEmail
import com.jlmari.presentation.utils.isValidPassword
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import javax.inject.Inject

class LoginPresenter @Inject constructor(
    appDispatchers: AppDispatchers,
    private val loginUseCase: LoginUseCase
) :
    BasePresenter<LoginContract.View, LoginContract.Router>(),
    LoginContract.Presenter {

    private val errorHandler: CoroutineExceptionHandler by lazy { CoroutineExceptionHandler { _, e -> e.printStackTrace() } }
    private val scope: CoroutineScope by lazy { CoroutineScope(appDispatchers.main + SupervisorJob() + errorHandler) }

    private var inputEmail: String = ""
    private var inputPassword: String = ""

    override fun onEmailEdited(email: String) {
        inputEmail = email
        validateInputs()
    }

    override fun onPasswordEdited(password: String) {
        inputPassword = password
        validateInputs()
    }

    private fun validateInputs() {
        if (inputEmail.isValidEmail() && inputPassword.isValidPassword()) {
            viewAction { setLoginButtonEnabled(true) }
        } else {
            viewAction { setLoginButtonEnabled(false) }
        }
    }

    override fun onLoginButtonClicked() {
        scope.launch {
            val request = loginUseCase.execute(UserModel(inputEmail, inputPassword))
            request.either(
                onSuccess = {
                    routerAction { navigateToDashboard() }
                }, onFailure = {
                    viewAction { showError(it.message ?: "Login error") }
                }
            )
        }
    }
}
