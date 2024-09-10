package com.example.googleplaystorew1.multiscreensuihelpers

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.googleplaystorew1.R

@Composable
fun MultiScreenLayoutOne(){

    fun String.truncate(maxLength: Int): String {
        return if (this.length > maxLength) {
            this.substring(0, maxLength) + "..."
        } else {
            this
        }
    }

    val imageBitmap = ImageBitmap.imageResource(id = R.drawable.sniper)
    val ageAboveBitmap = ImageBitmap.imageResource(id = R.drawable.pegitwelve)
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 2.dp, start = 8.dp, end = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        Box(
            modifier = Modifier
                .size(100.dp)
                .weight(1f)
        ){
            Image(
                bitmap = imageBitmap,
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Fit
            )

        }
        Column(
            modifier = Modifier
                .padding(4.dp)
                .weight(2f)
        ){
            Text(text = "Shopsy Shopping App - Flipkart".truncate(18))
            Text(text = "Shopsy", fontSize = 12.sp)
            Row (
                modifier = Modifier.fillMaxWidth(),
//                            horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ){
                Row (
                    modifier = Modifier.padding(end = 4.dp)
                ){
                    Text(text = "4.2", fontSize = 10.sp)
                    Box(modifier = Modifier
                        .size(14.dp)
                    ){
                        Icon(painter = painterResource(id =
                        R.drawable.baseline_star_24
                        ), contentDescription =null )
                    }
                }
                Row{
                    Box(modifier = Modifier
                        .size(14.dp)
                    ){
                        Image(
                            bitmap = ageAboveBitmap,
                            contentDescription = null,
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Fit
                        )
                    }
                    Text(text = "Rated for 12+", fontSize = 10.sp)
                }
            }

        }
        Column (
            modifier = Modifier
//                            .border(2.dp, Color.Black)
                .weight(1f),
            verticalArrangement = Arrangement.Center
        ){
            FilledTonalButton(
                onClick = { /*TODO*/ },

            ) {
                Text(text = "Install")
            }
        }
    }
}