package com.example.googleplaystorew1

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.googleplaystorew1.topbars.TopBarOne

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopChartsScreen(
    onGameIconClicked : () -> Unit,
    onAppIconClicked : () -> Unit,
    onOfferIconClicked : () -> Unit,
    onSearchIconClicked: () -> Unit,
    onTopChartsClicked: () -> Unit,
    onChildrenClicked: () -> Unit


){
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(rememberTopAppBarState())
    val lazyRowItems : List<String> = listOf("For you", "Top charts", "Children", "Categories", "Game", "Books")
    var selectedItem by remember {
        mutableStateOf<String?>("For you")
    }


    Scaffold (
        topBar = { TopBarOne(scrollBehavior = scrollBehavior)},
        bottomBar = { BottomBarLayout(
            onGameIconClicked = onGameIconClicked,
            onAppIconClicked = onAppIconClicked,
            onOfferIconClicked = onOfferIconClicked,
            onSearchIconClicked = onSearchIconClicked,
            clickedIcon = R.drawable.baseline_apps_24
        )}
    ){innerPadding->
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
                                    when (selectedItem) {
                                        "Top charts" -> onTopChartsClicked()
                                        "Children" -> onChildrenClicked()
                                    }
                                }
                        )


                    }

                }
            }
            item { 
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start
                ){
                    Box(modifier = Modifier
                        .padding(horizontal = 8.dp)
                        .height(30.dp)
                        .width(150.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color(0xFF99cff7), RoundedCornerShape(8.dp))
                        .clickable(onClick = {})
                    ){
                        Row (
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(4.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ){
                            Text(text = "Top Related")
                            Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = null)
                        }
                    }
                    Box(modifier = Modifier
                        .height(30.dp)
                        .width(150.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color(0xFF99cff7), RoundedCornerShape(8.dp))
                        .clickable(onClick = {})
                    ){
                        Row (
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(4.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ){
                            Text(text = "Categories")
                            Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = null)
                        }
                    }
                }
            }
            item {
                TopChartsScreenHelper()

            }
            item {
                TopChartsScreenHelper()

            }
            item {
                TopChartsScreenHelper()

            }
            item {
                TopChartsScreenHelper()

            }
            item {
                TopChartsScreenHelper()

            }
            item {
                TopChartsScreenHelper()

            }
            item {
                TopChartsScreenHelper()

            }
            item {
                TopChartsScreenHelper()

            }
            item {
                TopChartsScreenHelper()

            }
            item {
                TopChartsScreenHelper()

            }
            item {
                TopChartsScreenHelper()


            }
            item {
                TopChartsScreenHelper()

            }
            item {
                TopChartsScreenHelper()

            }
            item {
                TopChartsScreenHelper()

            }
            item {
                TopChartsScreenHelper()

            }
        }

    }
}