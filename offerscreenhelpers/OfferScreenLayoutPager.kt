package com.example.googleplaystorew1.offerscreenhelpers

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.googleplaystorew1.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OfferScreenLayoutPager(){
    val offerScreenLayoutList : List<OfferScreenLayoutTwoItems> = listOf(
        OfferScreenLayoutTwoItems(
            layoutPaddingAndSize = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .clickable(onClick = {/*TODO*/ }),
            backgroundImage = R.drawable.olximagetwo,
            backgroundColor = 0xFFb55c04,
            backgroundImageAlpha = 0.9f,
            backgroundImageCoverFactor = 0.66,
            upperBoxHeight = 350.dp,
            upperBoxPadding = 2.dp,
            logo = R.drawable.olximageone,
            heading = "Claim your FREE listings worth over \u20B910,000*",
            extra = "Reward available",
            appName = "OLX: Buy & Sell Near You",
            appDescription = "Shopping",
            rating = "4.2"
        ),
        OfferScreenLayoutTwoItems(
            layoutPaddingAndSize = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .clickable(onClick = {/*TODO*/ }),
            backgroundImage = R.drawable.olximagetwo,
            backgroundColor = 0xFFb55c04,
            backgroundImageAlpha = 0.9f,
            backgroundImageCoverFactor = 0.66,
            upperBoxHeight = 350.dp,
            upperBoxPadding = 2.dp,
            logo = R.drawable.olximageone,
            heading = "Claim your FREE listings worth over \u20B910,000*",
            extra = "Reward available",
            appName = "OLX: Buy & Sell Near You",
            appDescription = "Shopping",
            rating = "4.2"
        )
    )
    val pagerState = rememberPagerState (pageCount = { offerScreenLayoutList.size })
    HorizontalPager(
        state = pagerState,
        pageSize = PageSize.Fixed(370.dp)
    ) { page: Int ->
        OfferScreenLayoutTwo(offerScreenLayoutTwoItems = offerScreenLayoutList[page])
        
    }
}