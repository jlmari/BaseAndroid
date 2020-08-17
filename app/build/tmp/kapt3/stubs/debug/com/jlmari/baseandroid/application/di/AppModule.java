package com.jlmari.baseandroid.application.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/jlmari/baseandroid/application/di/AppModule;", "", "app", "Lcom/jlmari/baseandroid/application/App;", "(Lcom/jlmari/baseandroid/application/App;)V", "provideContext", "Landroid/content/Context;", "provideContext$app_debug", "app_debug"})
@dagger.Module()
public final class AppModule {
    private final com.jlmari.baseandroid.application.App app = null;
    
    @org.jetbrains.annotations.NotNull()
    @com.jlmari.baseandroid.application.scopes.PerApplication()
    @dagger.Provides()
    public final android.content.Context provideContext$app_debug() {
        return null;
    }
    
    public AppModule(@org.jetbrains.annotations.NotNull()
    com.jlmari.baseandroid.application.App app) {
        super();
    }
}