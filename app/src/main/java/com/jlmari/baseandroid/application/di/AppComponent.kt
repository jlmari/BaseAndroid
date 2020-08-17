package com.jlmari.baseandroid.application.di

import android.content.Context
import com.jlmari.baseandroid.application.App
import com.jlmari.baseandroid.application.scopes.PerApplication
import com.jlmari.baseandroid.main.di.MainComponent
import dagger.Component

@PerApplication
@Component(
    modules = [AppModule::class]
)
interface AppComponent {

    fun inject(app: App)

    val context: Context

    fun mainComponentBuilder(): MainComponent.Builder
}
