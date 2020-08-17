package com.jlmari.baseandroid.login

import com.jlmari.baseandroid.R
import com.jlmari.baseandroid.application.di.AppComponent
import com.jlmari.baseandroid.base.BaseFragment
import com.jlmari.presentation.login.LoginContract

class LoginFragment :
    BaseFragment<LoginContract.View, LoginContract.Router, LoginContract.Presenter>(),
    LoginContract.View, LoginContract.Router {

    override val layoutResId = R.layout.fr_login

    override fun injectDependencies(appComponent: AppComponent?) {
        appComponent?.loginComponentBuilder()
            ?.build()
            ?.inject(this)
    }
}
