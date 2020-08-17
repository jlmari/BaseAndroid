package com.jlmari.baseandroid.base.views;

import java.lang.System;

/**
 * Base dialog that must be extended by all dialogs.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u000fH\u0016R\u0011\u0010\u0007\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\n\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0012\u0010\u000b\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0014"}, d2 = {"Lcom/jlmari/baseandroid/base/views/BaseDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "theme", "", "(Landroid/content/Context;I)V", "isCancelable", "", "()Z", "isCancelableOnTouchOutside", "layoutResourceId", "getLayoutResourceId", "()I", "initViews", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupListeners", "app_debug"})
public abstract class BaseDialog extends android.app.Dialog {
    
    /**
     * Specify the layout resource ID to be inflated in the [BaseActivity.onCreate] method.
     */
    public abstract int getLayoutResourceId();
    
    public final boolean isCancelable() {
        return false;
    }
    
    public final boolean isCancelableOnTouchOutside() {
        return false;
    }
    
    /**
     * Dialog lifecycle method onCreate().
     * 1) Set layout resource
     * 2) Init views and setup listeners
     * 3) Init default values
     */
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * This method is executed on [BaseDialog.onCreate] to init views.
     * It's an optional method, so those extending dialogs that may need it can override it.
     */
    public void initViews() {
    }
    
    /**
     * This method is executed on [BaseDialog.onCreate] to setup view listeners.
     * It's an optional method, so those extending dialogs that may need it can override it.
     */
    public void setupListeners() {
    }
    
    public BaseDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int theme) {
        super(null);
    }
    
    public BaseDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}