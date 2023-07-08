package com.ameer.tickets_mobile.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigation
import com.ameer.tickets_mobile.ui.booking.bookingRoute
import com.ameer.tickets_mobile.ui.details.detailsRoute


fun NavGraphBuilder.detailsNavigationGraph(navController: NavHostController) {
    navigation(
        startDestination = DetailsRoute.details,
        route = Graph.DETAILS,
    ) {
        detailsRoute(navController)
        bookingRoute(navController)
    }
}

object DetailsRoute {
    const val details = "details"
    const val booking = "booking"
}
