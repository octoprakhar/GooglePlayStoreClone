package com.example.googleplaystorew1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.googleplaystorew1.multiscreensuihelpers.HeadingLayoutTwo
import com.example.googleplaystorew1.multiscreensuihelpers.MultiScreenLayoutOne
import com.example.googleplaystorew1.searchscreenhelpers.SearchScreenLayoutOne
import com.example.googleplaystorew1.searchscreenhelpers.SearchScreenLayoutOneItems
import com.example.googleplaystorew1.topbars.TopBarTwo

@Composable
fun SearchScreenScaffold(
    onGameIconClicked : () -> Unit,
    onAppIconClicked : () -> Unit,
    onOfferIconClicked : () -> Unit,
    onSearchIconClicked: () -> Unit,
    onClickSearch : () -> Unit

){
    Scaffold (
        topBar = { TopBarTwo(
            onClickSearch = onClickSearch
        )},
        bottomBar = { BottomBarLayout(
            onGameIconClicked = { onGameIconClicked() },
            onAppIconClicked = { onAppIconClicked() },
            onOfferIconClicked = { onOfferIconClicked() },
            onSearchIconClicked = { onSearchIconClicked() },
            clickedIcon = R.drawable.baseline_search_24
        )}
    ){innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ){
            item { Text(text = "You might like") }
            item {
                Column {
                    Row (
                        modifier = Modifier.fillMaxWidth()
                    ){
                        SearchScreenLayoutOne(searchScreenLayoutOneItems = SearchScreenLayoutOneItems(
                            height = 150.dp,
                            width = 200.dp,
                            padding = PaddingValues(16.dp),
                            contentPadding = PaddingValues(8.dp),
                            name = "Cricket Games",
                            cornerRounding = 16.dp,
                            imageVector = Icons.Default.Search,
                            onClick = {}
                        ))
                        SearchScreenLayoutOne(searchScreenLayoutOneItems = SearchScreenLayoutOneItems(
                            height = 150.dp,
                            width = 200.dp,
                            padding = PaddingValues(16.dp),
                            contentPadding = PaddingValues(8.dp),
                            name = "Cricket Games",
                            cornerRounding = 16.dp,
                            imageVector = Icons.Default.Search,
                            onClick = {}
                        ))
                    }
                    Row (
                        modifier = Modifier.fillMaxWidth()
                    ){
                        SearchScreenLayoutOne(searchScreenLayoutOneItems = SearchScreenLayoutOneItems(
                            height = 150.dp,
                            width = 200.dp,
                            padding = PaddingValues(16.dp),
                            contentPadding = PaddingValues(8.dp),
                            name = "Cricket Games",
                            cornerRounding = 16.dp,
                            imageVector = Icons.Default.Search,
                            onClick = {}
                        ))
                        SearchScreenLayoutOne(searchScreenLayoutOneItems = SearchScreenLayoutOneItems(
                            height = 150.dp,
                            width = 200.dp,
                            padding = PaddingValues(16.dp),
                            contentPadding = PaddingValues(8.dp),
                            name = "Cricket Games",
                            cornerRounding = 16.dp,
                            imageVector = Icons.Default.Search,
                            onClick = {}
                        ))
                    }
                }
            }
            item {
                Text(text = "Explore games")
            }
            item {
                Column {
                    Row (
                        modifier = Modifier.fillMaxWidth()
                    ){
                        SearchScreenLayoutOne(searchScreenLayoutOneItems = SearchScreenLayoutOneItems(
                            height = 150.dp,
                            width = 200.dp,
                            padding = PaddingValues(16.dp),
                            contentPadding = PaddingValues(8.dp),
                            name = "Cricket Games",
                            cornerRounding = 16.dp,
                            imageVector = Icons.Default.Search,
                            onClick = {}
                        ))
                        SearchScreenLayoutOne(searchScreenLayoutOneItems = SearchScreenLayoutOneItems(
                            height = 150.dp,
                            width = 200.dp,
                            padding = PaddingValues(16.dp),
                            contentPadding = PaddingValues(8.dp),
                            name = "Cricket Games",
                            cornerRounding = 16.dp,
                            imageVector = Icons.Default.Search,
                            onClick = {}
                        ))
                    }
                    Row (
                        modifier = Modifier.fillMaxWidth()
                    ){
                        SearchScreenLayoutOne(searchScreenLayoutOneItems = SearchScreenLayoutOneItems(
                            height = 150.dp,
                            width = 200.dp,
                            padding = PaddingValues(16.dp),
                            contentPadding = PaddingValues(8.dp),
                            name = "Cricket Games",
                            cornerRounding = 16.dp,
                            imageVector = Icons.Default.Search,
                            onClick = {}
                        ))
                        SearchScreenLayoutOne(searchScreenLayoutOneItems = SearchScreenLayoutOneItems(
                            height = 150.dp,
                            width = 200.dp,
                            padding = PaddingValues(16.dp),
                            contentPadding = PaddingValues(8.dp),
                            name = "Cricket Games",
                            cornerRounding = 16.dp,
                            imageVector = Icons.Default.Search,
                            onClick = {}
                        ))
                    }
                    Row (
                        modifier = Modifier.fillMaxWidth()
                    ){
                        SearchScreenLayoutOne(searchScreenLayoutOneItems = SearchScreenLayoutOneItems(
                            height = 150.dp,
                            width = 200.dp,
                            padding = PaddingValues(16.dp),
                            contentPadding = PaddingValues(8.dp),
                            name = "Cricket Games",
                            cornerRounding = 16.dp,
                            imageVector = Icons.Default.Search,
                            onClick = {}
                        ))
                        SearchScreenLayoutOne(searchScreenLayoutOneItems = SearchScreenLayoutOneItems(
                            height = 150.dp,
                            width = 200.dp,
                            padding = PaddingValues(16.dp),
                            contentPadding = PaddingValues(8.dp),
                            name = "Cricket Games",
                            cornerRounding = 16.dp,
                            imageVector = Icons.Default.Search,
                            onClick = {}
                        ))
                    }
                }
            }
            item {
                HeadingLayoutTwo(
                    fontSize = 16.sp,
                    onClick = {}
                )
            }
            item {
                MultiScreenLayoutOne()
            }
            item {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    CircularProgressIndicator(
                        modifier = Modifier.size(50.dp).padding(vertical = 8.dp)
                    )
                }
            }
        }
        
    }

}