package com.jlmari.baseandroid.main.di

import com.jlmari.baseandroid.application.scopes.PerActivity
import com.jlmari.presentation.main.MainContract
import com.jlmari.presentation.main.MainPresenter
import dagger.Binds
import dagger.Module

@Module
abstract class MainModule {

    @Binds
    @PerActivity
    internal abstract fun bindsPresenter(mainPresenter: MainPresenter): MainContract.Presenter
}
