package com.jlmari.baseandroid.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0001\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0002\u00a8\u0006\t"}, d2 = {"getInt", "", "Landroid/content/res/Resources;", "integerResId", "getLong", "", "isMobile", "", "isTablet", "app_debug"})
public final class ResourcesExtensionsKt {
    
    /**
     * Method that indicates if the device is a mobile phone or not.
     *
     * @return The [Boolean] that indicates if is mobile
     */
    public static final boolean isMobile(@org.jetbrains.annotations.NotNull()
    android.content.res.Resources $this$isMobile) {
        return false;
    }
    
    /**
     * Method that indicates if the device is a tablet or not.
     *
     * @return The [Boolean] that indicates if is tablet
     */
    public static final boolean isTablet(@org.jetbrains.annotations.NotNull()
    android.content.res.Resources $this$isTablet) {
        return false;
    }
    
    /**
     * Method to get an integer [Int] value based on its [IntegerRes] identifier.
     *
     * @param integerResId The integer-resource identifier
     * @return The desired [Int]
     */
    public static final int getInt(@org.jetbrains.annotations.NotNull()
    android.content.res.Resources $this$getInt, @androidx.annotation.IntegerRes()
    int integerResId) {
        return 0;
    }
    
    /**
     * Method to get a long [Long] value based on its [IntegerRes] identifier.
     *
     * @param integerResId The integer-resource identifier
     * @return The desired [Int] converted to [Long]
     */
    public static final long getLong(@org.jetbrains.annotations.NotNull()
    android.content.res.Resources $this$getLong, @androidx.annotation.IntegerRes()
    int integerResId) {
        return 0L;
    }
}