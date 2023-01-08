package com.tbse.basicstatecodelab.ui.composables

import androidx.compose.runtime.*

@Composable
fun StatefulCounter() {
    var count by remember { mutableStateOf(0) }

    StatelessCounter(count, { count++ })
}