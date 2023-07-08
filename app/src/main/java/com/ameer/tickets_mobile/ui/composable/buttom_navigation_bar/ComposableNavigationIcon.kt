package com.ameer.tickets_mobile.ui.composable.buttom_navigation_bar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ComposableNavigationIcon(
    item: BottomNavItem,
    color: Color,
    badge: String? = null
) {

    Row {
        Icon(
            painter = painterResource(id = item.idIconRes),
            contentDescription = "",
            modifier = Modifier.size(28.dp),
            tint = color
        )
        if (badge != null) {
            Text(
                text = badge, modifier = Modifier
                    .size(20.dp)
                    .background(MaterialTheme.colors.primary)
                    .clip(CircleShape),
                style = MaterialTheme.typography.overline,
                color = MaterialTheme.colors.onPrimary
            )
        }

    }
}