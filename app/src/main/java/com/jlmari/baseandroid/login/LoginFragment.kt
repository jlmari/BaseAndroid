package com.jlmari.baseandroid.login

import android.widget.Toast
import androidx.core.widget.doOnTextChanged
import com.jlmari.baseandroid.R
import com.jlmari.baseandroid.application.di.AppComponent
import com.jlmari.baseandroid.base.BaseFragment
import com.jlmari.presentation.login.LoginContract
import kotlinx.android.synthetic.main.fr_login.*

class LoginFragment :
    BaseFragment<LoginContract.View, LoginContract.Router, LoginContract.Presenter>(),
    LoginContract.View, LoginContract.Router {

    override val layoutResId = R.layout.fr_login

    override fun injectDependencies(appComponent: AppComponent?) {
        appComponent?.loginComponentBuilder()
            ?.build()
            ?.inject(this)
    }

    override fun setupListeners() {
        super.setupListeners()
        tietEmail.doOnTextChanged { text, start, before, count ->
            presenter.onEmailEdited(text?.toString() ?: "")
        }
        tietPassword.doOnTextChanged { text, start, before, count ->
            presenter.onPasswordEdited(text?.toString() ?: "")
        }
        btnLogin.setOnClickListener { presenter.onLoginButtonClicked() }
    }

    override fun setLoginButtonEnabled(isEnabled: Boolean) {
        btnLogin.isEnabled = isEnabled
    }

    override fun showError(message: String) {
        context?.let {
            Toast.makeText(it, message, Toast.LENGTH_LONG).show()
        }
    }

    override fun navigateToDashboard() {

    }
}
