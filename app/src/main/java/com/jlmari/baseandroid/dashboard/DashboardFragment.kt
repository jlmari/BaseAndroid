package com.jlmari.baseandroid.dashboard

import androidx.navigation.fragment.findNavController
import com.jlmari.baseandroid.R
import com.jlmari.baseandroid.application.di.AppComponent
import com.jlmari.baseandroid.base.BaseFragment
import com.jlmari.presentation.dashboard.DashboardContract
import kotlinx.android.synthetic.main.fr_dashboard.*

class DashboardFragment :
    BaseFragment<DashboardContract.View, DashboardContract.Router, DashboardContract.Presenter>(),
    DashboardContract.View, DashboardContract.Router {

    override val layoutResId = R.layout.fr_dashboard

    override fun injectDependencies(appComponent: AppComponent?) {
        appComponent?.dashboardComponentBuilder()
            ?.build()
            ?.inject(this)
    }

    override fun setupListeners() {
        super.setupListeners()
        btnLogout.setOnClickListener { presenter.onLogoutButtonClicked() }
    }

    override fun showToken(token: String) {
        tvToken.append(token)
    }

    override fun navigateToLogin() {
        val direction = DashboardFragmentDirections.actionDashboardFragmentToLoginFragment()
        findNavController().navigate(direction)
    }
}
