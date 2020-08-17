package com.jlmari.presentation.splash

import com.jlmari.presentation.base.BasePresenter
import javax.inject.Inject

class SplashPresenter @Inject constructor() :
    BasePresenter<SplashContract.View, SplashContract.Router>(),
    SplashContract.Presenter {
}
