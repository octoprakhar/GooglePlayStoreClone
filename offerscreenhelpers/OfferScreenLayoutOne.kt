package com.example.googleplaystorew1.offerscreenhelpers

import android.content.ClipDescription
import android.content.Context
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import com.example.googleplaystorew1.R
import com.example.googleplaystorew1.gamescreenhelpers.VideoPlayer

@Composable
fun OfferScreenLayoutOne(
    offerScreenLayoutOneItems: OfferScreenLayoutOneItems,
    context: Context
){
    val videoUri = Uri.parse("android.resource://${context.packageName}/raw/${offerScreenLayoutOneItems.video}")
    val imageBitmap = ImageBitmap.imageResource(id = if (offerScreenLayoutOneItems.image == null) R.drawable.squalbuster else offerScreenLayoutOneItems.image)

    var height : Dp = if (offerScreenLayoutOneItems.hasButton) 400.dp else 320.dp
    Box(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .height(height)

    ){
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(height/2)
                ){
                if (offerScreenLayoutOneItems.hasVideo) {
                    VideoPlayer(videoUri = videoUri, modifier = Modifier.fillMaxSize())
                }else{
                    Image(bitmap = imageBitmap , contentDescription = null, contentScale = ContentScale.Crop, modifier = Modifier.fillMaxSize())
                }
            }
            Column(
                modifier =
                    if (offerScreenLayoutOneItems.hasButton){
                        Modifier.border(1.dp, Color.Black).padding(start = 16.dp, top = 26.dp, end = 16.dp, bottom = 8.dp)
                            .fillMaxSize()
                    }else{
                        Modifier.border(1.dp, Color.Black).padding(horizontal = 8.dp , vertical = 16.dp).fillMaxSize()
                    }

            ) {
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(text = offerScreenLayoutOneItems.title, fontSize = 10.sp)
                    Text(text = " . ", fontSize = 10.sp)
                    Text(text = "Expires on ${offerScreenLayoutOneItems.expiryDate}", fontSize = 10.sp)
                }
                Text(text = offerScreenLayoutOneItems.heading, modifier = Modifier.padding(vertical = 4.dp))
                Text(text = offerScreenLayoutOneItems.description, fontWeight = FontWeight.Light)
                if (offerScreenLayoutOneItems.hasButton || offerScreenLayoutOneItems.textInButton != null){
                    TextButton(
                        modifier = Modifier.padding(top = 4.dp),
                        onClick = { /*TODO*/ }
                    ) {
                        Text(text = offerScreenLayoutOneItems.textInButton!!)
                    }
                }
            }
        }
    }
}

data class OfferScreenLayoutOneItems(
    val hasVideo: Boolean,
    val hasButton: Boolean,
    val video: String?,
    val image: Int?,
    val textInButton : String?,
    val title : String,
    val expiryDate: String,
    val heading : String,
    val description: String
)
