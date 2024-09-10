package com.example.googleplaystorew1

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.googleplaystorew1.appscreenhelpers.RecommendedItemAlign
import com.example.googleplaystorew1.appscreenhelpers.SponsoredItems
import com.example.googleplaystorew1.topbars.TopBarOne

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppScreenScaffold(
    onGameIconClicked : () -> Unit,
    onAppIconClicked : () -> Unit,
    onOfferIconClicked : () -> Unit,
    onSearchIconClicked: () -> Unit,
    onTopChartsClicked: () -> Unit,
    onChildrenClicked: () -> Unit
    ){

    val scrollBehaviorPinned = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
    val clickedIcon = R.drawable.baseline_apps_24

    val lazyRowItems : List<String> = listOf("For you", "Top charts", "Children", "Categories", "Game", "Books")

    var selectedItem by remember {
        mutableStateOf<String?>("For you")
    }

    Scaffold(
        topBar = { TopBarOne(scrollBehavior = scrollBehaviorPinned) },
        bottomBar = {
            BottomBarLayout(
                onGameIconClicked = onGameIconClicked,
                onAppIconClicked = onAppIconClicked,
                onOfferIconClicked = onOfferIconClicked,
                onSearchIconClicked = onSearchIconClicked,
                clickedIcon = clickedIcon


            )
                    },
        modifier = Modifier.fillMaxSize().nestedScroll(scrollBehaviorPinned.nestedScrollConnection)
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            item {
                LazyRow (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.Start
                ){
                    items(lazyRowItems){
                        item: String ->

                            Text(
                                text = item,
                                color = if (item == selectedItem) Color.Blue else Color.Black,
                                modifier = Modifier
                                    .padding(horizontal = 8.dp)
                                    .clickable {
                                        selectedItem = item
                                        when(selectedItem){
                                            "Top charts" -> onTopChartsClicked()
                                            "Children" -> onChildrenClicked()
                                        }
                                    }
                            )


                    }

                }
            }
            item{
                HorizontalDivider(thickness = 4.dp)
            }
            item{
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(text = "Recommended for you", fontSize = 24.sp)
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                            contentDescription = null
                        )
                    }
                }
            }
            item{
                RecommendedItemAlign()
            }
            item{
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Row (
                        horizontalArrangement = Arrangement.Center
                    ){
                        Text(text = "Sponsored : ")
                        Text(text = "Suggested for You", fontSize = 24.sp)


                    }

                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.MoreVert,
                            contentDescription = null
                        )
                    }
                }
            }
            item{
                SponsoredItems()
            }
            item{
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(text = "Based on your recent activity", fontSize = 24.sp)
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                            contentDescription = null
                        )
                    }
                }
            }
            item{
                RecommendedItemAlign()
            }
            item{
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(text = "Editors' Choice apps", fontSize = 24.sp)
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                            contentDescription = null
                        )
                    }
                }
            }
            item{
                SponsoredItems()
            }
            item{
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(text = "Educational", fontSize = 24.sp)
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                            contentDescription = null
                        )
                    }
                }
            }
            item{
                SponsoredItems()
            }
            item{
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Row (
                        horizontalArrangement = Arrangement.Center
                    ){
                        Text(text = "Sponsored : ")
                        Text(text = "Suggested for You", fontSize = 24.sp)


                    }

                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.MoreVert,
                            contentDescription = null
                        )
                    }
                }
            }
            item{
                RecommendedItemAlign()
            }
            item{
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(text = "Social Networking", fontSize = 24.sp)
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                            contentDescription = null
                        )
                    }
                }
            }
            item{
                SponsoredItems()
            }
            item{
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(text = "Bus & train travel", fontSize = 24.sp)
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                            contentDescription = null
                        )
                    }
                }
            }
            item{
                SponsoredItems()
            }
        }
    }
}