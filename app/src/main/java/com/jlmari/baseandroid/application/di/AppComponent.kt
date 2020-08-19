package com.jlmari.baseandroid.application.di

import android.content.Context
import com.jlmari.baseandroid.application.App
import com.jlmari.baseandroid.application.scopes.PerApplication
import com.jlmari.baseandroid.dashboard.di.DashboardComponent
import com.jlmari.baseandroid.login.di.LoginComponent
import com.jlmari.baseandroid.main.di.MainComponent
import com.jlmari.baseandroid.splash.di.SplashComponent
import dagger.Component

@PerApplication
@Component(
    modules = [AppModule::class, RepositoriesModule::class, DataSourcesModule::class, ApiDataSourceModule::class]
)
interface AppComponent {

    fun inject(app: App)

    val context: Context

    fun mainComponentBuilder(): MainComponent.Builder

    fun splashComponentBuilder(): SplashComponent.Builder

    fun loginComponentBuilder(): LoginComponent.Builder

    fun dashboardComponentBuilder(): DashboardComponent.Builder
}
