package com.example.composetest

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetest.Surface.SimpleSurface

object Surface {
    @Composable
    fun SimpleSurface() {
        Surface(
            modifier = Modifier.padding(16.dp),
            color = Color.LightGray,
            shadowElevation = 4.dp,
            shape = RoundedCornerShape(8.dp)
        ) {
            Text(
                text = "Surface Example",
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSimpleSurfaceExample() {
    SimpleSurface()
}