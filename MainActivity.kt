package com.example.googleplaystorew1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.googleplaystorew1.navigation.AppNavigation
import com.example.googleplaystorew1.ui.theme.GooglePlaystoreW1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GooglePlaystoreW1Theme {
//                val numberList : List<String> = listOf("1","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8","2","3","4","5","6","7","8")
//                val groupedItem = numberList.chunked(3)
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
////                    SponsoredItemsDelete(pad = innerPadding)
//                    LazyRow(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(innerPadding)
//                    ) {
//                        items(groupedItem){
//                            group ->
//                            Column (
//                                modifier = Modifier.fillMaxSize().padding(8.dp)
//                            ){
//                                group.forEach {
//                                    item->
//                                    Text(text = item)
//                                }
//                            }
//                        }
//                    }
//
//                }
                AppNavigation(context = this)
            }
        }
    }
}

