package com.time1043.android_native_demo.ui.screens

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue

@Composable
fun HomeScreen() {
    var count by mutableIntStateOf(1)

    Button(onClick = { count++ }) { Text("${count}") }
}