package com.time1043.android_native_demo.ui.screens

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class HomeViewModel : ViewModel() {

    // Expose screen UI state
    private val _count = MutableStateFlow(1)

    val count: StateFlow<Int> = _count.asStateFlow()

    val doubleCount: Int
        get() = count.value * 2

    // Handle business logic
    fun increment() {
        _count.value++
    }
}