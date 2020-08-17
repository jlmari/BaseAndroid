package com.jlmari.baseandroid.login.di

import com.jlmari.baseandroid.application.scopes.PerFragment
import com.jlmari.presentation.login.LoginContract
import com.jlmari.presentation.login.LoginPresenter
import dagger.Binds
import dagger.Module

@Module
abstract class LoginModule {

    @Binds
    @PerFragment
    internal abstract fun bindsPresenter(presenter: LoginPresenter): LoginContract.Presenter
}
