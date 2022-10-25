package com.jlmari.presentation.login

import com.jlmari.domain.dispatchers.AppDispatchers
import com.jlmari.domain.models.UserModel
import com.jlmari.domain.usecases.GetAvailableEmailsUseCase
import com.jlmari.domain.usecases.LoginUseCase
import com.jlmari.domain.usecases.RegisterUseCase
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
    private val getAvailableEmailsUseCase: GetAvailableEmailsUseCase,
    private val loginUseCase: LoginUseCase,
    private val registerUseCase: RegisterUseCase
) : BasePresenter<LoginContract.View, LoginContract.Router>(), LoginContract.Presenter {

    private val errorHandler: CoroutineExceptionHandler by lazy { CoroutineExceptionHandler { _, e -> e.printStackTrace() } }
    private val scope: CoroutineScope by lazy { CoroutineScope(appDispatchers.main + SupervisorJob() + errorHandler) }

    private var inputEmail: String = ""
    private var inputPassword: String = ""
    private var availableEmails = emptyList<String>()

    override fun onCreate() {
        super.onCreate()
        scope.launch {
            viewAction { showProgress() }
            val request = getAvailableEmailsUseCase.execute()
            request.either(
                onSuccess = {
                    availableEmails = it
                    viewAction { hideProgress() }
                    viewAction { showUsersEmailsSpinner(availableEmails) }
                }, onFailure = {
                    viewAction { hideProgress() }
                    viewAction { showError(it.errorMessage) }
                }
            )
        }
    }

    override fun onEmailSelected(emailPosition: Int) {
        inputEmail = availableEmails[emailPosition]
        validateInputs()
    }

    override fun onPasswordEdited(password: String) {
        inputPassword = password
        validateInputs()
    }

    private fun validateInputs() {
        viewAction {
            if (inputEmail.isValidEmail() && inputPassword.isValidPassword()) {
                setLoginButtonEnabled(true)
                setRegisterButtonEnabled(true)
            } else {
                setLoginButtonEnabled(false)
                setRegisterButtonEnabled(false)
            }
        }
    }

    override fun onLoginButtonClicked() {
        scope.launch {
            viewAction { showProgress() }
            val request = loginUseCase.execute(UserModel(inputEmail, inputPassword))
            request.either(
                onSuccess = {
                    viewAction { hideProgress() }
                    routerAction { navigateToDashboard() }
                }, onFailure = {
                    viewAction { hideProgress() }
                    viewAction { showError(it.errorMessage) }
                }
            )
        }
    }

    override fun onRegisterButtonClicked() {
        scope.launch {
            viewAction { showProgress() }
            val request = registerUseCase.execute(UserModel(inputEmail, inputPassword))
            request.either(
                onSuccess = {
                    viewAction { hideProgress() }
                    routerAction { navigateToDashboard() }
                }, onFailure = {
                    viewAction { hideProgress() }
                    viewAction { showError(it.errorMessage) }
                }
            )
        }
    }
}
