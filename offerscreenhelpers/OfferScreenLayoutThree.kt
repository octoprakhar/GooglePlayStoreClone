package com.example.googleplaystorew1.offerscreenhelpers

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.googleplaystorew1.R

@Composable
fun OfferScreenLayoutThree(
    offerScreenLayoutThreeItems: OfferScreenLayoutThreeItems
){
    val imageBitmap = ImageBitmap.imageResource(id = offerScreenLayoutThreeItems.image)
    Box(
        modifier = Modifier
            .height(offerScreenLayoutThreeItems.boxHeight)
            .width(offerScreenLayoutThreeItems.boxWidth)
            .padding(offerScreenLayoutThreeItems.boxPadding)
            .clip(RoundedCornerShape(offerScreenLayoutThreeItems.cornerRound))

    ){
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(bitmap = imageBitmap, contentDescription = null, modifier = Modifier.weight(3f), contentScale = ContentScale.Crop )
            offerScreenLayoutThreeItems.content()
        }
    }
}

data class OfferScreenLayoutThreeItems(
    val boxHeight : Dp,
    val boxWidth : Dp,
    val boxPadding : PaddingValues = PaddingValues(16.dp),
    val cornerRound : Dp,
    val image: Int,
    val content : @Composable () -> Unit
)