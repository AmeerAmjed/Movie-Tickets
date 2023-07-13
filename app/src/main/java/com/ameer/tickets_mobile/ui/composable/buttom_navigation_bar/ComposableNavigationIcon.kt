package com.ameer.tickets_mobile.ui.composable.buttom_navigation_bar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ameer.tickets_mobile.ui.theme.lightPrimary

@Composable
fun ComposableNavigationIcon(
    item: BottomNavItem,
    color: Color,
    badge: String? = null
) {

    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = item.idIconRes),
            contentDescription = "",
            modifier = Modifier.size(28.dp),
            tint = color
        )
        if (item.badge != null) {
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .background(lightPrimary)
                    .size(15.dp),
            ) {
                Text(
                    modifier = Modifier.align(Alignment.Center),
                    text = item.badge.toString(),
                    style = MaterialTheme.typography.overline,
                    color = MaterialTheme.colors.onPrimary
                )
            }

        }

    }
}