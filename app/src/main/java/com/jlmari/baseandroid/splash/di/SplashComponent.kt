package com.jlmari.baseandroid.splash.di

import com.jlmari.baseandroid.application.scopes.PerFragment
import com.jlmari.baseandroid.splash.SplashFragment
import dagger.Subcomponent

@PerFragment
@Subcomponent(modules = [SplashModule::class])
interface SplashComponent {

    @Subcomponent.Builder
    interface Builder {

        fun build(): SplashComponent
    }

    fun inject(fragment: SplashFragment)
}
