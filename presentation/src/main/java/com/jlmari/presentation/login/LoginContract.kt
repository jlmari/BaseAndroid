package com.jlmari.presentation.login

import com.jlmari.presentation.base.BaseContract

interface LoginContract {

    interface View : BaseContract.View

    interface Router : BaseContract.Router

    interface Presenter : BaseContract.Presenter<View, Router>
}
