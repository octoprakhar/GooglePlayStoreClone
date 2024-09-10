package com.example.googleplaystorew1.topbars

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.googleplaystorew1.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarOne(scrollBehavior: TopAppBarScrollBehavior){
    val logoBitmap = ImageBitmap.imageResource(id = R.drawable.googleplaystoreimage)
    val profileBitmap = ImageBitmap.imageResource(id = R.drawable.pletter)

    TopAppBar(
        scrollBehavior = scrollBehavior,
        title = {
            Image(
                bitmap = logoBitmap,
                contentDescription = null,
                modifier = Modifier.size(32.dp),
                contentScale = ContentScale.Fit
            )
        },
        actions = {
            Row (
//                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = null)
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Image(
                        bitmap = profileBitmap,
                        contentDescription = null,
                        modifier = Modifier.size(32.dp),
                        contentScale = ContentScale.Fit
                    )

                }
            }
        }
    )
}