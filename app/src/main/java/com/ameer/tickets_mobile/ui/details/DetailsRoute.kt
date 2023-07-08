package com.ameer.tickets_mobile.ui.details

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.ameer.tickets_mobile.ui.navigation.DetailsRoute
import com.ameer.tickets_mobile.ui.navigation.MainRoute


private const val ROUTE = DetailsRoute.details


fun NavController.navigateToDetailsScreen() {
    navigate(ROUTE)
}

fun NavGraphBuilder.detailsRoute(navController: NavController) {
    composable(ROUTE) { DetailsScreen(navController) }
}
