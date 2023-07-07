package com.ameer.tickets_mobile.ui.main

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.ameer.tickets_mobile.ui.navigation.MainNavigationGraph
import com.ameer.tickets_mobile.ui.navigation.RootNavigationGraph
import com.ameer.tickets_mobile.ui.theme.TicketsMobileTheme


@Composable
fun MovieTicketsApp() {
    TicketsMobileTheme {
        val navController = rememberNavController()

//        RootNavigationGraph(navController)
        MainNavigationGraph(navController,navController)
    }
}

