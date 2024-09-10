package com.example.googleplaystorew1

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.googleplaystorew1.multiscreensuihelpers.HeadingLayoutOne
import com.example.googleplaystorew1.multiscreensuihelpers.HeadingLayoutTwo
import com.example.googleplaystorew1.multiscreensuihelpers.MultiScreenLayoutOne
import com.example.googleplaystorew1.offerscreenhelpers.OfferScreenLayoutOne
import com.example.googleplaystorew1.offerscreenhelpers.OfferScreenLayoutOneItems
import com.example.googleplaystorew1.offerscreenhelpers.OfferScreenLayoutPager
import com.example.googleplaystorew1.offerscreenhelpers.OfferScreenLayoutThree
import com.example.googleplaystorew1.offerscreenhelpers.OfferScreenLayoutThreeItems
import com.example.googleplaystorew1.offerscreenhelpers.OfferScreenLayoutTwo
import com.example.googleplaystorew1.offerscreenhelpers.OfferScreenLayoutTwoItems
import com.example.googleplaystorew1.offerscreenhelpers.OfferScreenSponsoredRow
import com.example.googleplaystorew1.topbars.TopBarOne

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OfferScreen(
    onGameIconClicked : () -> Unit,
    onAppIconClicked : () -> Unit,
    onOfferIconClicked : () -> Unit,
    onSearchIconClicked: () -> Unit,
    context: Context
){
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(rememberTopAppBarState())
    val clickedIcon = R.drawable.baseline_local_offer_24
    val googlePlayPointsImageBitmap = ImageBitmap.imageResource(id = R.drawable.googleplaypointsimage)

    Scaffold(


        topBar = {
            TopBarOne(scrollBehavior)

                 },
        bottomBar = {
            BottomBarLayout(
                onGameIconClicked = onGameIconClicked,
                onAppIconClicked = onAppIconClicked,
                onOfferIconClicked = onOfferIconClicked,
                onSearchIconClicked = onSearchIconClicked,
                clickedIcon = clickedIcon
            )
        },
        modifier = Modifier
            .fillMaxSize()
            .nestedScroll(scrollBehavior.nestedScrollConnection)
    ){ innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ){
            item{
                Text(text = "Limited-time offer", fontSize = 20.sp, modifier = Modifier.padding(8.dp))
            }
            item {
                OfferScreenLayoutOne(
                    offerScreenLayoutOneItems = OfferScreenLayoutOneItems(
                        hasVideo = false,
                        hasButton = true,
                        video = null,
                        image = R.drawable.trainticketbooking,
                        textInButton = "open",
                        title = "ixigo Trains: Ticket Booking",
                        expiryDate = "12/09/24",
                        heading = "Assured Filex: Free Cancellation and Modification of Trains Bookings",
                        description = "ixigo 'Assured Flex' is a one-stop solution for all your train bookings."
                    ),
                    context = context
                )
            }
            item{
                Text(text = "Offer available this week", fontSize = 20.sp, modifier = Modifier.padding(8.dp))
            }
            item {
                OfferScreenLayoutOne(
                    offerScreenLayoutOneItems = OfferScreenLayoutOneItems(
                        hasVideo = false,
                        hasButton = false,
                        video = null,
                        image = R.drawable.subwaysurfers,
                        textInButton = null,
                        title = "Subway Surfers",
                        expiryDate = "16/09/24",
                        heading = "Get over 450% more with the Eco Bundle!",
                        description = "Meet your new Eco heroes! Get Aina, Liu and the Croc Board in this very special bundle offer, alongside free Keys, Coins and Headstarts, an..."
                    ),
                    context = context
                )
            }
            item{
                Text(text = "Offer in Apps you may like", fontSize = 20.sp, modifier = Modifier.padding(8.dp))
            }
            item {

                OfferScreenLayoutPager()
            }
            item{
                Text(text = "Offer in Games you may like", fontSize = 20.sp, modifier = Modifier.padding(8.dp))
            }
            item {

                OfferScreenLayoutPager()
            }
            item {
                HeadingLayoutTwo(
                    fontSize = 20.sp,
                    onClick = {/*TODO*/}
                )
            }
            item {
                OfferScreenSponsoredRow()

            }
            item {
                MultiScreenLayoutOne()
            }
            item {
                Box(modifier = Modifier
                    .padding(vertical = 16.dp)
                    .fillMaxWidth()
                    .height(300.dp)
                    .background(Color.LightGray)

                ){
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        Spacer(modifier = Modifier.height(32.dp))

                        Row (
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Box(
                                modifier = Modifier
                                    .height(20.dp)
                                    .width(30.dp)
                                    .padding(end = 8.dp)
                            ){
                                Image(
                                    bitmap = googlePlayPointsImageBitmap,
                                    contentDescription = null,
                                    contentScale = ContentScale.Fit
                                )
                            }
                            Text(text = "Google Play Points", color = Color.DarkGray, fontSize = 12.sp)
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        
                        Text(
                            text = "Earn Google Play Points and rewards",
                            fontWeight = FontWeight.Bold,
                            fontSize = 26.sp,

                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        
                        Text(
                            text = "Use points for game discounts or special in-app items",
                            color = Color.DarkGray,

                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        OutlinedButton(onClick = { /*TODO*/ }) {
                            Text(text = "Learn more")
                        }
                    }
                }
            }
            item {
                Spacer(modifier = Modifier.height(32.dp))

            }
            item{
                Text(text = "Got a code?", fontWeight = FontWeight.Bold, modifier = Modifier.padding(horizontal = 16.dp), fontSize = 20.sp)
            }
            
            item{
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Text(
                        text = "REdeem a PLay promo code or gift card here. If you have a code for a specific app, redeem it in that app.",
                        color = Color.DarkGray
                    )
                    Box(modifier = Modifier
                        .size(50.dp)
                        .border(2.dp, Color.Black))
                }
            }
            item { 
                TextButton(onClick = { /*TODO*/ }, modifier = Modifier.padding(horizontal = 16.dp)) {
                    Text(text = "Redeem code")
                }
            }
            

        }

    }
}