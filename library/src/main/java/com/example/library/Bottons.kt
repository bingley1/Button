package com.example.library

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun Buttons() {
    Column {
        Button(onClick = { /*TODO*/ }) { Text(text = "Filled") }
        FilledTonalButton(onClick = { /*TODO*/ }) { Text(text = "Tonal") }
        OutlinedButton(onClick = { /*TODO*/ }) { Text(text = "Outlined") }
        ElevatedButton(onClick = { /*TODO*/ }) { Text(text = "ElevatedButton") }
        TextButton(onClick = { /*TODO*/ }) { Text(text = "Text Button") }
    }
}