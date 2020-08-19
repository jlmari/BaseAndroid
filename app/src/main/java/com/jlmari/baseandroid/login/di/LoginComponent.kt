package com.jlmari.baseandroid.login.di

import com.jlmari.baseandroid.application.scopes.PerFragment
import com.jlmari.baseandroid.login.LoginFragment
import dagger.Subcomponent

@PerFragment
@Subcomponent(modules = [LoginModule::class])
interface LoginComponent {

    @Subcomponent.Builder
    interface Builder {

        fun build(): LoginComponent
    }

    fun inject(fragment: LoginFragment)
}
