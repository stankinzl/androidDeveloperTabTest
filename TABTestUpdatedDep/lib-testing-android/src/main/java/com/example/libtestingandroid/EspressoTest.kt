package com.example.libtestingandroid


import android.app.Activity
import android.content.Intent
import androidx.annotation.CallSuper
import androidx.test.rule.ActivityTestRule
import org.junit.Before
import org.junit.Rule

//TODO: Make this work
abstract class EspressoTest (activity: Activity) : BDDEspressoTest() {

    @CallSuper
    @Before
    open fun setup() {
    }

    @JvmField
    @Rule
    val activityRule = ActivityTestRule(activity::class.java)

    fun Given(step: () -> Unit, launchFirst: Boolean = true) {
        if (launchFirst) {
            activityRule.launchActivity(Intent())
        }
        step()
        if (!launchFirst) {
             activityRule.launchActivity(Intent())
        }
    }
}