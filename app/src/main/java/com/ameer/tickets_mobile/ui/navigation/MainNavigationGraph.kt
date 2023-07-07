package com.ameer.tickets_mobile.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.ameer.tickets_mobile.ui.booking.bookingRoute
import com.ameer.tickets_mobile.ui.details.detailsRoute
import com.ameer.tickets_mobile.ui.home.homeRoute


@Composable
fun MainNavigationGraph(navController: NavHostController, rootNavController: NavController) {
    NavHost(
        navController = navController,
        startDestination = MainRoute.Home,
    ) {
        homeRoute(rootNavController)
        detailsRoute(navController)
        bookingRoute(navController)
    }
}

object MainRoute {
    const val Home = "home"
    const val details = "details"
    const val booking = "booking"
}
