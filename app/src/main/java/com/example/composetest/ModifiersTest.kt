package com.example.composetest

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetest.ModifiersTest.ModifierMainScreen

object ModifiersTest {
    @Composable
    private fun Greeting(name: String) {
        Column(
            modifier = Modifier
                .background(Color.Red)
                .padding(24.dp)
        ) {
            Text(text = name)
        }
    }

    @Composable
    private fun FillMixWidthGreeting(name: String) {
        Column (
            modifier = Modifier
                .background(Color.Green)
                .padding(24.dp)
                .fillMaxWidth()
        ) {
            Text(text = name)
        }
    }

    @Composable
    fun ModifierMainScreen(){
        Column(modifier = Modifier.fillMaxWidth()) {
            Greeting("hello modifier")
            FillMixWidthGreeting("FillMixWidth")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewModifierText() {
    ModifierMainScreen()
}