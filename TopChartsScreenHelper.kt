package com.example.googleplaystorew1

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp

@Composable
fun TopChartsScreenHelper(){

    val imageBitmap = ImageBitmap.imageResource(id = R.drawable.subwaysurfers)

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ){
        Row (
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround

        ){
            Text(text = "1", modifier = Modifier.padding(horizontal = 8.dp))
            Box(
                modifier = Modifier
                    .height(90.dp)
                    .width(90.dp)
            ){
                
                Image(bitmap = imageBitmap, contentDescription = null, contentScale = ContentScale.Crop, modifier = Modifier.fillMaxSize())

            }
            Column {
                Text(text = "Meesho: Online Shopping App",modifier = Modifier.padding(horizontal = 8.dp))
                Text(text = "Shopping ~ Online marketplace",modifier = Modifier.padding(horizontal = 8.dp))
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(text = "4.4")
                    Text(text = "\u2605  ", modifier = Modifier.padding(bottom = 2.dp))
                    Text(text = "12 MB")

                }
            }

        }
    }
}