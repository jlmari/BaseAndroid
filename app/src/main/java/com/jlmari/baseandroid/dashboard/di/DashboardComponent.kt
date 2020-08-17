package com.jlmari.baseandroid.dashboard.di

import com.jlmari.baseandroid.application.scopes.PerFragment
import com.jlmari.baseandroid.dashboard.DashboardFragment
import dagger.Subcomponent

@PerFragment
@Subcomponent(modules = [DashboardModule::class])
interface DashboardComponent {

    @Subcomponent.Builder
    interface Builder {

        fun build(): DashboardComponent
    }

    fun inject(fragment: DashboardFragment)
}
