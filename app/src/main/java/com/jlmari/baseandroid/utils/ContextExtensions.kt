package com.jlmari.baseandroid.utils

import android.content.Context
import com.jlmari.baseandroid.application.App

/**
 * Value of the Application [Context] of this specific [App].
 */
val Context.app: App
    get() = applicationContext as App
