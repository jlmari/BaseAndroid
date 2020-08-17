package com.jlmari.baseandroid.dashboard.di

import com.jlmari.baseandroid.application.scopes.PerFragment
import com.jlmari.presentation.dashboard.DashboardContract
import com.jlmari.presentation.dashboard.DashboardPresenter
import dagger.Binds
import dagger.Module

@Module
abstract class DashboardModule {

    @Binds
    @PerFragment
    internal abstract fun bindsPresenter(presenter: DashboardPresenter): DashboardContract.Presenter
}
