package com.jlmari.baseandroid.splash

import com.jlmari.baseandroid.R
import com.jlmari.baseandroid.application.di.AppComponent
import com.jlmari.baseandroid.base.BaseFragment
import com.jlmari.presentation.splash.SplashContract

class SplashFragment :
    BaseFragment<SplashContract.View, SplashContract.Router, SplashContract.Presenter>(),
    SplashContract.View, SplashContract.Router {

    override val layoutResId = R.layout.fr_splash

    override fun injectDependencies(appComponent: AppComponent?) {
        appComponent?.splashComponentBuilder()
            ?.build()
            ?.inject(this)
    }
}
