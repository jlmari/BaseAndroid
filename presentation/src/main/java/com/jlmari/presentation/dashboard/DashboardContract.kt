package com.jlmari.presentation.dashboard

import com.jlmari.presentation.base.BaseContract

interface DashboardContract {

    interface View : BaseContract.View

    interface Router : BaseContract.Router

    interface Presenter : BaseContract.Presenter<View, Router>
}
