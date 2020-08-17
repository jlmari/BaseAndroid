package com.jlmari.baseandroid.main.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\u0018\u0000 \u00192\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00022\u00020\u0003:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J-\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00072\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016\u00a2\u0006\u0002\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u001a"}, d2 = {"Lcom/jlmari/baseandroid/main/views/MainActivity;", "Lcom/jlmari/baseandroid/base/views/BaseActivity;", "Lcom/jlmari/presentation/main/contract/MainContract$View;", "Lcom/jlmari/presentation/main/contract/MainContract$Router;", "Lcom/jlmari/presentation/main/contract/MainContract$Presenter;", "()V", "layoutResId", "", "getLayoutResId", "()I", "checkCameraAndWriteStoragePermissions", "", "injectDependencies", "", "appComponent", "Lcom/jlmari/baseandroid/application/di/AppComponent;", "navigateToCameraView", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "Companion", "app_debug"})
public final class MainActivity extends com.jlmari.baseandroid.base.views.BaseActivity<com.jlmari.presentation.main.contract.MainContract.View, com.jlmari.presentation.main.contract.MainContract.Router, com.jlmari.presentation.main.contract.MainContract.Presenter> implements com.jlmari.presentation.main.contract.MainContract.View, com.jlmari.presentation.main.contract.MainContract.Router {
    private final int layoutResId = com.jlmari.baseandroid.R.layout.ac_main;
    private static final int CAMERA_AND_WRITE_STORAGE_PERMISSIONS_ID = 100;
    public static final com.jlmari.baseandroid.main.views.MainActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutResId() {
        return 0;
    }
    
    @java.lang.Override()
    public void injectDependencies(@org.jetbrains.annotations.Nullable()
    com.jlmari.baseandroid.application.di.AppComponent appComponent) {
    }
    
    @java.lang.Override()
    public boolean checkCameraAndWriteStoragePermissions() {
        return false;
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    public void navigateToCameraView() {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/jlmari/baseandroid/main/views/MainActivity$Companion;", "", "()V", "CAMERA_AND_WRITE_STORAGE_PERMISSIONS_ID", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}