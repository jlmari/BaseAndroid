package com.jlmari.baseandroid.utils

import android.app.Fragment.instantiate
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment

/**
 * Method to create a new fragment instance of any [Fragment].
 *
 * @param context The [Context] required to initialize the new instance
 * @param params The [Bundle] with extra parameters if needed by the new instance
 * @return The new [Fragment] instance
 */
inline fun <reified F : Fragment> newFragmentInstance(
    context: Context?,
    params: Bundle? = Bundle.EMPTY
) = instantiate(context, F::class.java.name, params) as F
