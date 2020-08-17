package com.jlmari.baseandroid.splash.di

import com.jlmari.baseandroid.application.scopes.PerFragment
import com.jlmari.presentation.splash.SplashContract
import com.jlmari.presentation.splash.SplashPresenter
import dagger.Binds
import dagger.Module

@Module
abstract class SplashModule {

    @Binds
    @PerFragment
    internal abstract fun bindsPresenter(presenter: SplashPresenter): SplashContract.Presenter
}
