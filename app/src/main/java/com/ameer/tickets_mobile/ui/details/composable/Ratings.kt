package com.ameer.tickets_mobile.ui.details.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.ameer.tickets_mobile.R
import com.ameer.tickets_mobile.ui.theme.space16
import com.ameer.tickets_mobile.ui.theme.space32


@Composable
fun Ratings(state: RatingUiState) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = space32, vertical = space16),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        ItemRate(
            state = state.ign,
            idLabelRes = R.string.imdb,
        )
        ItemRate(
            state = state.rottenTomatoes,
            idLabelRes = R.string.rotten_tomatoes,
        )
        ItemRate(
            state = state.ign,
            idLabelRes = R.string.ign,
        )
    }
}