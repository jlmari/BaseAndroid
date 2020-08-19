package com.jlmari.baseandroid.application.di

import android.content.Context
import com.jlmari.baseandroid.application.App
import com.jlmari.baseandroid.application.scopes.PerApplication
import com.jlmari.domain.dispatchers.AppDispatchers
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

@Module
class AppModule(private val app: App) {

    @Provides
    @PerApplication
    internal fun provideContext(): Context = app

    @Provides
    @PerApplication
    fun provideAppDispatchers(): AppDispatchers = object : AppDispatchers {
        override val main: CoroutineDispatcher = Dispatchers.Main
        override val io: CoroutineDispatcher = Dispatchers.IO
        override val default: CoroutineDispatcher = Dispatchers.Default
        override val unconfined: CoroutineDispatcher = Dispatchers.Unconfined
    }
}
