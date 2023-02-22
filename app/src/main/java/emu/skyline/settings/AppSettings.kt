/*
 * SPDX-License-Identifier: MPL-2.0
 * Copyright © 2020 Skyline Team and Contributors (https://github.com/skyline-emu/)
 */

package emu.skyline.settings

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import emu.skyline.utils.sharedPreferences
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Settings used by the app globally
 */
@Singleton
class AppSettings @Inject constructor(@ApplicationContext private val context : Context) {
    // Emulator
    var searchLocation by sharedPreferences(context, "")
    var appTheme by sharedPreferences(context, 2)
    var layoutType by sharedPreferences(context, 1)
    var groupByFormat by sharedPreferences(context, true)
    var sortAppsBy by sharedPreferences(context, 0)
    var selectAction by sharedPreferences(context, false)
    var perfStats by sharedPreferences(context, false)
    var logLevel by sharedPreferences(context, 3)

    // Input
    var onScreenControl by sharedPreferences(context, true)
    var onScreenControlFeedback by sharedPreferences(context, true)
    var onScreenControlRecenterSticks by sharedPreferences(context, true)

    // Other
    var romFormatFilter by sharedPreferences(context, 0)
    var refreshRequired by sharedPreferences(context, false)
}