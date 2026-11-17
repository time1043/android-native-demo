package com.time1043.android_native_demo.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

@Composable
fun HomeScreen() {
    var count by rememberSaveable { mutableIntStateOf(1) }
    val doubleCount by remember { derivedStateOf { count * 2 } }

    Column {
        Text(text = "$count x 2 = $doubleCount")
        Button(onClick = { count++ }) { Text("Inc") }
    }
}