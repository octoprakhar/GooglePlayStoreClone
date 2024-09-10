package com.example.googleplaystorew1.childrenScreenHelper

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.googleplaystorew1.R

@Composable
fun LayoutOne(){
    val backgroundImageBitmap = ImageBitmap.imageResource(id = R.drawable.butterflyimage)
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(170.dp)
            .padding(vertical = 8.dp)
            .drawBehind {
                drawImage(
                    image = backgroundImageBitmap,
                    dstSize = IntSize(size.width.toInt(), size.height.toInt()),
                    alpha = 0.8f
                )

            }
            .clickable(
                onClick = {}
            )

    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ){
            Text(text = "Teacher Approved", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text(text = "Handpicked for quality", fontSize = 12.sp)
        }

    }
}