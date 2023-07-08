package com.ameer.tickets_mobile.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.ameer.tickets_mobile.ui.home.homeRoute


@Composable
fun MainNavigationGraph(navController: NavHostController, rootNavController: NavController) {
    NavHost(
        navController = navController,
        startDestination = MainRoute.Home,
    ) {
        homeRoute(rootNavController)

    }
}

object MainRoute {
    const val Home = "home"
    const val Search = "search"
    const val Tickets = "tickets"
    const val Profile = "profile"

}
