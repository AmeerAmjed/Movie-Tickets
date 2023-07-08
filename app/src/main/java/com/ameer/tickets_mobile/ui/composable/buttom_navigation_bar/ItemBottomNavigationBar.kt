package com.ameer.tickets_mobile.ui.composable.buttom_navigation_bar

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController


@Composable
fun RowScope.ItemBottomNavigationBar(
    state: BottomNavItem,
    currentDestination: NavDestination?,
    navController: NavHostController
) {

    val selected = currentDestination?.hierarchy?.any { it.route == state.route } == true
    val background = if (selected) MaterialTheme.colorScheme.primary else Color.Transparent
    val contentColor = if (selected) Color.White else Color.Gray

    Box(
        modifier = Modifier
            .size(50.dp)
            .clip(CircleShape)
            .background(background)
            .align(Alignment.CenterVertically)
            .clickable {

//                if (!selected) {
//                    navController.navigate(state.route) {
//                        popUpTo(navController.graph.findStartDestination().id) {
//                            saveState = true
//                        }
//                        launchSingleTop = true
//                    }
//
//                }
            }
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.Center)
        ) {
            ComposableNavigationIcon(state, contentColor)
        }
    }
}

