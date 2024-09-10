package com.example.googleplaystorew1.appscreenhelpers

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.googleplaystorew1.R

@Composable
fun SponsoredItems(){
    val sponsoredItemsList : List<SponsoredItemsContent> = listOf(
        SponsoredItemsContent(
            image = R.drawable.baseline_attach_money_24,
            name = "Zepto 10-min",
            description = "Grocery Delivery",
            rating = 4.6,
            spacing = "44 MB"
        ),
        SponsoredItemsContent(
            R.drawable.baseline_agriculture_24,
            name = "MOj",
            description = "Videos",
            rating = 4.2,
            spacing = "44 MB"
        ),
        SponsoredItemsContent(
            R.drawable.baseline_airline_seat_recline_extra_24,
            name = "Elsa Speak",
            description = "English Learning",
            rating = 4.4,
            spacing = "44 MB"
        ),
        SponsoredItemsContent(
            R.drawable.baseline_conveyor_belt_24,
            name = "Zepto 10-min",
            description = "Grocery Delivery",
            rating = 4.6,
            spacing = "44 MB"
        ),
        SponsoredItemsContent(
            R.drawable.baseline_coronavirus_24,
            name = "Snapchat",
            description = "Videos",
            rating = 4.3,
            spacing = "44 MB"
        ),
        SponsoredItemsContent(
            R.drawable.baseline_airport_shuttle_24,
            name = "Instagram Lite",
            description = "Social Media",
            rating = 3.9,
            spacing = "44 MB"
        ),
        SponsoredItemsContent(
            R.drawable.baseline_airport_shuttle_24,
            name = "Instagram Lite",
            description = "Social Media",
            rating = 3.9,
            spacing = "44 MB"
        ),
        SponsoredItemsContent(
            R.drawable.baseline_airport_shuttle_24,
            name = "Instagram Lite",
            description = "Social Media",
            rating = 3.9,
            spacing = "44 MB"
        ),
        SponsoredItemsContent(
            R.drawable.baseline_airport_shuttle_24,
            name = "Instagram Lite",
            description = "Social Media",
            rating = 3.9,
            spacing = "44 MB"
        ),
        SponsoredItemsContent(
            R.drawable.baseline_airport_shuttle_24,
            name = "Instagram Lite",
            description = "Social Media",
            rating = 3.9,
            spacing = "44 MB"
        ),
        SponsoredItemsContent(
            R.drawable.baseline_airport_shuttle_24,
            name = "Instagram Lite",
            description = "Social Media",
            rating = 3.9,
            spacing = "44 MB"
        ),
        SponsoredItemsContent(
            R.drawable.baseline_airport_shuttle_24,
            name = "Instagram Lite",
            description = "Social Media",
            rating = 3.9,
            spacing = "44 MB"
        ),
        SponsoredItemsContent(
            R.drawable.baseline_airport_shuttle_24,
            name = "Instagram Lite",
            description = "Social Media",
            rating = 3.9,
            spacing = "44 MB"
        ),
        SponsoredItemsContent(
            R.drawable.baseline_airport_shuttle_24,
            name = "Instagram Lite",
            description = "Social Media",
            rating = 3.9,
            spacing = "44 MB"
        ),
        SponsoredItemsContent(
            R.drawable.baseline_airport_shuttle_24,
            name = "Instagram Lite",
            description = "Social Media",
            rating = 3.9,
            spacing = "44 MB"
        ),
        SponsoredItemsContent(
            R.drawable.baseline_airport_shuttle_24,
            name = "Instagram Lite",
            description = "Social Media",
            rating = 3.9,
            spacing = "44 MB"
        ),
        SponsoredItemsContent(
            R.drawable.baseline_airport_shuttle_24,
            name = "Instagram Lite",
            description = "Social Media",
            rating = 3.9,
            spacing = "44 MB"
        ),
        SponsoredItemsContent(
            R.drawable.baseline_airport_shuttle_24,
            name = "Instagram Lite",
            description = "Social Media",
            rating = 3.9,
            spacing = "44 MB"
        ),
        SponsoredItemsContent(
            R.drawable.baseline_airport_shuttle_24,
            name = "Instagram Lite",
            description = "Social Media",
            rating = 3.9,
            spacing = "44 MB"
        ),
        SponsoredItemsContent(
            R.drawable.baseline_airport_shuttle_24,
            name = "Instagram Lite",
            description = "Social Media",
            rating = 3.9,
            spacing = "44 MB"
        )
    )

    val groupedItem = sponsoredItemsList.chunked(3)

    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        items(groupedItem){
            group->
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)
            ){
                group.forEach { 
                    item->
                    SponsoredItem(item = item)
                }
            }
        }
    }


}

@Composable
fun SponsoredItem(item: SponsoredItemsContent){
    Row (
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .clickable(onClick = {/*TODO*/}),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ){
        Icon(
            painter = painterResource(id = item.image) ,
            contentDescription = null,
            modifier = Modifier
                .size(72.dp)
                .padding(end = 8.dp)
                .border(2.dp, Color.Black)

        )
        Column {
            Text(text = item.name)
            Text(text = item.description, fontSize = 10.sp)
            Row (
                modifier = Modifier.padding(4.dp)
            ){
                Text(text = "${item.rating}", fontSize = 10.sp, modifier = Modifier.padding(end = 4.dp))
                Text(text = item.spacing, fontSize = 10.sp)

            }
        }

    }
}

data class SponsoredItemsContent(
    val image : Int,
    val name : String,
    val description : String,
    val rating : Double,
    val spacing : String
)