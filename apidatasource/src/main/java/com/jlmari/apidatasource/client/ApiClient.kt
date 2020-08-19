package com.jlmari.apidatasource.client

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.jlmari.apidatasource.service.ApiService
import com.jlmari.domain.flavors.Flavor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient(isDebug: Boolean, flavor: Flavor) {

    private val baseUrl = when (flavor) {
        Flavor.PRO -> URL_PRO
        Flavor.PRE -> URL_PRE
    }

    private val gson: Gson by lazy { GsonBuilder().create() }

    private val client by lazy {
        OkHttpClient().newBuilder()
            .addInterceptor(HttpLoggingInterceptor().apply {
                level = if (isDebug) HttpLoggingInterceptor.Level.BODY
                else HttpLoggingInterceptor.Level.NONE
            })
            .build()
    }

    val service: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(ApiService::class.java)
    }

    companion object {
        private const val URL_PRO = "https://reqres.in/"
        private const val URL_PRE = "https://reqres.in/"
    }
}
