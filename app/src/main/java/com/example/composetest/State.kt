package com.example.composetest

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetest.Layout.ArtistCardColumn
import com.example.composetest.Layout.ArtistCardRow
import com.example.composetest.Layout.ArtistsCardBox
import com.example.composetest.Layout.LayoutMainScreen
import com.example.composetest.State.StateMainScreen

object State {

    // 상태를 관리하는 composeble
    @Composable
    fun HelloScreen() {
        var name by remember { mutableStateOf("") }
        HelloContent(name = name, onNameChange = { name = it })
    }

    // UI만 관리하는 composeble
    @Composable
    private fun HelloContent(name: String, onNameChange: (String) -> Unit) {
        Column(modifier = Modifier.padding(16.dp)) {
            if (name.isNotEmpty()) {
                Text(
                    text = "Hello $name!",
                    modifier = Modifier.padding(bottom = 8.dp),
                )
            }
            OutlinedTextField(
                value = name, // 현재 상태값 반영
                onValueChange = onNameChange, // 상태 업데이트
                label = { Text("Name") }
            )
        }
    }

    @Composable
    fun StateMainScreen() {
        Column (modifier = Modifier.fillMaxWidth()) {
            HelloScreen()
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewLayoutText() {
    StateMainScreen()
}