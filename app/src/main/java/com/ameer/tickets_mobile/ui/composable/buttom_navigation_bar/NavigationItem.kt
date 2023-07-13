package com.ameer.tickets_mobile.ui.composable.buttom_navigation_bar


data class BottomNavItem(
    val route: String,
    val idIconRes: Int,
    val badge: Int? = null,
)