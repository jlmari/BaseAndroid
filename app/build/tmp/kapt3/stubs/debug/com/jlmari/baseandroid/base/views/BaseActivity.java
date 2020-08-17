package com.jlmari.baseandroid.base.views;

import java.lang.System;

/**
 * Base activity that must be extended by all activities.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\n\b\u0001\u0010\u0003 \u0000*\u00020\u0004*\u0014\b\u0002\u0010\u0005*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00062\u00020\u00072\u00020\u00022\u00020\u00042\u00020\bB\u0005\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020,H\u0016J\u0012\u0010-\u001a\u00020,2\b\u0010.\u001a\u0004\u0018\u00010/H&J\u0012\u00100\u001a\u00020,2\b\u00101\u001a\u0004\u0018\u000102H\u0014J\b\u00103\u001a\u00020,H\u0014J\b\u00104\u001a\u00020,H\u0014J\b\u00105\u001a\u00020,H\u0014J\r\u00106\u001a\u00028\u0002H\u0016\u00a2\u0006\u0002\u0010\u0011J\u0010\u00107\u001a\u00020,2\u0006\u00108\u001a\u000202H\u0016J\b\u00109\u001a\u00020,H\u0016R\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u00028\u00028\u0006@\u0006X\u0087.\u00a2\u0006\u0016\n\u0002\u0010\u0014\u0012\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u0006:"}, d2 = {"Lcom/jlmari/baseandroid/base/views/BaseActivity;", "V", "Lcom/jlmari/presentation/base/contract/BaseContract$View;", "R", "Lcom/jlmari/presentation/base/contract/BaseContract$Router;", "P", "Lcom/jlmari/presentation/base/contract/BaseContract$Presenter;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/jlmari/baseandroid/behaviours/ProgressDialogBehaviour;", "()V", "layoutResId", "", "getLayoutResId", "()I", "presenter", "presenter$annotations", "getPresenter", "()Lcom/jlmari/presentation/base/contract/BaseContract$Presenter;", "setPresenter", "(Lcom/jlmari/presentation/base/contract/BaseContract$Presenter;)V", "Lcom/jlmari/presentation/base/contract/BaseContract$Presenter;", "progressDialog", "Landroidx/fragment/app/DialogFragment;", "getProgressDialog", "()Landroidx/fragment/app/DialogFragment;", "setProgressDialog", "(Landroidx/fragment/app/DialogFragment;)V", "progressDialogFragmentManager", "Landroidx/fragment/app/FragmentManager;", "getProgressDialogFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "setProgressDialogFragmentManager", "(Landroidx/fragment/app/FragmentManager;)V", "progressDialogLifecycle", "Landroidx/lifecycle/Lifecycle;", "getProgressDialogLifecycle", "()Landroidx/lifecycle/Lifecycle;", "setProgressDialogLifecycle", "(Landroidx/lifecycle/Lifecycle;)V", "dispatchTouchEvent", "", "event", "Landroid/view/MotionEvent;", "initViews", "", "injectDependencies", "appComponent", "Lcom/jlmari/baseandroid/application/di/AppComponent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "onRetainCustomNonConfigurationInstance", "retrieveBundleData", "bundle", "setupListeners", "app_debug"})
public abstract class BaseActivity<V extends com.jlmari.presentation.base.contract.BaseContract.View, R extends com.jlmari.presentation.base.contract.BaseContract.Router, P extends com.jlmari.presentation.base.contract.BaseContract.Presenter<? super V, ? super R>> extends androidx.appcompat.app.AppCompatActivity implements com.jlmari.presentation.base.contract.BaseContract.View, com.jlmari.presentation.base.contract.BaseContract.Router, com.jlmari.baseandroid.behaviours.ProgressDialogBehaviour {
    
    /**
     * The [BaseContract.Presenter] that will be injected.
     */
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public P presenter;
    
    /**
     * Add the required initializations to inject a custom progress dialog for all activities.
     * It will be used for loading purposes.
     */
    @org.jetbrains.annotations.Nullable()
    private androidx.fragment.app.DialogFragment progressDialog;
    @org.jetbrains.annotations.NotNull()
    public androidx.fragment.app.FragmentManager progressDialogFragmentManager;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.Lifecycle progressDialogLifecycle;
    private java.util.HashMap _$_findViewCache;
    
    /**
     * The [BaseContract.Presenter] that will be injected.
     */
    @androidx.annotation.VisibleForTesting(otherwise = java.lang.reflect.Modifier.PROTECTED)
    @java.lang.Deprecated()
    public static void presenter$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final P getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    P p0) {
    }
    
    /**
     * Specify the layout resource ID to be inflated in the [BaseActivity.onCreate] method.
     */
    public abstract int getLayoutResId();
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public androidx.fragment.app.DialogFragment getProgressDialog() {
        return null;
    }
    
    @java.lang.Override()
    public void setProgressDialog(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.DialogFragment p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.fragment.app.FragmentManager getProgressDialogFragmentManager() {
        return null;
    }
    
    @java.lang.Override()
    public void setProgressDialogFragmentManager(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.Lifecycle getProgressDialogLifecycle() {
        return null;
    }
    
    @java.lang.Override()
    public void setProgressDialogLifecycle(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Lifecycle p0) {
    }
    
    /**
     * [AppCompatActivity] lifecycle method onCreate().
     * 1) Inject dependencies (or recover presenter if already have their instance)
     * 2) Get bundle data from any possible option
     * 3) Attach itself as view and call onCreate() to its presenter
     * 4) Init views and setup listeners
     */
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * [AppCompatActivity] lifecycle method onRetainCustomNonConfigurationInstance().
     * Recover presenter.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public P onRetainCustomNonConfigurationInstance() {
        return null;
    }
    
    /**
     * [AppCompatActivity] lifecycle method onResume().
     * Attach itself as router and call onResume to its presenter.
     */
    @java.lang.Override()
    protected void onResume() {
    }
    
    /**
     * [AppCompatActivity] lifecycle method onPause().
     * Detach router and call onPause to its presenter.
     */
    @java.lang.Override()
    protected void onPause() {
    }
    
    /**
     * [AppCompatActivity] lifecycle method onDestroy().
     * Detach view and call onDestroy to its presenter.
     */
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    /**
     * Setup the object graph and inject the dependencies needed on each activity.
     *
     * @param appComponent The required [AppComponent] to inject all the needed dependencies
     */
    public abstract void injectDependencies(@org.jetbrains.annotations.Nullable()
    com.jlmari.baseandroid.application.di.AppComponent appComponent);
    
    /**
     * Method to get all the extra data sent via Intent's from another context.
     * It's an optional method since maybe there is not extra data needed.
     *
     * @param bundle The required [Bundle] where the data is compressed
     */
    public void retrieveBundleData(@org.jetbrains.annotations.NotNull()
    android.os.Bundle bundle) {
    }
    
    /**
     * This method is executed on [BaseActivity.onCreate] to init views.
     * It's an optional method, so those extending activities that may need it can override it.
     */
    public void initViews() {
    }
    
    /**
     * This method is executed on [BaseActivity.onCreate] to setup view listeners.
     * It's an optional method, so those extending activities that may need it can override it.
     */
    public void setupListeners() {
    }
    
    /**
     * This method overrides the default dispatch touch event from the Android [AppCompatActivity].
     * It clears the focus of [EditText] when a touch event is triggered outside.
     *
     * @param event The [MotionEvent] executed by the user when touching the screen
     * @return The [Boolean] with the default behaviour of [dispatchTouchEvent]
     */
    @java.lang.Override()
    public boolean dispatchTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    public BaseActivity() {
        super();
    }
    
    /**
     * Method to show the loading inside the [DialogFragment].
     */
    public void showProgressDialog() {
    }
    
    /**
     * Method to hide the loading safely.
     */
    public void dismissProgressDialog() {
    }
}