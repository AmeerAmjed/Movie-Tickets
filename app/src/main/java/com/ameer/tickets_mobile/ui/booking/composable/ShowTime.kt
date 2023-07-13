package com.ameer.tickets_mobile.ui.booking.composable

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ameer.tickets_mobile.ui.home.composable.TextOutLineBorder
import com.ameer.tickets_mobile.ui.theme.space8


@Composable
fun ShowTime(
    state: List<String>,
    timeSelected: String?,
    onClick: (time: String) -> Unit
) {
    LazyRow(
        state = rememberLazyListState(),
        contentPadding = PaddingValues(
            horizontal = space8, vertical = space8
        )

    ) {
        items(
            state.size

        ) { index ->
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


@Preview
@Composable
fun ShowTimePreview() {
    ShowTime(
        state = listOf(
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
        timeSelected = "4:00"
    ) {}
}