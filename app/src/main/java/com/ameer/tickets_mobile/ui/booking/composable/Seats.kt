package com.ameer.tickets_mobile.ui.booking.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ameer.tickets_mobile.ui.booking.GroupSeatUiState
import com.ameer.tickets_mobile.ui.theme.space16
import com.ameer.tickets_mobile.ui.theme.space32

@Composable
fun Seats(
    state: List<GroupSeatUiState>,
    onClickSeat: (idSeat: Int) -> Unit,

    ) {
    LazyVerticalGrid(
        modifier = Modifier
            .fillMaxWidth(),
        columns = GridCells.Fixed(3),
        contentPadding = PaddingValues(horizontal = space32, vertical = space16),
        horizontalArrangement = Arrangement.Center,
        verticalArrangement = Arrangement.Center
    ) {

        items(state.size) { index ->
            GroupSeat(
                state = state[index], onClickSeat = onClickSeat
            )
        }
    }
}