package com.ameer.tickets_mobile.ui.navigation


import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.ameer.tickets_mobile.ui.main.mainRoute

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun RootNavigationGraph(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = Graph.MAIN,
        route = Graph.ROOT
    ) {
        mainRoute(navController)
    }
}

object Graph {
    const val ROOT = "root_graph"
    const val MAIN = "main_graph"
}