package com.jlmari.baseandroid.application

import android.app.Application
import com.jlmari.baseandroid.application.di.AppComponent
import com.jlmari.baseandroid.application.di.AppModule
import com.jlmari.baseandroid.application.di.DaggerAppComponent

class App : Application() {

    val component: AppComponent by lazy {
        DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        component.inject(this)
    }
}
