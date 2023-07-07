package com.ameer.tickets_mobile.ui.details.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.ameer.tickets_mobile.R
import com.ameer.tickets_mobile.ui.booking.composable.IconButtonSmall
import com.ameer.tickets_mobile.ui.theme.space16
import com.ameer.tickets_mobile.ui.theme.space32

@Composable
fun AppBar(
    modifier: Modifier = Modifier,
    time: String,
    onClickClose: () -> Unit,
) {
    Box(
        modifier = modifier
    ) {

    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = space32)
            .padding(horizontal = space16),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButtonSmall(
            iconColor = MaterialTheme.colorScheme.onPrimary,
            idIconRes = R.drawable.ic_close_circle,
            onClick = onClickClose
        )

        Time(time)
    }
}