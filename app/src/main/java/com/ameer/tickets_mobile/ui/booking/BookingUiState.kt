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
    var numberSeatSelected: Int = 0,
    var priceSeatTicket: Double = 100.00,
    var seats: List<GroupSeatUiState> = listOf(
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
        )


    ),
    var showTime: List<String> = listOf(
        "10:00",
        "12:00",
        "2:30",
        "4:00",
        "6:00",
        "8:30",
        "1:00",
        "3:45",
        "7:00"
    ),
    var imageUrl: String = "https://m.media-amazon.com/images/M/MV5BNDE3ODcxYzMtY2YzZC00NmNlLWJiNDMtZDViZWM2MzIxZDYwXkEyXkFqcGdeQXVyNjAwNDUxODI@._V1_FMjpg_UX1000_.jpg",
    var dataShow: List<DateUiState> = listOf(
        DateUiState(1, "1", "Thu"),
        DateUiState(2, "11", "Sun"),
        DateUiState(3, "17", "Mon"),
        DateUiState(4, "1", "Thu"),
        DateUiState(5, "11", "Sun"),
        DateUiState(6, "17", "Mon"),
        DateUiState(7, "1", "Thu"),
        DateUiState(8, "11", "Sun"),
        DateUiState(9, "17", "Mon")
    ),
    var timeSelected: String? = null,
    var dataSelected: Int? = null,

    ) : BaseUiState {

    fun isSeatSelected(): Boolean = numberSeatSelected > 0

}

data class GroupSeatUiState(
    var state: GroupSeatState,
    val rightSeatState: SeatUiState,
    val leftSeatState: SeatUiState,
)

data class SeatUiState(
    val id: Int,
    var state: SeatState,
)

data class DateUiState(
    var id: Int,
    val day: String,
    var week: String,
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
