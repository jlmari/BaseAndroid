package com.jlmari.baseandroid.base

import android.app.Dialog
import android.content.Context
import android.os.Bundle

/**
 * Base dialog that must be extended by all dialogs.
 */
abstract class BaseDialog @JvmOverloads constructor(
    context: Context,
    theme: Int = android.R.style.TextAppearance_Material_DialogWindowTitle
) : Dialog(context, theme) {

    /**
     * Specify the layout resource ID to be inflated in the [BaseActivity.onCreate] method.
     */
    abstract val layoutResourceId: Int

    /**
     * Override this if you need to change the logic for cancel in general.
     */
    val isCancelable: Boolean
        get() = true

    /**
     * Override this if you need to change the logic for cancel when you touch outside.
     */
    val isCancelableOnTouchOutside: Boolean
        get() = false

    /**
     * Dialog lifecycle method onCreate().
     * 1) Set layout resource
     * 2) Init views and setup listeners
     * 3) Init default values
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set layout
        setContentView(layoutResourceId)

        // Init views
        initViews()

        // Setup listeners
        setupListeners()

        // Init dialog with default values
        setCancelable(isCancelable)
        setCanceledOnTouchOutside(isCancelableOnTouchOutside)
    }

    /**
     * This method is executed on [BaseDialog.onCreate] to init views.
     * It's an optional method, so those extending dialogs that may need it can override it.
     */
    open fun initViews() {
    }

    /**
     * This method is executed on [BaseDialog.onCreate] to setup view listeners.
     * It's an optional method, so those extending dialogs that may need it can override it.
     */
    open fun setupListeners() {
    }
}
