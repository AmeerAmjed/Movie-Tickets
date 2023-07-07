package com.ameer.tickets_mobile.ui.booking.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.ameer.tickets_mobile.R
import com.ameer.tickets_mobile.ui.theme.space32
import com.ameer.tickets_mobile.ui.theme.space48

@Composable
fun InfoColorSeat() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = space48)
            .padding(bottom = space32),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Dot(
            idLabelRes = R.string.available,
            color = MaterialTheme.colorScheme.background

        )
        Dot(
            idLabelRes = R.string.taken,
            color = Color.Gray

        )
        Dot(
            idLabelRes = R.string.selected,
            color = MaterialTheme.colorScheme.primary
        )

    }
}