package com.jlmari.baseandroid.login

import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
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
        spEmail.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                presenter.onEmailSelected(position)
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Do nothing
            }
        }
        tietPassword.doOnTextChanged { text, _, _, _ ->
            presenter.onPasswordEdited(text?.toString() ?: "")
        }
        btnLogin.setOnClickListener { presenter.onLoginButtonClicked() }
        btnRegister.setOnClickListener { presenter.onRegisterButtonClicked() }
    }

    override fun showError(message: String?) {
        context?.let {
            Toast.makeText(
                it,
                message ?: getString(R.string.login_generic_error),
                Toast.LENGTH_LONG
            ).show()
        }
    }

    override fun showUsersEmailsSpinner(emails: List<String>) {
        context?.let { context ->
            val adapter =
                ArrayAdapter(context, android.R.layout.simple_spinner_item, emails).apply {
                    setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                }
            spEmail.adapter = adapter
        }
    }

    override fun setLoginButtonEnabled(isEnabled: Boolean) {
        btnLogin.isEnabled = isEnabled
    }

    override fun setRegisterButtonEnabled(isEnabled: Boolean) {
        btnRegister.isEnabled = isEnabled
    }

    override fun navigateToDashboard() {
        val direction = LoginFragmentDirections.actionLoginFragmentToDashboardFragment()
        findNavController().navigate(direction)
    }
}
