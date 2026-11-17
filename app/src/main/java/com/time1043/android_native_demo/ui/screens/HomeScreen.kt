package com.time1043.android_native_demo.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = viewModel()
) {
    Column {
        Text(text = "${viewModel.count} x 2 = ${viewModel.doubleCount}")
        Button(onClick = { viewModel.increment() } ) { Text("Inc") }
    }
}