package com.time1043.android_native_demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.time1043.android_native_demo.ui.screens.HomeScreen
import com.time1043.android_native_demo.ui.theme.AndroidnativedemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidnativedemoTheme {
                HomeScreen()
            }
        }
    }
}