package com.example.googleplaystorew1.childrenScreenHelper

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.googleplaystorew1.R
import com.example.googleplaystorew1.appscreenhelpers.RecomendedItems
import com.example.googleplaystorew1.appscreenhelpers.RecommendedItemAlign
import com.example.googleplaystorew1.appscreenhelpers.RecommendedItemsContent

@Composable
fun LayoutTwo(){
    val imageBitmap = ImageBitmap.imageResource(id = R.drawable.spacemonkeyimage)
    val lazyListState = rememberLazyListState()


    // Calculate alpha based on how much the user has scrolled
    val alphaAnimation by remember {
        derivedStateOf {
            val firstVisibleItemScrollOffset = lazyListState.firstVisibleItemScrollOffset
            val firstVisibleItemIndex = lazyListState.firstVisibleItemIndex
            // Calculate alpha based on scroll distance (adjust maxScroll to control fade-out speed)
            val maxScroll = 500f // Adjust this value to make fade-in/out slower or faster
            val scrollProgress = firstVisibleItemIndex * maxScroll + firstVisibleItemScrollOffset
            val alpha = 1f - (scrollProgress / maxScroll).coerceIn(0f, 1f)
            alpha
        }
    }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .border(2.dp, Color.Black)
            .background(Color(0xFF3a6df0))
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 4.dp)
        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, top = 16.dp, end = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){
                Column {
                    Text(text = "Discover magical worlds", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.White)
                    Text(text = "Sci-fi and fantasy apps", color = Color.White)
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                        contentDescription = null,
                        tint = Color.White
                    )
                }
            }
            LazyRowItemAlign(imageBitmap = imageBitmap , lazyListState = lazyListState, alphaAnimation = alphaAnimation)
        }

    }
}

@Composable
fun LazyRowItemAlign(
    imageBitmap: ImageBitmap,
    alphaAnimation: Float,
    lazyListState: LazyListState
){
    val recommendedItemsList : List<LayoutTwoItems> = listOf(
        LayoutTwoItems(
            image = R.drawable.baseline_attach_money_24,
            name = "Zepto 10-min",
            description = "Grocery Delivery",
            rating = 4.6
        ),
        LayoutTwoItems(
            R.drawable.baseline_agriculture_24,
            name = "MOj",
            description = "Videos",
            rating = 4.2
        ),
        LayoutTwoItems(
            R.drawable.baseline_airline_seat_recline_extra_24,
            name = "Elsa Speak",
            description = "English Learning",
            rating = 4.4
        ),
        LayoutTwoItems(
            R.drawable.baseline_conveyor_belt_24,
            name = "Zepto 10-min",
            description = "Grocery Delivery",
            rating = 4.6
        ),
        LayoutTwoItems(
            R.drawable.baseline_coronavirus_24,
            name = "Snapchat",
            description = "Videos",
            rating = 4.3
        ),
        LayoutTwoItems(
            R.drawable.baseline_airport_shuttle_24,
            name = "Instagram Lite",
            description = "Social Media",
            rating = 3.9
        ),
    )
    LazyRow (
        modifier = Modifier.padding(top = 8.dp),
        state = lazyListState
    ){
        item { 
            Box(modifier = Modifier
                .height(150.dp)
                .width(250.dp)
                ){
                Image(
                    bitmap = imageBitmap,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize().alpha(alphaAnimation)
                )
            }
        }
        items(recommendedItemsList){
                item: LayoutTwoItems ->
            LazyRowItems(item = item)
        }
    }

}

@Composable
fun LazyRowItems(item: LayoutTwoItems){
    Column (
        modifier = Modifier
            .padding(8.dp)
            .clickable(onClick = {})

    ){
        Icon(
            painter = painterResource(id = item.image) ,
            contentDescription = null,
            modifier = Modifier
                .size(90.dp)
                .border(2.dp, Color.White),
            tint = Color.White
        )
        Text(text = item.name, color = Color.White)
        Text(text = "${item.rating}", color = Color.White)
    }

}

data class LayoutTwoItems(
    val image : Int,
    val name : String,
    val description : String,
    val rating : Double
)