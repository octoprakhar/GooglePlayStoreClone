package com.example.googleplaystorew1.appscreenhelpers

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.googleplaystorew1.R

@Composable
fun RecommendedItemAlign(){
    val recommendedItemsList : List<RecommendedItemsContent> = listOf(
        RecommendedItemsContent(
            image = R.drawable.baseline_attach_money_24,
            name = "Zepto 10-min",
            description = "Grocery Delivery",
            rating = 4.6
        ),
        RecommendedItemsContent(
            R.drawable.baseline_agriculture_24,
            name = "MOj",
            description = "Videos",
            rating = 4.2
        ),
        RecommendedItemsContent(
            R.drawable.baseline_airline_seat_recline_extra_24,
            name = "Elsa Speak",
            description = "English Learning",
            rating = 4.4
        ),
        RecommendedItemsContent(
            R.drawable.baseline_conveyor_belt_24,
            name = "Zepto 10-min",
            description = "Grocery Delivery",
            rating = 4.6
        ),
        RecommendedItemsContent(
            R.drawable.baseline_coronavirus_24,
            name = "Snapchat",
            description = "Videos",
            rating = 4.3
        ),
        RecommendedItemsContent(
            R.drawable.baseline_airport_shuttle_24,
            name = "Instagram Lite",
            description = "Social Media",
            rating = 3.9
        ),
    )
    LazyRow (
        modifier = Modifier.padding(16.dp)
    ){
        items(recommendedItemsList){
            item: RecommendedItemsContent ->
            RecomendedItems(item = item)
        }
    }
}

@Composable
fun RecomendedItems(item : RecommendedItemsContent){
    Column (
        modifier = Modifier.padding(8.dp).clickable(onClick = {})

    ){
        Icon(
            painter = painterResource(id = item.image) ,
            contentDescription = null,
            modifier = Modifier.size(128.dp).border(2.dp, Color.Black)
        )
        Text(text = item.name)
        Text(text = item.description)
        Text(text = "${item.rating}")
    }
}

data class RecommendedItemsContent(
    val image : Int,
    val name : String,
    val description : String,
    val rating : Double
)