package com.jlmari.presentation.dashboard

import com.jlmari.presentation.base.BaseContract

interface DashboardContract {

    interface View : BaseContract.View {

        fun showToken(token: String)
    }

    interface Router : BaseContract.Router

    interface Presenter : BaseContract.Presenter<View, Router>
}
