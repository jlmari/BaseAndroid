package com.jlmari.baseandroid.application.di

import com.jlmari.apidatasource.client.ApiClient
import com.jlmari.baseandroid.BuildConfig
import com.jlmari.baseandroid.application.scopes.PerApplication
import dagger.Module
import dagger.Provides

@Module
class ApiDataSourceModule {

    @Provides
    @PerApplication
    fun provideApiClient(): ApiClient =
        ApiClient(BuildConfig.DEBUG, BuildConfig.FLAVOR_TAG)
}
