package com.jlmari.baseandroid.main.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H!\u00a2\u0006\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/jlmari/baseandroid/main/di/MainModule;", "", "()V", "bindsPresenter", "Lcom/jlmari/presentation/main/contract/MainContract$Presenter;", "mainPresenter", "Lcom/jlmari/presentation/main/presenter/MainPresenter;", "bindsPresenter$app_debug", "app_debug"})
@dagger.Module()
public abstract class MainModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.jlmari.baseandroid.application.scopes.PerActivity()
    @dagger.Binds()
    public abstract com.jlmari.presentation.main.contract.MainContract.Presenter bindsPresenter$app_debug(@org.jetbrains.annotations.NotNull()
    com.jlmari.presentation.main.presenter.MainPresenter mainPresenter);
    
    public MainModule() {
        super();
    }
}