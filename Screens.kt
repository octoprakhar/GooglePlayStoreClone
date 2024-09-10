package com.example.googleplaystorew1

sealed class Screens (val route : String){

    object AppScreen : Screens("appscreen")
    object GameScreen : Screens("gamescreen")
    object OfferScreen : Screens("offerscreen")
    object SearchScreen : Screens("searchscreen")
    object SearchingScreen : Screens("searchingscreen")
    object TopChartsScreen : Screens("topchartsscreen")
    object ChildrenScreen : Screens("childrenscreen")


}