package com.ameer.tickets_mobile.ui.booking.composable

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ameer.tickets_mobile.ui.home.composable.TextOutLineBorder


@Composable
fun ShowTime(
    state: List<String>,
    timeSelected: String?,
    onClick: (time: String) -> Unit
) {
    LazyRow(state = rememberLazyListState()) {
        items(state.size) { index ->
            TextOutLineBorder(
                state[index],
                modifier = Modifier,
                isActive = timeSelected == state[index],
            ) {
                onClick(state[index])
            }
        }
    }
}