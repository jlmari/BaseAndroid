@file:Suppress("SameParameterValue")

package com.jlmari.memorydatasource.base

import android.content.Context
import android.content.SharedPreferences
import com.jlmari.domain.models.EntityModel
import com.jlmari.memorydatasource.utils.clearAll
import com.jlmari.memorydatasource.utils.put

abstract class SharedPreferencesDataSource(context: Context) {

    private val preferences: SharedPreferences by lazy {
        context.getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)
    }

    protected fun clearAll() = preferences.clearAll()

    protected fun put(key: String, value: Boolean) = preferences.put(key, value)

    protected fun put(key: String, value: String) = preferences.put(key, value)

    protected fun put(key: String, value: Int) = preferences.put(key, value)

    protected fun put(key: String, value: Long) = preferences.put(key, value)

    protected fun put(key: String, value: Float) = preferences.put(key, value)

    protected fun put(key: String, value: EntityModel?) = preferences.put(key, value)

    protected fun put(key: String, value: List<EntityModel>?) = preferences.put(key, value)

    protected fun get(key: String, defaultValue: Boolean): Boolean =
        preferences.getBoolean(key, defaultValue)

    protected fun get(key: String, defaultValue: String): String =
        preferences.getString(key, defaultValue) ?: defaultValue

    protected fun get(key: String, defaultValue: Int): Int = preferences.getInt(key, defaultValue)

    protected fun get(key: String, defaultValue: Long): Long =
        preferences.getLong(key, defaultValue)

    protected fun get(key: String, defaultValue: Float): Float =
        preferences.getFloat(key, defaultValue)

    companion object {
        private const val SHARED_PREFERENCES_NAME = "PRIVATE_SHARED_PREFERENCES"
    }
}
