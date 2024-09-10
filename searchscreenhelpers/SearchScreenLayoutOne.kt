package com.example.googleplaystorew1.searchscreenhelpers

import android.icu.text.ListFormatter.Width
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun SearchScreenLayoutOne(searchScreenLayoutOneItems: SearchScreenLayoutOneItems){
    Box(
        modifier = Modifier
            .height(searchScreenLayoutOneItems.height)
            .width(searchScreenLayoutOneItems.width)
            .padding(searchScreenLayoutOneItems.padding)
            .clip(RoundedCornerShape(searchScreenLayoutOneItems.cornerRounding))
            .background(Color(0xFFcacccc))
            .clickable(onClick = { searchScreenLayoutOneItems.onClick() })

    ){
        Row (
            modifier = Modifier
                .fillMaxSize()
                .padding(searchScreenLayoutOneItems.contentPadding),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(text = searchScreenLayoutOneItems.name)
            if (searchScreenLayoutOneItems.imageVector != null){
                Icon(imageVector = Icons.Default.Search, contentDescription = null, tint = Color.Blue)

            }
        }
    }
}

data class SearchScreenLayoutOneItems(
    val height : Dp,
    val width: Dp,
    val padding : PaddingValues,
    val cornerRounding : Dp,
    val contentPadding : PaddingValues,
    val name : String,
    val imageVector: ImageVector?,
    val onClick :  () -> Unit
)