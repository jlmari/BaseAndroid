package com.jlmari.baseandroid.dashboard

import com.jlmari.baseandroid.R
import com.jlmari.baseandroid.application.di.AppComponent
import com.jlmari.baseandroid.base.BaseFragment
import com.jlmari.presentation.dashboard.DashboardContract

class DashboardFragment :
    BaseFragment<DashboardContract.View, DashboardContract.Router, DashboardContract.Presenter>(),
    DashboardContract.View, DashboardContract.Router {

    override val layoutResId = R.layout.fr_dashboard

    override fun injectDependencies(appComponent: AppComponent?) {
        appComponent?.dashboardComponentBuilder()
            ?.build()
            ?.inject(this)
    }
}
