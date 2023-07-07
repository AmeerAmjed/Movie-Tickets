package com.ameer.tickets_mobile.ui.booking.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.ameer.tickets_mobile.R
import com.ameer.tickets_mobile.ui.theme.smallIconButton


@Composable
fun IconButtonSmall(
    modifier: Modifier = Modifier,
    iconColor: Color = MaterialTheme.colorScheme.primary,
    idIconRes: Int,
    onClick: () -> Unit,
) {
    IconButton(
        onClick = { onClick() },
        modifier = modifier
            .clip(CircleShape)
            .background(iconColor.copy(alpha = 0.2f))
            .height(smallIconButton)
            .width(smallIconButton),
    ) {
        Icon(
            painter = painterResource(id = idIconRes),
            tint = iconColor,
            contentDescription = ""
        )
    }
}

@Preview
@Composable
private fun IconButtonSmallPreview() {
    IconButtonSmall(
        idIconRes = R.drawable.ic_close_circle,
    )
    {}
}