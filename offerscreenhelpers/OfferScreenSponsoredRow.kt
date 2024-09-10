package com.example.googleplaystorew1.offerscreenhelpers

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.example.googleplaystorew1.R

@Composable
fun OfferScreenSponsoredRow(){
    val offerScreenSponsoredLayoutList : List<OfferScreenLayoutThreeItems> = listOf(
        OfferScreenLayoutThreeItems(
                boxHeight = 200.dp,
                boxWidth = 200.dp,
                boxPadding = PaddingValues(16.dp),
                cornerRound = 20.dp,
                image = R.drawable.dragonimage,
                content = {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 8.dp)
                            .background(Color.LightGray)
                    ) {
                        Text(text = "\u20B91,999.00", textDecoration = TextDecoration.LineThrough, color = Color.Gray)
                        Text(text = "₹282.00")


                    }
                }
            ),
        OfferScreenLayoutThreeItems(
            boxHeight = 200.dp,
            boxWidth = 200.dp,
            boxPadding = PaddingValues(16.dp),
            cornerRound = 20.dp,
            image = R.drawable.dragonimage,
            content = {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp)
                        .background(Color.LightGray)
                ) {
                    Text(text = "\u20B91,999.00", textDecoration = TextDecoration.LineThrough, color = Color.Gray)
                    Text(text = "₹282.00")


                }
            }
        ),
        OfferScreenLayoutThreeItems(
            boxHeight = 200.dp,
            boxWidth = 200.dp,
            boxPadding = PaddingValues(16.dp),
            cornerRound = 20.dp,
            image = R.drawable.dragonimage,
            content = {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp)
                        .background(Color.LightGray)
                ) {
                    Text(text = "\u20B91,999.00", textDecoration = TextDecoration.LineThrough, color = Color.Gray)
                    Text(text = "₹282.00")


                }
            }
        ),
        OfferScreenLayoutThreeItems(
            boxHeight = 200.dp,
            boxWidth = 200.dp,
            boxPadding = PaddingValues(16.dp),
            cornerRound = 20.dp,
            image = R.drawable.dragonimage,
            content = {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp)
                        .background(Color.LightGray)
                ) {
                    Text(text = "\u20B91,999.00", textDecoration = TextDecoration.LineThrough, color = Color.Gray)
                    Text(text = "₹282.00")


                }
            }
        ),
        OfferScreenLayoutThreeItems(
            boxHeight = 200.dp,
            boxWidth = 200.dp,
            boxPadding = PaddingValues(16.dp),
            cornerRound = 20.dp,
            image = R.drawable.dragonimage,
            content = {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp)
                        .background(Color.LightGray)
                ) {
                    Text(text = "\u20B91,999.00", textDecoration = TextDecoration.LineThrough, color = Color.Gray)
                    Text(text = "₹282.00")


                }
            }
        ),OfferScreenLayoutThreeItems(
            boxHeight = 200.dp,
            boxWidth = 200.dp,
            boxPadding = PaddingValues(16.dp),
            cornerRound = 20.dp,
            image = R.drawable.dragonimage,
            content = {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp)
                        .background(Color.LightGray)
                ) {
                    Text(text = "\u20B91,999.00", textDecoration = TextDecoration.LineThrough, color = Color.Gray)
                    Text(text = "₹282.00")


                }
            }
        ),OfferScreenLayoutThreeItems(
            boxHeight = 200.dp,
            boxWidth = 200.dp,
            boxPadding = PaddingValues(16.dp),
            cornerRound = 20.dp,
            image = R.drawable.dragonimage,
            content = {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp)
                        .background(Color.LightGray)
                ) {
                    Text(text = "\u20B91,999.00", textDecoration = TextDecoration.LineThrough, color = Color.Gray)
                    Text(text = "₹282.00")


                }
            }
        ),OfferScreenLayoutThreeItems(
            boxHeight = 200.dp,
            boxWidth = 200.dp,
            boxPadding = PaddingValues(16.dp),
            cornerRound = 20.dp,
            image = R.drawable.dragonimage,
            content = {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp)
                        .background(Color.LightGray)
                ) {
                    Text(text = "\u20B91,999.00", textDecoration = TextDecoration.LineThrough, color = Color.Gray)
                    Text(text = "₹282.00")


                }
            }
        ),OfferScreenLayoutThreeItems(
            boxHeight = 200.dp,
            boxWidth = 200.dp,
            boxPadding = PaddingValues(16.dp),
            cornerRound = 20.dp,
            image = R.drawable.dragonimage,
            content = {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp)
                        .background(Color.LightGray)
                ) {
                    Text(text = "\u20B91,999.00", textDecoration = TextDecoration.LineThrough, color = Color.Gray)
                    Text(text = "₹282.00")


                }
            }
        ),OfferScreenLayoutThreeItems(
            boxHeight = 200.dp,
            boxWidth = 200.dp,
            boxPadding = PaddingValues(16.dp),
            cornerRound = 20.dp,
            image = R.drawable.dragonimage,
            content = {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp)
                        .background(Color.LightGray)
                ) {
                    Text(text = "\u20B91,999.00", textDecoration = TextDecoration.LineThrough, color = Color.Gray)
                    Text(text = "₹282.00")


                }
            }
        )





        )

    LazyRow(
        modifier = Modifier.fillMaxWidth()
    ) {
        items(offerScreenSponsoredLayoutList){
            item: OfferScreenLayoutThreeItems ->
            OfferScreenLayoutThree(offerScreenLayoutThreeItems = item)
        }
    }

}