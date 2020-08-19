package com.jlmari.presentation.login

import com.jlmari.presentation.base.BaseContract

interface LoginContract {

    interface View : BaseContract.View {

        fun setLoginButtonEnabled(isEnabled: Boolean)

        fun showError(message: String)
    }

    interface Router : BaseContract.Router {

        fun navigateToDashboard()
    }

    interface Presenter : BaseContract.Presenter<View, Router> {

        fun onEmailEdited(email: String)

        fun onPasswordEdited(password: String)

        fun onLoginButtonClicked()
    }
}
