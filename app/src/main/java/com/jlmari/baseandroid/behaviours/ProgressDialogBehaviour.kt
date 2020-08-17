package com.jlmari.baseandroid.behaviours

import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import com.jlmari.baseandroid.utils.hasValidActiveState

/**
 * Behaviour that should be implemented for all the views that requires a progress [DialogFragment].
 */
interface ProgressDialogBehaviour {

    var progressDialog: DialogFragment?
    var progressDialogFragmentManager: FragmentManager
    var progressDialogLifecycle: Lifecycle

    /**
     * Method to show the loading inside the [DialogFragment].
     */
    fun showProgressDialog() {
        val dialog = progressDialog ?: DialogFragment()
        dialog.show(progressDialogFragmentManager, "SHOW_DIALOG")
    }

    /**
     * Method to hide the loading safely.
     */
    fun dismissProgressDialog() {
        if (progressDialogLifecycle.hasValidActiveState()) {
            progressDialog?.dismissAllowingStateLoss()
        }
    }
}
