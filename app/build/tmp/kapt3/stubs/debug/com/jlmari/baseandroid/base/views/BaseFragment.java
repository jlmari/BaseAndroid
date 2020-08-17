package com.jlmari.baseandroid.base.views;

import java.lang.System;

/**
 * Base fragment that must be extended by all fragments.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\n\b\u0001\u0010\u0003 \u0000*\u00020\u0004*\u0014\b\u0002\u0010\u0005*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00062\u00020\u00072\u00020\u00022\u00020\u00042\u00020\bB\u0005\u00a2\u0006\u0002\u0010\tJ\b\u0010!\u001a\u00020\"H\u0016J\u0012\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010%H&J\u0012\u0010&\u001a\u00020\"2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J$\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010/\u001a\u00020\"H\u0016J\b\u00100\u001a\u00020\"H\u0016J\b\u00101\u001a\u00020\"H\u0016J\u001a\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020*2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u0010\u00104\u001a\u00020\"2\u0006\u00105\u001a\u00020(H\u0016J\b\u00106\u001a\u00020\"H\u0016R\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u00028\u00028\u0006@\u0006X\u0087.\u00a2\u0006\u0016\n\u0002\u0010\u0014\u0012\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u0016X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u00067"}, d2 = {"Lcom/jlmari/baseandroid/base/views/BaseFragment;", "V", "Lcom/jlmari/presentation/base/contract/BaseContract$View;", "R", "Lcom/jlmari/presentation/base/contract/BaseContract$Router;", "P", "Lcom/jlmari/presentation/base/contract/BaseContract$Presenter;", "Landroidx/fragment/app/Fragment;", "Lcom/jlmari/baseandroid/behaviours/ProgressDialogBehaviour;", "()V", "layoutResId", "", "getLayoutResId", "()I", "presenter", "presenter$annotations", "getPresenter", "()Lcom/jlmari/presentation/base/contract/BaseContract$Presenter;", "setPresenter", "(Lcom/jlmari/presentation/base/contract/BaseContract$Presenter;)V", "Lcom/jlmari/presentation/base/contract/BaseContract$Presenter;", "progressDialogFragmentManager", "Landroidx/fragment/app/FragmentManager;", "getProgressDialogFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "setProgressDialogFragmentManager", "(Landroidx/fragment/app/FragmentManager;)V", "progressDialogLifecycle", "Landroidx/lifecycle/Lifecycle;", "getProgressDialogLifecycle", "()Landroidx/lifecycle/Lifecycle;", "setProgressDialogLifecycle", "(Landroidx/lifecycle/Lifecycle;)V", "initViews", "", "injectDependencies", "appComponent", "Lcom/jlmari/baseandroid/application/di/AppComponent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onPause", "onResume", "onViewCreated", "view", "retrieveBundleData", "bundle", "setupListeners", "app_debug"})
public abstract class BaseFragment<V extends com.jlmari.presentation.base.contract.BaseContract.View, R extends com.jlmari.presentation.base.contract.BaseContract.Router, P extends com.jlmari.presentation.base.contract.BaseContract.Presenter<? super V, ? super R>> extends androidx.fragment.app.Fragment implements com.jlmari.presentation.base.contract.BaseContract.View, com.jlmari.presentation.base.contract.BaseContract.Router, com.jlmari.baseandroid.behaviours.ProgressDialogBehaviour {
    
    /**
     * The [BaseContract.Presenter] that will be injected.
     */
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public P presenter;
    
    /**
     * Add the required initializations to inject a custom progress dialog for all fragments.
     * It will be used for loading purposes.
     */
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
     * Specify the layout resource ID to be inflated in the [BaseFragment.onCreateView] method.
     */
    public abstract int getLayoutResId();
    
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
     * [Fragment] lifecycle method onCreate(). Inject dependencies.
     */
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * [Fragment] lifecycle method onCreateView(). Set layout resource.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    /**
     * [Fragment] lifecycle method onViewCreated().
     * 1) Get bundle data from any possible option
     * 2) Attach itself as view and call onCreate() to its presenter
     * 3) Init views and setup listeners
     */
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * [Fragment] lifecycle method onResume().
     * Attach itself as router and call onResume() to its presenter.
     */
    @java.lang.Override()
    public void onResume() {
    }
    
    /**
     * [Fragment] lifecycle method onPause().
     * Detach router and call onPause() to its presenter.
     */
    @java.lang.Override()
    public void onPause() {
    }
    
    /**
     * [Fragment] lifecycle method onDestroyView().
     * Detach view and call onDestroy() to its presenter.
     */
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    /**
     * Setup the object graph and inject the dependencies needed on each fragment.
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
     * This method is executed on [BaseFragment.onViewCreated] to init views.
     * It's an optional method, so those extending fragments that may need it can override it.
     */
    public void initViews() {
    }
    
    /**
     * This method is executed on [BaseFragment.onCreate] to setup view listeners.
     * It's an optional method, so those extending fragments that may need it can override it.
     */
    public void setupListeners() {
    }
    
    public BaseFragment() {
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