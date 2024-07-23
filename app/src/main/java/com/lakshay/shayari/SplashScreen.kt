package com.lakshay.shayari

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lakshay.shayari.ui.theme.purpleColor
import com.lakshay.shayari.ui.theme.purplePrimColor


@Composable
@Preview
fun SplashScreen() {
    Surface {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = purplePrimColor)
        )
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Image(
                painterResource(id = R.drawable.logo),
                contentDescription = null,
                modifier = Modifier.size(100.dp)
            )
        }
        Box(modifier = Modifier.fillMaxSize().padding(20.dp), contentAlignment = Alignment
            .BottomCenter){
            CircularProgressIndicator(modifier = Modifier.size(35.dp), strokeWidth = 5.dp,
                color
            = purpleColor)
        }
    }

}
