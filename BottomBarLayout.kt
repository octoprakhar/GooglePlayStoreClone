package com.example.googleplaystorew1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun BottomBarLayout(
    onGameIconClicked: () -> Unit,
    onAppIconClicked : () -> Unit,
    onOfferIconClicked : () -> Unit,
    onSearchIconClicked: () -> Unit,
    clickedIcon : Int
){

    var clickedIcon by remember {
        mutableStateOf<Int>(clickedIcon)
    }
    val bottomBarItemList: List<BottomBarItem> = listOf(
        BottomBarItem(
            icon = R.drawable.baseline_videogame_asset_24,
            name = "Games"
        ),
        BottomBarItem(
            R.drawable.baseline_apps_24,
            name = "Apps"
        ),
        BottomBarItem(
            R.drawable.baseline_search_24,
            name = "Search"
        ),
        BottomBarItem(
            R.drawable.baseline_local_offer_24,
            name = "Offers"
        ),
        BottomBarItem(
            R.drawable.baseline_book_24,
            name = "Books"
        )
    )
    BottomAppBar (
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ){
        Row (
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            bottomBarItemList.forEach {
                    item->
                BottomBarItemLayout(
                    item = item,
                    isSelected = clickedIcon == item.icon,
                    onClick = {
                        clickedIcon = item.icon
                        when (clickedIcon) {
                            R.drawable.baseline_videogame_asset_24 -> onGameIconClicked()
                            R.drawable.baseline_apps_24 -> onAppIconClicked()
                            R.drawable.baseline_local_offer_24 -> onOfferIconClicked()
                            R.drawable.baseline_search_24 -> onSearchIconClicked()
                        }
                    }
                )
            }
        }

    }
}

@Composable
fun BottomBarItemLayout(item: BottomBarItem, isSelected : Boolean, onClick : ()-> Unit ){

    Column (
        modifier = Modifier.padding(4.dp)
    ){
        IconButton(onClick = onClick) {
            Icon(
                painter = painterResource(id = item.icon),
                contentDescription = item.name,
                tint = if (isSelected) Color.Blue else Color.Black
            )
        }
        Text(text = item.name)
    }
}

data class BottomBarItem(
    val icon : Int,
    val name : String
)