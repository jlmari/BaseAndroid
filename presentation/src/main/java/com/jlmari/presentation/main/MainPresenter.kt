package com.jlmari.presentation.main

import com.jlmari.presentation.base.BasePresenter
import javax.inject.Inject

class MainPresenter @Inject constructor() : BasePresenter<MainContract.View, MainContract.Router>(),
    MainContract.Presenter {
}
