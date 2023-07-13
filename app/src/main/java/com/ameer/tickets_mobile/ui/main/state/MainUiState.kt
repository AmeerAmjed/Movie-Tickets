package com.ameer.tickets_mobile.ui.main.state

import com.ameer.tickets_mobile.R
import com.ameer.tickets_mobile.ui.composable.buttom_navigation_bar.BottomNavItem
import com.ameer.tickets_mobile.ui.navigation.MainRoute

data class MainUiState(
    var itemsBottomBar: List<BottomNavItem> = listOf(
        BottomNavItem(
            route = MainRoute.Home,
            idIconRes = R.drawable.ic_films,
        ),
        BottomNavItem(
            route = MainRoute.Search,
            idIconRes = R.drawable.ic_search,
        ),
        BottomNavItem(
            route = MainRoute.Tickets,
            idIconRes = R.drawable.ic_ticket,
            badge = 5,
        ),
        BottomNavItem(
            route = MainRoute.Profile,
            idIconRes = R.drawable.ic_user,
        ),
    )
)
