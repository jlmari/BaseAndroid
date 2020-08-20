package com.jlmari.baseandroid.application.di

import com.jlmari.apidatasource.ApiDataSourceImpl
import com.jlmari.baseandroid.application.scopes.PerApplication
import com.jlmari.data.datasources.ApiDataSource
import com.jlmari.data.datasources.MemoryDataSource
import com.jlmari.memorydatasource.MemoryDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
abstract class DataSourcesModule {

    @Binds
    @PerApplication
    abstract fun providesApiDataSource(apiDataSource: ApiDataSourceImpl): ApiDataSource

    @Binds
    @PerApplication
    abstract fun providesMemoryDataSource(memoryDataSource: MemoryDataSourceImpl): MemoryDataSource
}
