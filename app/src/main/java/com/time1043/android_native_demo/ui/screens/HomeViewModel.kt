package com.time1043.android_native_demo.ui.screens

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class HomeUiState(
    val count: Int = 1,
) {
    val doubleCount: Int
        get() = count * 2
}

class HomeViewModel : ViewModel() {

    // Expose screen UI state
    private val _uiState = MutableStateFlow(HomeUiState()) // could update in the ViewModel

    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow() // read-only in the Compose

    // Handle business logic
    fun increment() {
        _uiState.update { currentState ->
            currentState.copy(
                count = currentState.count + 1
            )
        }
    }
}