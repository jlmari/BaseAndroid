package com.jlmari.presentation.splash

import com.jlmari.presentation.base.BasePresenter
import javax.inject.Inject

class SplashPresenter @Inject constructor() :
    BasePresenter<SplashContract.View, SplashContract.Router>(),
    SplashContract.Presenter {

    override fun onCreate() {
        super.onCreate()
        // TODO: Example for navigation, the condition should take into account if already logged in
        if ((0..10).random() > 5) {
            routerAction { navigateToLogin() }
        } else {
            routerAction { navigateToDashboard() }
        }
    }
}
