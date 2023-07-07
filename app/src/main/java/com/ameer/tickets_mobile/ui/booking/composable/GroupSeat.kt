package com.ameer.tickets_mobile.ui.booking.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ameer.tickets_mobile.R
import com.ameer.tickets_mobile.ui.booking.GroupSeatUiState
import com.ameer.tickets_mobile.ui.booking.getColorBoarder
import com.ameer.tickets_mobile.ui.booking.getModifierFromLocation


@Composable
fun GroupSeat(
    state: GroupSeatUiState,
    modifier: Modifier = Modifier,
    onClickSeat: (idSeat: Int) -> Unit,
) {


    Box(
        modifier = modifier
            .then(state.state.getModifierFromLocation())
            .size(80.dp, 60.dp)
            .background(Color.Transparent),
        contentAlignment = Alignment.Center

    ) {
        Image(
            modifier = Modifier.size(80.dp, 60.dp),
            painter = painterResource(id = R.drawable.border_group_seat),
            contentDescription = null,
            colorFilter = ColorFilter.tint(color = state.getColorBoarder())
        )
        Row(
            modifier = Modifier.padding(bottom = 10.dp, start = 3.dp)
        ) {
            Seat(state.leftSeatState, onClickSeat)
            Seat(state.rightSeatState, onClickSeat)
        }
    }


}


//@Composable
//@Preview
//private fun GroupSeatTakenPreview() {
//    TicketsMobileTheme {
//        GroupSeat(
//            GroupSeatUiState(SeatState.Taken, SeatState.Taken),
//            onClickSeatRight = {},
//            onClickSeatLeft = {}
//        )
//    }
//
//}

//@Composable
//@Preview
//private fun GroupSeatAvailablePreview() {
//    TicketsMobileTheme {
//        GroupSeat(
//            GroupSeatUiState(SeatState.Available, SeatState.Available),
//            onClickSeatRight = {},
//            onClickSeatLeft = {}
//        )
//    }
//}
//
//@Composable
//@Preview
//private fun GroupSeatSelectedPreview() {
//    TicketsMobileTheme {
//        GroupSeat(
//            GroupSeatUiState(SeatState.Selected, SeatState.Selected),
//            onClickSeatRight = {},
//            onClickSeatLeft = {}
//        )
//    }
//}