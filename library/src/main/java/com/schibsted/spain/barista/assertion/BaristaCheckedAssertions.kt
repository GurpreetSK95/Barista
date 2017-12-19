package com.schibsted.spain.barista.assertion

import android.support.test.espresso.matcher.ViewMatchers.isChecked
import com.schibsted.spain.barista.internal.magicAssert
import org.hamcrest.Matchers.not

object BaristaCheckedAssertions {

    @JvmStatic
    fun assertChecked(resId: Int) {
        resId magicAssert isChecked()
    }

    @JvmStatic
    fun assertChecked(text: String) {
        text magicAssert isChecked()
    }

    @JvmStatic
    fun assertUnchecked(resId: Int) {
        resId magicAssert not(isChecked())
    }

    @JvmStatic
    fun assertUnchecked(text: String) {
        text magicAssert not(isChecked())
    }
}