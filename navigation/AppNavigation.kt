package com.example.googleplaystorew1.navigation

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.googleplaystorew1.AppScreenScaffold
import com.example.googleplaystorew1.ChildrenScreen
import com.example.googleplaystorew1.GamesScreen
import com.example.googleplaystorew1.OfferScreen
import com.example.googleplaystorew1.Screens
import com.example.googleplaystorew1.SearchScreenScaffold
import com.example.googleplaystorew1.TopChartsScreen
import com.example.googleplaystorew1.searchscreenhelpers.SearchingScreen

@Composable
fun AppNavigation(context: Context){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.AppScreen.route) {
        composable(Screens.AppScreen.route){
            AppScreenScaffold(
                onGameIconClicked = {navController.navigate(Screens.GameScreen.route)},
                onAppIconClicked = {navController.navigate(Screens.AppScreen.route)},
                onOfferIconClicked = {navController.navigate(Screens.OfferScreen.route)},
                onSearchIconClicked = {navController.navigate(Screens.SearchScreen.route)},
                onTopChartsClicked = {navController.navigate(Screens.TopChartsScreen.route)},
                onChildrenClicked = {navController.navigate(Screens.ChildrenScreen.route)}
            )
        }
        composable(Screens.GameScreen.route){
            GamesScreen(
                onGameIconClicked = {navController.navigate(Screens.GameScreen.route)},
                onAppIconClicked = {navController.navigate(Screens.AppScreen.route)},
                onOfferIconClicked = {navController.navigate(Screens.OfferScreen.route)},
                onSearchIconClicked = {navController.navigate(Screens.SearchScreen.route)},
                onTopChartsClicked = {navController.navigate(Screens.TopChartsScreen.route)},
                onChildrenClicked = {navController.navigate(Screens.ChildrenScreen.route)},
                context = context
            )
        }
        composable(Screens.OfferScreen.route){
            OfferScreen(
                onGameIconClicked = {navController.navigate(Screens.GameScreen.route)},
                onAppIconClicked = {navController.navigate(Screens.AppScreen.route)},
                onOfferIconClicked = {navController.navigate(Screens.OfferScreen.route)},
                onSearchIconClicked = {navController.navigate(Screens.SearchScreen.route)},
                context = context
            )
        }
        composable(Screens.SearchScreen.route){
            SearchScreenScaffold(
                onGameIconClicked = {navController.navigate(Screens.GameScreen.route)},
                onAppIconClicked = {navController.navigate(Screens.AppScreen.route)},
                onOfferIconClicked = {navController.navigate(Screens.OfferScreen.route)},
                onSearchIconClicked = {navController.navigate(Screens.SearchScreen.route)},
                onClickSearch = {navController.navigate(Screens.SearchingScreen.route)}
            )
        }
        composable(Screens.SearchingScreen.route){
            SearchingScreen()
        }
        composable(Screens.TopChartsScreen.route){
            TopChartsScreen(
                onGameIconClicked = {navController.navigate(Screens.GameScreen.route)},
                onAppIconClicked = {navController.navigate(Screens.AppScreen.route)},
                onOfferIconClicked = {navController.navigate(Screens.OfferScreen.route)},
                onSearchIconClicked = {navController.navigate(Screens.SearchScreen.route)},
                onTopChartsClicked = {navController.navigate(Screens.TopChartsScreen.route)},
                onChildrenClicked = {navController.navigate(Screens.ChildrenScreen.route)}


            )
        }
        composable(Screens.ChildrenScreen.route){
            ChildrenScreen(
                onGameIconClicked = {navController.navigate(Screens.GameScreen.route)},
                onAppIconClicked = {navController.navigate(Screens.AppScreen.route)},
                onOfferIconClicked = {navController.navigate(Screens.OfferScreen.route)},
                onSearchIconClicked = {navController.navigate(Screens.SearchScreen.route)},
                onTopChartsClicked = {navController.navigate(Screens.TopChartsScreen.route)},
                onChildrenClicked = {navController.navigate(Screens.ChildrenScreen.route)}

            )
        }
    }
}