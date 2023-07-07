package com.ameer.tickets_mobile.ui.booking.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.ameer.tickets_mobile.R
import com.ameer.tickets_mobile.ui.booking.SeatState
import com.ameer.tickets_mobile.ui.booking.SeatUiState
import com.ameer.tickets_mobile.ui.booking.getColorState
import com.ameer.tickets_mobile.ui.theme.TicketsMobileTheme
import com.ameer.tickets_mobile.ui.theme.smallIconButton


@Composable
fun Seat(
    state: SeatUiState,
    onClickSeat: (idSeat: Int) -> Unit,
) {

    Image(
        modifier = Modifier
            .size(smallIconButton, smallIconButton)
            .clickable(
                enabled = state.state != SeatState.Taken
            ) {
                if (state.state != SeatState.Taken) {
                    onClickSeat(state.id)
                }
            },
        painter = painterResource(id = R.drawable.seat),
        contentDescription = null,
        colorFilter = ColorFilter.tint(color = state.state.getColorState())
    )
}


@Composable
@Preview
private fun SeatTakenPreview() {
    TicketsMobileTheme {
        Seat(SeatUiState(1, SeatState.Taken)) {}
    }

}

@Composable
@Preview
private fun SeatAvailablePreview() {
    TicketsMobileTheme {
        Seat(SeatUiState(1, SeatState.Available)) {}
    }
}

@Composable
@Preview
private fun SeatSelectedPreview() {
    TicketsMobileTheme {
        Seat(SeatUiState(1, SeatState.Selected)) {}
    }
}