package com.jlmari.memorydatasource.utils

import android.util.Log
import com.google.gson.GsonBuilder
import com.google.gson.JsonSyntaxException
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type

/**
 * Default Gson parser, used for store and retrieve our Entity Models in SharedPreferences.
 */
private val gson by lazy { GsonBuilder().create() }

/**
 * Method to convert [Any] object to a JSON in [String] format.
 *
 * @return The resulting JSON [String]
 */
fun Any.toJsonString(): String = gson.toJson(this)

/**
 * Method to convert a JSON [String] to a some [Object] if possible.
 *
 * @param klass A [Class] of some [Object] that we want to obtain from the conversion
 * @return The desired [Object] if the conversion was successfully, null otherwise
 */
fun <T> String.fromJsonString(klass: Class<T>): T? {
    var result: T? = null
    try {
        result = gson.fromJson(this, klass)
    } catch (e: JsonSyntaxException) {
        manageParseJsonException(e, false)
    } catch (e: NullPointerException) {
        manageParseJsonException(e, false)
    }
    return result
}

/**
 * Method to convert a JSON [String] to a some [List] of [Object]s if possible.
 *
 * @param klass A [Class] of some [Object] that we want to obtain a [List] from the conversion
 * @return The desired [List] of [Object]s if the conversion was successfully, null otherwise
 */
fun <T> String.fromJsonList(klass: Class<T>): List<T>? {
    var result: List<T>? = null
    try {
        result = gson.fromJson(this, GsonGenericList(klass))
    } catch (e: JsonSyntaxException) {
        manageParseJsonException(e, true)
    } catch (e: NullPointerException) {
        manageParseJsonException(e, true)
    }

    return result
}

/**
 * Method to log the error when converting JSON [String].
 *
 * @param exception The [Exception] provoked when trying to convert unsuccessfully the JSON
 * @param isList The [Boolean] that indicates if the [Exception] occurred converting a [List] or not
 */
private fun manageParseJsonException(exception: Exception, isList: Boolean) {
    Log.e("GsonExtensions", "Error fromJson" + (if (isList) "List" else "") + ": " + exception)
}

/**
 * Class to help the conversion of any generic JSON [String] to a [List] of some [Object] using wrapped [Class].
 */
private class GsonGenericList<X>(private val wrapped: Class<X>) : ParameterizedType {

    override fun getRawType(): Type = List::class.java

    override fun getOwnerType(): Type? = null

    override fun getActualTypeArguments(): Array<Type> = arrayOf(wrapped)
}
