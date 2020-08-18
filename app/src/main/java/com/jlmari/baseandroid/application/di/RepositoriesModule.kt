package com.jlmari.baseandroid.application.di

import com.jlmari.baseandroid.application.scopes.PerApplication
import com.jlmari.data.RepositoryImpl
import com.jlmari.domain.repositories.Repository
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoriesModule {

    @Binds
    @PerApplication
    abstract fun provideRepository(repository: RepositoryImpl): Repository
}
