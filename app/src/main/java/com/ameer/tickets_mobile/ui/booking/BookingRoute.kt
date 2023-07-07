package com.ameer.tickets_mobile.ui.booking

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.ameer.tickets_mobile.ui.navigation.MainRoute


private const val ROUTE = MainRoute.booking


fun NavController.navigateToBooKingScreen() {
    navigate(ROUTE)
}

fun NavGraphBuilder.bookingRoute(navController: NavController) {
    composable(ROUTE) { BookingScreen(navController) }
}
