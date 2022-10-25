package com.jlmari.presentation.login

import com.jlmari.presentation.base.BaseContract

interface LoginContract {

    interface View : BaseContract.View {

        fun showError(message: String?)

        fun showUsersEmailsSpinner(emails: List<String>)

        fun setLoginButtonEnabled(isEnabled: Boolean)

        fun setRegisterButtonEnabled(isEnabled: Boolean)
    }

    interface Router : BaseContract.Router {

        fun navigateToDashboard()
    }

    interface Presenter : BaseContract.Presenter<View, Router> {

        fun onEmailSelected(emailPosition: Int)

        fun onPasswordEdited(password: String)

        fun onLoginButtonClicked()

        fun onRegisterButtonClicked()
    }
}
