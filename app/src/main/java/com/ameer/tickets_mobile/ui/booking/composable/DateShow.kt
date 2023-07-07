package com.ameer.tickets_mobile.ui.booking.composable

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ameer.tickets_mobile.ui.booking.DateUiState
import com.ameer.tickets_mobile.ui.composable.ItemDataShow
import com.ameer.tickets_mobile.ui.theme.space8


@Composable
fun DateShow(
    state: List<DateUiState>,
    idDateSelected: Int?,
    onClick: (idDate: Int) -> Unit
) {
    LazyRow(
        state = rememberLazyListState(),
        contentPadding = PaddingValues(horizontal = space8, vertical = space8)
    ) {
        items(
            state.size
        ) { index ->
            ItemDataShow(
                state[index],
                modifier = Modifier,
                isActive = idDateSelected == state[index].id,
            ) {
                onClick(state[index].id)
            }
        }
    }
}