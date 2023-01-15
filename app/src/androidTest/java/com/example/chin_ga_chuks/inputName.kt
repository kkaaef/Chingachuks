package com.example.chin_ga_chuks

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.chin_ga_chuks.screens.NamePage
import org.junit.Rule
import org.junit.Test
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase

class InputName : TestCase() {

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainPageActivity::class.java)

    @Test
    fun test() = run {
        step("Open Simple Screen") {
            testLogger.i("I am testLogger")
            device.screenshots.take("Additional_screenshot")
            NamePage {
                simpleButton {
                    isVisible()
                    click()
                }
            }
        }







}


    }
