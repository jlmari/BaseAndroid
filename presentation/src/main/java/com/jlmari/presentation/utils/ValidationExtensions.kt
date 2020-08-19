package com.jlmari.presentation.utils

import android.util.Patterns

private const val MIN_LENGTH_PASSWORD = "^.{6,}"

fun String?.isValidEmail() = !isNullOrEmpty() && Patterns.EMAIL_ADDRESS.matcher(this).matches()

fun String?.isValidPassword() = !isNullOrEmpty() && MIN_LENGTH_PASSWORD.toPattern().matcher(this).matches()
