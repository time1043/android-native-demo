package com.time1043.android_native_demo.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun HomeScreen() {
    val state = rememberCounterState()

    Column {
        Text(text = "${state.count} x 2 = ${state.doubleCount}")
        Button(onClick = state::increment) { Text("Inc") }
    }
}