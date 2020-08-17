package com.jlmari.baseandroid.behaviours;

import java.lang.System;

/**
 * Behaviour that should be implemented for all the views that requires a progress [DialogFragment].
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000fX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0017"}, d2 = {"Lcom/jlmari/baseandroid/behaviours/ProgressDialogBehaviour;", "", "progressDialog", "Landroidx/fragment/app/DialogFragment;", "getProgressDialog", "()Landroidx/fragment/app/DialogFragment;", "setProgressDialog", "(Landroidx/fragment/app/DialogFragment;)V", "progressDialogFragmentManager", "Landroidx/fragment/app/FragmentManager;", "getProgressDialogFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "setProgressDialogFragmentManager", "(Landroidx/fragment/app/FragmentManager;)V", "progressDialogLifecycle", "Landroidx/lifecycle/Lifecycle;", "getProgressDialogLifecycle", "()Landroidx/lifecycle/Lifecycle;", "setProgressDialogLifecycle", "(Landroidx/lifecycle/Lifecycle;)V", "dismissProgressDialog", "", "showProgressDialog", "app_debug"})
public abstract interface ProgressDialogBehaviour {
    
    @org.jetbrains.annotations.Nullable()
    public abstract androidx.fragment.app.DialogFragment getProgressDialog();
    
    public abstract void setProgressDialog(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.DialogFragment p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.fragment.app.FragmentManager getProgressDialogFragmentManager();
    
    public abstract void setProgressDialogFragmentManager(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.Lifecycle getProgressDialogLifecycle();
    
    public abstract void setProgressDialogLifecycle(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Lifecycle p0);
    
    /**
     * Method to show the loading inside the [DialogFragment].
     */
    public abstract void showProgressDialog();
    
    /**
     * Method to hide the loading safely.
     */
    public abstract void dismissProgressDialog();
    
    /**
     * Behaviour that should be implemented for all the views that requires a progress [DialogFragment].
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        /**
         * Method to show the loading inside the [DialogFragment].
         */
        public static void showProgressDialog(com.jlmari.baseandroid.behaviours.ProgressDialogBehaviour $this) {
        }
        
        /**
         * Method to hide the loading safely.
         */
        public static void dismissProgressDialog(com.jlmari.baseandroid.behaviours.ProgressDialogBehaviour $this) {
        }
    }
}