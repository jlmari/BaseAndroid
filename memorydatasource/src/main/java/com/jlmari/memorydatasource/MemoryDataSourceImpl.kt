package com.jlmari.memorydatasource

import android.content.Context
import androidx.annotation.StringDef
import com.jlmari.data.datasources.MemoryDataSource
import com.jlmari.memorydatasource.base.SharedPreferencesDataSource
import javax.inject.Inject

class MemoryDataSourceImpl @Inject constructor(context: Context) :
    SharedPreferencesDataSource(context), MemoryDataSource {

    override var token: String
        get() = get(@Key TOKEN, "")
        set(value) {
            put(@Key TOKEN, value)
        }

    /**
     * Constant values and keys for stored data in [SharedPreferencesDataSource]
     */
    @Target(AnnotationTarget.EXPRESSION)
    @Retention(AnnotationRetention.SOURCE)
    @StringDef(
        TOKEN
    )
    annotation class Key

    companion object {
        /** Shared preferences keys */
        private const val TOKEN = "TOKEN"
    }
}
