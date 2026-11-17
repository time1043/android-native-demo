package com.time1043.android_native_demo.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    // Expose screen UI state
    var count by mutableIntStateOf(1)
        private set

    val doubleCount: Int
        get() = count * 2

    // Handle business logic
    fun increment() {
        count++
    }
}