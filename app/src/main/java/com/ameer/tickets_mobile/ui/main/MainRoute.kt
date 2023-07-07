package com.ameer.tickets_mobile.ui.main

import androidx.compose.material.ExperimentalMaterialApi
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.pager.ExperimentalPagerApi

private const val ROUTE = "Main"

fun NavController.navigateToMain() {
    navigate(ROUTE)
}

@ExperimentalMaterialApi
@OptIn(ExperimentalPagerApi::class)
fun NavGraphBuilder.mainRoute(navController: NavController) {

    composable(ROUTE) {
        MainScreen(
            navController = rememberNavController(),
            rootNavController = navController
        )
    }
}