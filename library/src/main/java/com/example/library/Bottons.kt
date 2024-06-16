package com.example.library

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

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


@Preview
@Composable
fun CustomButtons() {
    var sliderPosition by remember { mutableFloatStateOf(0f) }
    Column {
        Column {
            Slider(
                modifier = Modifier.padding(horizontal = 50.dp),
                value = sliderPosition,
                valueRange = 0f..50f,
                onValueChange = { sliderPosition = it }
            )
            Text(text = sliderPosition.toString())
        }

        //val shape = RoundedCornerShape(sliderPosition)
        val shape = RoundedCornerShape(topEnd = sliderPosition)
//        val shape = CutCornerShape(topEnd = sliderPosition, bottomStart = sliderPosition)
//        val shape = AbsoluteCutCornerShape(topRightPercent = sliderPosition.toInt())

        Button(
            onClick = { /*TODO*/ },
            shape = shape
        ) { Text(text = "Filled") }
        FilledTonalButton(
            onClick = { /*TODO*/ },
            shape = shape
        ) { Text(text = "Tonal") }
        OutlinedButton(onClick = { /*TODO*/ }, shape = shape) {
            Text(
                text = "Outlined"
            )
        }
        ElevatedButton(onClick = { /*TODO*/ }, shape = shape) {
            Text(
                text = "ElevatedButton"
            )
        }
        TextButton(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(sliderPosition)
        ) { Text(text = "Text Button") }
    }
}

sealed class ShapeType(val shape: Shape) {
    object CircleShape : ShapeType(androidx.compose.foundation.shape.CircleShape)
    object AbsoluteCutCornerShape : ShapeType(AbsoluteCutCornerShape(10.dp))
    object AbsoluteRoundedCornerShape : ShapeType(AbsoluteRoundedCornerShape(10.dp))
    object CutCornerShape : ShapeType(CutCornerShape(10.dp))
}