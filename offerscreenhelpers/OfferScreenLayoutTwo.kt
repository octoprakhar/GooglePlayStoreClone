package com.example.googleplaystorew1.offerscreenhelpers

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.googleplaystorew1.multiscreensuihelpers.BlendingTwoBackgroundsInBoxLayout
import com.example.googleplaystorew1.R

@Composable
fun OfferScreenLayoutTwo(offerScreenLayoutTwoItems: OfferScreenLayoutTwoItems){

    val imageBitmap = ImageBitmap.imageResource(id = offerScreenLayoutTwoItems.logo)
    Column(
        modifier = offerScreenLayoutTwoItems.layoutPaddingAndSize
    ) {
        BlendingTwoBackgroundsInBoxLayout(
            image = offerScreenLayoutTwoItems.backgroundImage,
            color = offerScreenLayoutTwoItems.backgroundColor,
            imageAlpha = offerScreenLayoutTwoItems.backgroundImageAlpha,
            externalBoxHeight = offerScreenLayoutTwoItems.upperBoxHeight,
            externalBoxPadding = offerScreenLayoutTwoItems.upperBoxPadding,
            imageCoverFactor = offerScreenLayoutTwoItems.backgroundImageCoverFactor
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                Spacer(modifier = Modifier.weight(2f))
                Text(text = offerScreenLayoutTwoItems.heading, fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.White)
                Text(text = offerScreenLayoutTwoItems.extra, color = Color.White)
            }

        }
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ){
            Box(
                modifier = Modifier
                    .size(60.dp)
                    .padding(end = 4.dp)
                    .clip(RoundedCornerShape(4.dp))

            ){
                Image(
                    bitmap = imageBitmap,
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.fillMaxSize()
                )
            }
            Column (
                modifier = Modifier.padding(start = 8.dp)
            ){
                Text(text = offerScreenLayoutTwoItems.appName)
                Text(text = offerScreenLayoutTwoItems.appDescription)
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(text = offerScreenLayoutTwoItems.rating, modifier = Modifier.padding(end = 2.dp))
                    Icon(imageVector = Icons.Default.Star, contentDescription = null, modifier = Modifier.size(12.dp))
                }
            }
        }
    }
}

data class OfferScreenLayoutTwoItems(
    val layoutPaddingAndSize : Modifier,
    val backgroundImage : Int,
    val backgroundColor : Long,
    val backgroundImageAlpha : Float,
    val upperBoxHeight : Dp,
    val upperBoxPadding : Dp,
    val backgroundImageCoverFactor : Double,
    val logo : Int,
    val heading : String,
    val extra : String,
    val appName : String,
    val appDescription : String,
    val rating : String
)