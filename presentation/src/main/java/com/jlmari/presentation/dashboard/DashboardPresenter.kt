package com.jlmari.presentation.dashboard

import com.jlmari.domain.usecases.GetTokenUseCase
import com.jlmari.presentation.base.BasePresenter
import javax.inject.Inject

class DashboardPresenter @Inject constructor(private val getTokenUseCase: GetTokenUseCase) :
    BasePresenter<DashboardContract.View, DashboardContract.Router>(),
    DashboardContract.Presenter {

    private var token: String = ""

    override fun onCreate() {
        super.onCreate()
        token = getTokenUseCase.execute()
        viewAction { showToken(token) }
    }
}
