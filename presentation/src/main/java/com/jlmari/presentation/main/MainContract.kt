package com.jlmari.presentation.main

import com.jlmari.presentation.base.BaseContract

interface MainContract {

    interface View : BaseContract.View

    interface Router : BaseContract.Router

    interface Presenter : BaseContract.Presenter<View, Router>
}
