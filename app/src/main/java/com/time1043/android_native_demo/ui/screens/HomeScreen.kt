package com.time1043.android_native_demo.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = viewModel()
) {
    val count by viewModel.count.collectAsState()
    val doubleCount = viewModel.doubleCount

    Column {
        Text(text = "$count x 2 = $doubleCount")
        Button(onClick = { viewModel.increment() } ) { Text("Inc") }
    }
}