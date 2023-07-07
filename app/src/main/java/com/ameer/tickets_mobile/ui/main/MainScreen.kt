package com.ameer.tickets_mobile.ui.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.consumedWindowInsets
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.FabPosition
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.ameer.tickets_mobile.R
import com.ameer.tickets_mobile.ui.composable.buttom_navigation_bar.BottomNavItem
import com.ameer.tickets_mobile.ui.composable.buttom_navigation_bar.BottomNavigation
import com.ameer.tickets_mobile.ui.navigation.MainNavigationGraph
import com.ameer.tickets_mobile.ui.navigation.MainRoute
import com.google.accompanist.pager.ExperimentalPagerApi

@Composable
@ExperimentalPagerApi
@ExperimentalMaterialApi
@OptIn(ExperimentalLayoutApi::class)
fun MainScreen(navController: NavHostController, rootNavController: NavController) {

    Scaffold(
        modifier = Modifier.navigationBarsPadding(),
        isFloatingActionButtonDocked = true,
        floatingActionButtonPosition = FabPosition.Center,
        bottomBar = {
            BottomNavigation(
                listOf(
                    BottomNavItem(
                        route = MainRoute.Home,
                        icon = painterResource(R.drawable.ic_play),
                    ),
                    BottomNavItem(
                        route = MainRoute.Home,
                        icon = painterResource(R.drawable.ic_play),
                    ),
                    BottomNavItem(
                        route = MainRoute.Home,
                        icon = painterResource(R.drawable.ic_play),
                    ),
                    BottomNavItem(
                        route = MainRoute.Home,
                        icon = painterResource(R.drawable.ic_play),
                    ),
                ),
                navController = navController,
                onItemClick = {
                    navController.navigate(it.route) {

                        navController.graph.startDestinationRoute?.let { screen_route ->
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )

        },

        ) { innerPadding ->
        Box(
            modifier = Modifier
                .consumedWindowInsets(innerPadding)
                .padding(innerPadding)
                .imePadding()
        ) {
            MainNavigationGraph(navController, rootNavController)
        }

    }
}

