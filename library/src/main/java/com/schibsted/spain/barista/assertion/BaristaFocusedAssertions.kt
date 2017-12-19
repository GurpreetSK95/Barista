package com.schibsted.spain.barista.assertion

import android.support.annotation.IdRes
import android.support.test.espresso.matcher.ViewMatchers.hasFocus
import com.schibsted.spain.barista.internal.magicAssert
import org.hamcrest.Matchers.not

object BaristaFocusedAssertions {

    @JvmStatic
    fun assertFocused(resId: Int) {
        resId magicAssert hasFocus()
    }

    @JvmStatic
    fun assertNotFocused(@IdRes resId: Int) {
        resId magicAssert not(hasFocus())
    }

    @JvmStatic
    fun assertFocused(text: String) {
        text magicAssert hasFocus()
    }

    @JvmStatic
    fun assertNotFocused(text: String) {
        text magicAssert not(hasFocus())
    }
}