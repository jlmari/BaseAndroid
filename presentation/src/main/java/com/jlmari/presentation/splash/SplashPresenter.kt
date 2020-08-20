package com.jlmari.presentation.splash

import com.jlmari.domain.usecases.GetTokenUseCase
import com.jlmari.presentation.base.BasePresenter
import javax.inject.Inject

class SplashPresenter @Inject constructor(
    private val getTokenUseCase: GetTokenUseCase
) : BasePresenter<SplashContract.View, SplashContract.Router>(), SplashContract.Presenter {

    override fun onCreate() {
        super.onCreate()
        val token = getTokenUseCase.execute()
        if (token.isNotBlank()) {
            routerAction { navigateToDashboard() }
        } else {
            routerAction { navigateToLogin() }
        }
    }
}
