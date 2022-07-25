package com.hieuwu.calculator

import android.util.Log
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
@LargeTest
class ExampleInstrumentedTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test fun calculatorTextIsPresent() {
        onView(withText("Calculator")).check(matches(isDisplayed()))
        onView(withId(R.id.editTextNumber))
            .perform(clearText())
        onView(withId(R.id.editTextNumber))
            .perform(typeText("123456"), closeSoftKeyboard())
        onView(withId(R.id.btnPlus)).perform(click())
        onView(withId(R.id.editTextNumber))
            .perform(typeText("1"), closeSoftKeyboard())
        onView(withId(R.id.btnEqual)).perform(click())
        onView(withId(R.id.editTextNumber))
            .check(matches(withText("123457.0")))
        Log.d("Tag", "Message")
    }

    @Test fun calculatorTextIsPresent2() {
        onView(withText("Calculator")).check(matches(isDisplayed()))
        onView(withId(R.id.editTextNumber))
            .perform(clearText())
        onView(withId(R.id.editTextNumber))
            .perform(typeText("123456"), closeSoftKeyboard())
        onView(withId(R.id.btnPlus)).perform(click())
        onView(withId(R.id.editTextNumber))
            .perform(typeText("1"), closeSoftKeyboard())
        onView(withId(R.id.btnEqual)).perform(click())
//        onView(withId(R.id.editTextNumber))
//            .check(matches(withText("1234576969.0")))
        Log.d("Tag", "Message")
    }

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.hieuwu.calculator", appContext.packageName)
    }

    @Test
    fun failingTest() {
        assertTrue(true);
    }
}