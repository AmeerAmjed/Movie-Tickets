package com.ameer.tickets_mobile.ui.composable.buttom_navigation_bar

import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ComposableNavigationIcon(item: BottomNavItem) {
    Icon(
        painter = item.icon,
        contentDescription = "",
        modifier = Modifier.size(32.dp),
    )
}