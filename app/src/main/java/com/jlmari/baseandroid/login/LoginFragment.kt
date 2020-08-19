package com.jlmari.baseandroid.login

import android.widget.Toast
import androidx.core.widget.doOnTextChanged
import androidx.navigation.fragment.findNavController
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
        tietEmail.doOnTextChanged { text, _, _, _ ->
            presenter.onEmailEdited(text?.toString() ?: "")
        }
        tietPassword.doOnTextChanged { text, _, _, _ ->
            presenter.onPasswordEdited(text?.toString() ?: "")
        }
        btnLogin.setOnClickListener { presenter.onLoginButtonClicked() }
        btnRegister.setOnClickListener { presenter.onRegisterButtonClicked() }
    }

    override fun setLoginButtonEnabled(isEnabled: Boolean) {
        btnLogin.isEnabled = isEnabled
    }

    override fun setRegisterButtonEnabled(isEnabled: Boolean) {
        btnRegister.isEnabled = isEnabled
    }

    override fun showProgress() {
        showProgressDialog()
    }

    override fun hideProgress() {
        dismissProgressDialog()
    }

    override fun showError(message: String) {
        context?.let { Toast.makeText(it, message, Toast.LENGTH_LONG).show() }
    }

    override fun navigateToDashboard() {
        val direction = LoginFragmentDirections.actionLoginFragmentToDashboardFragment()
        findNavController().navigate(direction)
    }
}
