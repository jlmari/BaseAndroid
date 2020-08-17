package com.jlmari.baseandroid.application.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\f"}, d2 = {"Lcom/jlmari/baseandroid/application/di/AppComponent;", "", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "inject", "", "app", "Lcom/jlmari/baseandroid/application/App;", "mainComponentBuilder", "Lcom/jlmari/baseandroid/main/di/MainComponent$Builder;", "app_debug"})
@dagger.Component(modules = {com.jlmari.baseandroid.application.di.AppModule.class})
@com.jlmari.baseandroid.application.scopes.PerApplication()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.jlmari.baseandroid.application.App app);
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context getContext();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.jlmari.baseandroid.main.di.MainComponent.Builder mainComponentBuilder();
}