package com.ameer.tickets_mobile.ui.composable.buttom_navigation_bar

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.ameer.tickets_mobile.ui.theme.space32
import com.ameer.tickets_mobile.ui.theme.zero

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun BottomNavigation(
    itemBottomNav: List<BottomNavItem>,
    navController: NavHostController,
) {
    val navStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navStackEntry?.destination

    BottomAppBar(
        modifier = Modifier.height(72.dp),
        elevation = zero,
        backgroundColor = MaterialTheme.colorScheme.onError,
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = space32),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {

            itemBottomNav.forEachIndexed { index, item ->
                ItemBottomNavigationBar(
                    state = item,
                    currentDestination = currentDestination,
                    navController = navController
                )
            }
        }
    }

}

