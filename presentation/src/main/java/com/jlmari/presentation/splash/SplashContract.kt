package com.jlmari.presentation.splash

import com.jlmari.presentation.base.BaseContract

interface SplashContract {

    interface View : BaseContract.View

    interface Router : BaseContract.Router

    interface Presenter : BaseContract.Presenter<View, Router>
}
