package com.lakshay.shayari

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lakshay.shayari.ui.theme.purpleSecColor

@Composable
@Preview
fun MainToolBarPreview() {
    MainToolBar(title = "Demo",{ })
}

@Composable
fun MainToolBar(title: String, onClick:()->Unit){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .padding(horizontal = 15.dp), verticalAlignment = Alignment.CenterVertically
    ) {
        Card(
            modifier = Modifier
                .size(45.dp)
                .clickable { onClick.invoke() }, colors = CardDefaults
                .cardColors(
                    containerColor
                    = purpleSecColor
                ), shape = RoundedCornerShape(200.dp)
        ) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Icon(
                    painterResource(id = R.drawable.ic_back),
                    contentDescription = null,
                    tint = Color.White
                )
            }
        }
        Text(
            text = title, style = TextStyle(
                fontSize = 18.sp, fontWeight = FontWeight.Bold
            ), color = Color.White, modifier = Modifier.padding(start = 20.dp)
        )
    }
}