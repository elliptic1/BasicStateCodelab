package com.tbse.basicstatecodelab.ui.composables

/**
 * Created by toddsmith on 1/8/23.
 */
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(
    modifier: Modifier = Modifier,
    count: Int,
    onCountClicked: () -> Unit,
) {
    Column(modifier = modifier.padding(16.dp)) {
        if (count > 0) {
            Text("You've had $count glasses.")
        }
        Button(onClick = onCountClicked, Modifier.padding(top = 8.dp), enabled = count < 10) {
            Text("Add one")
        }
    }
}