package com.jlmari.baseandroid.application.di

import android.content.Context
import com.jlmari.baseandroid.application.App
import com.jlmari.baseandroid.application.scopes.PerApplication
import dagger.Module
import dagger.Provides

@Module
class AppModule(private val app: App) {

    @Provides
    @PerApplication
    internal fun provideContext(): Context = app
}
