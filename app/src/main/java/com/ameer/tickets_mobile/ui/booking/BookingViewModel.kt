package com.ameer.tickets_mobile.ui.booking

import com.ameer.tickets_mobile.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class BookingViewModel @Inject constructor() : BaseViewModel<BookingUiState>(BookingUiState()) {

    fun onClickSeat(idSeat: Int) {
        _state.update { currentState ->
            val seatState = currentState.seats.map { groupSeatUiState ->
                val leftSeatState = if (groupSeatUiState.leftSeatState.id == idSeat) {
                    val state = groupSeatUiState.leftSeatState.state
                    groupSeatUiState.leftSeatState.copy(state = seatState(state))
                } else {
                    groupSeatUiState.leftSeatState
                }

                val rightSeatState = if (groupSeatUiState.rightSeatState.id == idSeat) {
                    val state = groupSeatUiState.rightSeatState.state
                    groupSeatUiState.rightSeatState.copy(state = seatState(state))
                } else {
                    groupSeatUiState.rightSeatState
                }

                groupSeatUiState.copy(
                    leftSeatState = leftSeatState,
                    rightSeatState = rightSeatState
                )
            }

            currentState.copy(seats = seatState)

        }.apply { onChangeSeatSelected() }

    }

    private fun onChangeSeatSelected() {
        val selectedSeatsCount = _state.value.seats
            .flatMap { listOf(it.leftSeatState, it.rightSeatState) }
            .count { it.state == SeatState.Selected }
        _state.update { currentState ->
            currentState.copy(
                numberSeatSelected = selectedSeatsCount
            )
        }
    }

    private fun seatState(state: SeatState): SeatState {
        return if (state == SeatState.Selected) {
            SeatState.Available
        } else {
            SeatState.Selected
        }
    }
}