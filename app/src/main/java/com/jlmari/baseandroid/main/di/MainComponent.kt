package com.jlmari.baseandroid.main.di

import com.jlmari.baseandroid.application.scopes.PerActivity
import com.jlmari.baseandroid.main.MainActivity
import dagger.Subcomponent

@PerActivity
@Subcomponent(modules = [MainModule::class])
interface MainComponent {

    @Subcomponent.Builder
    interface Builder {

        fun build(): MainComponent
    }

    fun inject(activity: MainActivity)
}
