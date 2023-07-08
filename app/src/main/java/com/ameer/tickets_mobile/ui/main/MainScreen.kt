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
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.ameer.tickets_mobile.ui.composable.buttom_navigation_bar.BottomNavigation
import com.ameer.tickets_mobile.ui.main.state.MainUiState
import com.ameer.tickets_mobile.ui.navigation.MainNavigationGraph
import com.google.accompanist.pager.ExperimentalPagerApi

@Composable
@ExperimentalPagerApi
@ExperimentalMaterialApi
@OptIn(ExperimentalLayoutApi::class)
fun MainScreen(navController: NavHostController, rootNavController: NavController) {
    val itemBottomNav = MainUiState().itemsBottomBar
    Scaffold(
        modifier = Modifier.navigationBarsPadding(),
        isFloatingActionButtonDocked = true,
        floatingActionButtonPosition = FabPosition.Center,
        bottomBar = {
            BottomNavigation(
                itemBottomNav,
                navController = navController,
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

