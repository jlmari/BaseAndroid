package com.jlmari.baseandroid.main

import com.jlmari.baseandroid.R
import com.jlmari.baseandroid.application.di.AppComponent
import com.jlmari.baseandroid.base.BaseActivity
import com.jlmari.presentation.main.MainContract

class MainActivity : BaseActivity<MainContract.View, MainContract.Router, MainContract.Presenter>(),
    MainContract.View, MainContract.Router {

    override val layoutResId = R.layout.ac_main

    override fun injectDependencies(appComponent: AppComponent?) {
        appComponent?.mainComponentBuilder()
            ?.build()
            ?.inject(this)
    }
}
