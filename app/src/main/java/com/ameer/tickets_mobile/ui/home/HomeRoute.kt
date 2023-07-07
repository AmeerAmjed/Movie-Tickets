package com.ameer.tickets_mobile.ui.home

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.ameer.tickets_mobile.ui.navigation.MainRoute


private const val ROUTE = MainRoute.Home
fun NavController.navigateToHomeScreen() {
    popBackStack()
}

fun NavGraphBuilder.homeRoute(navController: NavController) {
    composable(ROUTE) { HomeScreen(navController) }
}
