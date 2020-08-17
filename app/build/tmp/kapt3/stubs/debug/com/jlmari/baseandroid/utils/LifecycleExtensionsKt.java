package com.jlmari.baseandroid.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0003"}, d2 = {"hasValidActiveState", "", "Landroidx/lifecycle/Lifecycle;", "app_debug"})
public final class LifecycleExtensionsKt {
    
    /**
     * Method to know if the current [Lifecycle] of the view (activity or fragment) has active state.
     * - [Lifecycle.State.CREATED]
     * - [Lifecycle.State.STARTED]
     * - [Lifecycle.State.RESUMED]
     *
     * @return The [Boolean] that indicates if the current state is valid or not
     */
    public static final boolean hasValidActiveState(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Lifecycle $this$hasValidActiveState) {
        return false;
    }
}