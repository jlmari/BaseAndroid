package com.jlmari.memorydatasource.utils

import android.content.SharedPreferences
import com.jlmari.domain.models.EntityModel

/**
 * Method to clear all keys and values in [SharedPreferences].
 */
fun SharedPreferences.clearAll() = edit().clear().apply()

/**
 * Method used to save a [Boolean] with a identifier-key [String] in [SharedPreferences].
 *
 * @param key The [String] identifier of the saved [Boolean]
 * @param value The [Boolean] to be saved
 */
fun SharedPreferences.put(key: String, value: Boolean) = edit().putBoolean(key, value).apply()

/**
 * Method used to save a [String] with a identifier-key [String] in [SharedPreferences].
 *
 * @param key The [String] identifier of the saved [String]
 * @param value The [String] to be saved
 */
fun SharedPreferences.put(key: String, value: String) = edit().putString(key, value).apply()

/**
 * Method used to save a [Int] with a identifier-key [String] in [SharedPreferences].
 *
 * @param key The [String] identifier of the saved [Int]
 * @param value The [Int] to be saved
 */
fun SharedPreferences.put(key: String, value: Int) = edit().putInt(key, value).apply()

/**
 * Method used to save a [Long] with a identifier-key [String] in [SharedPreferences].
 *
 * @param key The [String] identifier of the saved [Long]
 * @param value The [Long] to be saved
 */
fun SharedPreferences.put(key: String, value: Long) = edit().putLong(key, value).apply()

/**
 * Method used to save a [Float] with a identifier-key [String] in [SharedPreferences].
 *
 * @param key The [String] identifier of the saved [Float]
 * @param value The [Float] to be saved
 */
fun SharedPreferences.put(key: String, value: Float) = edit().putFloat(key, value).apply()

/**
 * Method used to save a [EntityModel] with a identifier-key [String] in [SharedPreferences].
 *
 * @param key The [String] identifier of the saved [EntityModel]
 * @param value The [EntityModel] to be saved
 */
fun SharedPreferences.put(key: String, value: EntityModel?) = edit().putString(key, value?.toString()).apply()

/**
 * Method used to save a [List] of [EntityModel]s with a identifier-key [String] in [SharedPreferences].
 *
 * @param key The [String] identifier of the saved [List] of [EntityModel]s
 * @param value The [List] of [EntityModel]s to be saved
 */
fun SharedPreferences.put(key: String, value: List<EntityModel>?) = edit().putString(key, value?.toString()).apply()
