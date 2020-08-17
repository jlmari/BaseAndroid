package com.jlmari.presentation.login

import com.jlmari.presentation.base.BasePresenter
import com.jlmari.presentation.dashboard.DashboardContract
import javax.inject.Inject

class LoginPresenter @Inject constructor() :
    BasePresenter<LoginContract.View, LoginContract.Router>(),
    LoginContract.Presenter {
}
