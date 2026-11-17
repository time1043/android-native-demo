package com.time1043.android_native_demo.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = viewModel()
) {
    // val uiState by viewModel.uiState.collectAsState()
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    Column {
        Text(text = "${uiState.count} x 2 = ${uiState.doubleCount}")
        Button(onClick = { viewModel.increment() }) { Text("Inc") }
    }
}