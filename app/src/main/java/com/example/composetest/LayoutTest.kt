package com.example.composetest

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetest.LayoutTest.LayoutMainScreen

object LayoutTest {
    @Composable
    fun ArtistCardColumn() {
        Column (
            modifier = Modifier
                .statusBarsPadding()
                .fillMaxWidth()
        ) {
            Text("hello")
            Text("World ")
        }
    }

    @Composable
    fun ArtistCardRow() {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .fillMaxWidth()
        ) {
            Image (
                painter = painterResource(id = R.drawable.minji),
                contentDescription = "Artist image",
                modifier = Modifier.size(64.dp)
            )
            Spacer(modifier = Modifier.width(16.dp)) // 이미지와 텍스트 사이 간격 조정
            Column {
                Text("민지")
                Text("뉴진스")
            }
        }
    }

    @Composable
    fun ArtistsCardBox() {
        Box (
            modifier = Modifier
                .size(64.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.minji),
                contentDescription = "MinJi",
                modifier = Modifier
                    .fillMaxSize()
                    .clip(CircleShape), //원형으로 자르기
                contentScale = ContentScale.Crop //이미지를 꽉 채우며 자르기
            )

            // 체크 아이콘 - 오른쪽 하단
            Icon(
                imageVector = Icons.Default.CheckCircle,
                contentDescription = "Check Mark",
                modifier = Modifier
                    .align(Alignment.BottomEnd) //오른쪽 하단 정렬
                    .background(Color.White, CircleShape) //흰색 원형 배경
                    .padding(1.dp) //아이콘 주위 여백
                    .size(20.dp), //아이콘 사이즈
                tint = Color.Black
            )
        }
    }

    @Composable
    fun LayoutMainScreen() {
        Column (modifier = Modifier.fillMaxWidth()) {
            ArtistCardColumn()
            ArtistCardRow()
            ArtistsCardBox()
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewLayoutText() {
    LayoutMainScreen()
}

