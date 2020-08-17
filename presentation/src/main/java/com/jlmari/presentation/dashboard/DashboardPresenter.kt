package com.jlmari.presentation.dashboard

import com.jlmari.presentation.base.BasePresenter
import javax.inject.Inject

class DashboardPresenter @Inject constructor() :
    BasePresenter<DashboardContract.View, DashboardContract.Router>(),
    DashboardContract.Presenter {
}
