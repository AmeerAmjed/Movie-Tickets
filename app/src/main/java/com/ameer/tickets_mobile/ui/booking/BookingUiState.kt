package com.ameer.tickets_mobile.ui.booking

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.ameer.tickets_mobile.ui.base.BaseUiState

data class BookingUiState(

    var seats: List<GroupSeatUiState> = listOf(
        GroupSeatUiState(
            GroupSeatState.Left,
            SeatUiState(1, SeatState.Selected),
            SeatUiState(2, SeatState.Available),
        ), GroupSeatUiState(
            GroupSeatState.Middle,
            SeatUiState(3, SeatState.Taken),
            SeatUiState(4, SeatState.Taken),

            ), GroupSeatUiState(
            GroupSeatState.Right,
            SeatUiState(5, SeatState.Taken),
            SeatUiState(6, SeatState.Taken),

            )


    )
) : BaseUiState

data class GroupSeatUiState(
    var state: GroupSeatState,
    val rightSeatState: SeatUiState,
    val leftSeatState: SeatUiState,

    )

data class SeatUiState(
    val id: Int,
    var state: SeatState,
)


enum class SeatState {
    Available, Taken, Selected
}

enum class GroupSeatState {
    Left, Middle, Right,
}

@Composable
fun SeatState.getColorState(): Color {
    return when (this) {
        SeatState.Taken -> Color.Gray
        SeatState.Available -> MaterialTheme.colorScheme.onPrimary
        SeatState.Selected -> MaterialTheme.colorScheme.primary
    }
}


@Composable
fun GroupSeatUiState.getColorBoarder(): Color {
    var colorBorder = Color.Gray
    if (rightSeatState.state == SeatState.Selected && leftSeatState.state == SeatState.Selected) {
        colorBorder = MaterialTheme.colorScheme.primary
    }

    if (rightSeatState.state == SeatState.Available && leftSeatState.state == SeatState.Available) {
        colorBorder = MaterialTheme.colorScheme.onPrimary
    }
    return colorBorder.copy(alpha = 0.2F)

}

@Composable
fun GroupSeatState.getModifierFromLocation(): Modifier {
    return when (this) {
        GroupSeatState.Left -> Modifier.rotate(9f)
        GroupSeatState.Middle -> Modifier.padding(top = 9.dp)
        GroupSeatState.Right -> Modifier.rotate(-9f)
    }

}
