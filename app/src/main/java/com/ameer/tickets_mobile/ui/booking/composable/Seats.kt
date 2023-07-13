package com.ameer.tickets_mobile.ui.booking.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ameer.tickets_mobile.ui.booking.GroupSeatState
import com.ameer.tickets_mobile.ui.booking.GroupSeatUiState
import com.ameer.tickets_mobile.ui.booking.SeatState
import com.ameer.tickets_mobile.ui.booking.SeatUiState
import com.ameer.tickets_mobile.ui.theme.space32
import com.ameer.tickets_mobile.ui.theme.space8

@Composable
fun Seats(
    state: List<GroupSeatUiState>,
    onClickSeat: (idSeat: Int) -> Unit,

    ) {
    LazyVerticalGrid(
        modifier = Modifier
            .fillMaxWidth(),
        columns = GridCells.Fixed(3),
        contentPadding = PaddingValues(horizontal = space32, vertical = space8),
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

@Preview
@Composable
fun SeatsPreview() {
    Seats(
        listOf(
            GroupSeatUiState(
                GroupSeatState.Left,
                SeatUiState(1, SeatState.Available),
                SeatUiState(2, SeatState.Available),
            ),
            GroupSeatUiState(
                GroupSeatState.Middle,
                SeatUiState(3, SeatState.Available),
                SeatUiState(4, SeatState.Available),
            ),
            GroupSeatUiState(
                GroupSeatState.Right,
                SeatUiState(5, SeatState.Available),
                SeatUiState(6, SeatState.Taken),
            ),

            GroupSeatUiState(
                GroupSeatState.Left,
                SeatUiState(7, SeatState.Available),
                SeatUiState(8, SeatState.Available),
            ),
            GroupSeatUiState(
                GroupSeatState.Middle,
                SeatUiState(9, SeatState.Available),
                SeatUiState(10, SeatState.Available),
            ),
            GroupSeatUiState(
                GroupSeatState.Right,
                SeatUiState(11, SeatState.Available),
                SeatUiState(12, SeatState.Available),
            ),

            GroupSeatUiState(
                GroupSeatState.Left,
                SeatUiState(13, SeatState.Available),
                SeatUiState(14, SeatState.Taken),
            ),
            GroupSeatUiState(
                GroupSeatState.Middle,
                SeatUiState(15, SeatState.Available),
                SeatUiState(16, SeatState.Available),
            ),
            GroupSeatUiState(
                GroupSeatState.Right,
                SeatUiState(17, SeatState.Taken),
                SeatUiState(18, SeatState.Taken),
            ),

            GroupSeatUiState(
                GroupSeatState.Left,
                SeatUiState(19, SeatState.Available),
                SeatUiState(20, SeatState.Available),
            ),
            GroupSeatUiState(
                GroupSeatState.Middle,
                SeatUiState(21, SeatState.Taken),
                SeatUiState(22, SeatState.Taken),
            ),
            GroupSeatUiState(
                GroupSeatState.Right,
                SeatUiState(23, SeatState.Available),
                SeatUiState(24, SeatState.Available),
            ),

            GroupSeatUiState(
                GroupSeatState.Left,
                SeatUiState(25, SeatState.Taken),
                SeatUiState(26, SeatState.Taken),
            ),
            GroupSeatUiState(
                GroupSeatState.Middle,
                SeatUiState(27, SeatState.Taken),
                SeatUiState(28, SeatState.Taken),
            ),
            GroupSeatUiState(
                GroupSeatState.Right,
                SeatUiState(29, SeatState.Available),
                SeatUiState(30, SeatState.Available),
            ),

            )
    ) {}
}