package com.time1043.android_native_demo.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun HomeScreen() {
    val (count, doubleCount, increment) = rememberCounterState()

    Column {
        Text(text = "$count x 2 = $doubleCount")
        Button(onClick = increment) { Text("Inc") }
    }
}