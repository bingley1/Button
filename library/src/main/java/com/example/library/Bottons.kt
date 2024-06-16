package com.example.library

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
    var border by remember { mutableFloatStateOf(0f) }
    var topEnd by remember { mutableFloatStateOf(0f) }
    var topStart by remember { mutableFloatStateOf(0f) }
    var bottomEnd by remember { mutableFloatStateOf(0f) }
    var bottomStart by remember { mutableFloatStateOf(0f) }
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
            Text(text = "Border:")
            Slider(modifier = Modifier.width(200.dp), value = border, valueRange = 0f..5f, onValueChange = { border = it })
            Text(modifier = Modifier.width(50.dp), text = border.toInt().toString())
        }

        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
            Text(text = "topStart:")
            Slider(modifier = Modifier.width(200.dp), value = topStart, valueRange = 0f..50f, onValueChange = { topStart = it })
            Text(modifier = Modifier.width(50.dp), text = topStart.toInt().toString())
        }

        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
            Text(text = "topEnd:")
            Slider(modifier = Modifier.width(200.dp), value = topEnd, valueRange = 0f..50f, onValueChange = { topEnd = it })
            Text(modifier = Modifier.width(50.dp), text = topEnd.toInt().toString())
        }

        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
            Text(text = "bottomStart:")
            Slider(modifier = Modifier.width(200.dp), value = bottomStart, valueRange = 0f..50f, onValueChange = { bottomStart = it })
            Text(modifier = Modifier.width(50.dp), text = bottomStart.toInt().toString())
        }

        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
            Text(text = "bottomEnd:")
            Slider(modifier = Modifier.width(200.dp), value = bottomEnd, valueRange = 0f..50f, onValueChange = { bottomEnd = it })
            Text(modifier = Modifier.width(50.dp), text = bottomEnd.toInt().toString())
        }

        //val shape = RoundedCornerShape(topEnd = topEnd, topStart = topStart, bottomStart = bottomStart, bottomEnd = bottomEnd)
        val shape = RoundedCornerShape(topEnd = topEnd, topStart = topStart, bottomStart = bottomStart, bottomEnd = bottomEnd)
//        val shape = CutCornerShape(topEnd = topEnd, topStart = topStart, bottomStart = bottomStart, bottomEnd = bottomEnd)
//        val shape = AbsoluteCutCornerShape(topEnd = topEnd, topStart = topStart, bottomStart = bottomStart, bottomEnd = bottomEnd)

        val elevation = ButtonDefaults.buttonElevation(
            disabledElevation = border.dp
        )

        val border = BorderStroke(border.dp, Color.Black)

        Button(
            onClick = { /*TODO*/ },
            shape = shape,
            elevation = elevation,
            border = border
        ) { Text(text = "Filled") }
        FilledTonalButton(
            onClick = { /*TODO*/ },
            shape = shape,
            elevation = elevation,
            border = border
        ) { Text(text = "Tonal") }
        OutlinedButton(
            onClick = { /*TODO*/ },
            shape = shape,
            elevation = elevation,
            border = border
        ) {
            Text(text = "Outlined")
        }
        ElevatedButton(
            onClick = { /*TODO*/ },
            shape = shape,
            elevation = elevation,
            border = border
        ) {
            Text(text = "ElevatedButton")
        }
        TextButton(
            onClick = { /*TODO*/ },
            shape = shape,
            elevation = elevation,
            border = border
        ) { Text(text = "Text Button") }
    }
}

sealed class ShapeType(val shape: Shape) {
    object CircleShape : ShapeType(androidx.compose.foundation.shape.CircleShape)
    object AbsoluteCutCornerShape : ShapeType(AbsoluteCutCornerShape(10.dp))
    object AbsoluteRoundedCornerShape : ShapeType(AbsoluteRoundedCornerShape(10.dp))
    object CutCornerShape : ShapeType(CutCornerShape(10.dp))
}