package com.jlmari.presentation.splash

import com.jlmari.presentation.base.BaseContract

interface SplashContract {

    interface View : BaseContract.View

    interface Router : BaseContract.Router {

        fun navigateToLogin()

        fun navigateToDashboard()
    }

    interface Presenter : BaseContract.Presenter<View, Router>
}
