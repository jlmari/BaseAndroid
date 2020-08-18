package com.jlmari.baseandroid.application.di

import com.jlmari.apidatasource.ApiDataSourceImpl
import com.jlmari.baseandroid.application.scopes.PerApplication
import com.jlmari.data.datasources.ApiDataSource
import dagger.Binds
import dagger.Module

@Module
abstract class DataSourcesModule {

    @Binds
    @PerApplication
    abstract fun providesApiDataSource(apiDataSource: ApiDataSourceImpl): ApiDataSource
}
