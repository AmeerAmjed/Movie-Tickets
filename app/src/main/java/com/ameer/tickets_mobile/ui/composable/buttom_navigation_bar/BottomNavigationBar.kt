package com.ameer.tickets_mobile.ui.composable.buttom_navigation_bar

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun BottomNavigation(
    itemBottomNav: List<BottomNavItem>,
    navController: NavHostController,
    onItemClick: (BottomNavItem) -> Unit,
) {
    val backStackEntry = navController.currentBackStackEntryAsState()

    BottomAppBar(
        modifier = Modifier.height(56.dp),
        elevation = 0.dp,
        backgroundColor = MaterialTheme.colorScheme.background,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {

            itemBottomNav.forEachIndexed { index, item ->
                val selected = item.route == backStackEntry.value?.destination?.route

                BottomNavigationItem(
                    selected = selected,
                    onClick = {
                        if (!selected) onItemClick(item)
                    },
                    selectedContentColor = MaterialTheme.colorScheme.onSecondary,
                    unselectedContentColor = MaterialTheme.colorScheme.primary,
                    icon = { ComposableNavigationIcon(item) },

                    )

            }
        }
    }

}
