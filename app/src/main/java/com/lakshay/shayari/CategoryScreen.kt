package com.lakshay.shayari

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.lakshay.shayari.ui.theme.purplePrimColor

@Composable
@Preview
fun CategoryScreen() {
    Surface {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = purplePrimColor)
        ) {
            MainToolBar(title = "Category", { })
        }

    }
}