package com.time1043.android_native_demo.ui.screens

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf

@Composable
fun HomeScreen() {
    // var count = mutableStateOf(1)
    var count = mutableIntStateOf(1)

    // Button(onClick = { count.value++ }) { Text("$count") } // MutableState(value=1)@937520472
    Button(onClick = { count.value++ }) { Text("${count.value}") } // 1
}