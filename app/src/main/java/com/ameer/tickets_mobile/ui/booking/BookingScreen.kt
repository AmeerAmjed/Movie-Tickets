package com.ameer.tickets_mobile.ui.booking

import android.app.Activity
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import androidx.hilt.navigation.compose.hiltViewModel
import com.ameer.tickets_mobile.ui.booking.composable.GroupSeat
import com.ameer.tickets_mobile.ui.composable.SpacerVertical32
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun BookingScreen(viewModel: BookingViewModel = hiltViewModel()) {
    val state by viewModel.state.collectAsState()
    val systemUiController = rememberSystemUiController()

    BookingContent(
        state = state,
        systemUiController = systemUiController,
        onClickSeat = viewModel::onClickSeat

    )
}


@Composable
private fun BookingContent(
    state: BookingUiState,
    systemUiController: SystemUiController,
    onClickSeat: (idSeat: Int) -> Unit,

    ) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Column(
            modifier = Modifier
                .weight(0.7f)
                .fillMaxSize()
        ) {
            // Content for the first column (70% width)
        }

        var imageUrl =
            "https://m.media-amazon.com/images/M/MV5BMjAxMzY3NjcxNF5BMl5BanBnXkFtZTcwNTI5OTM0Mw@@._V1_.jpg"
        val shape = GenericShape { size: Size, layoutDirection: LayoutDirection ->
            val width = size.width
            val height = size.height


            lineTo(height, width)

            lineTo(width, height)
            lineTo(height, height)

        }
//        Image(
//            modifier = Modifier
//                .size(350.dp, 120.dp)
//                .clip(shape)
//                .drawWithCache {
//                    onDrawWithContent {
//                        drawContent()
//                        drawRect(
//                            Brush.horizontalGradient(
//                                0.7f to Color.White.copy(alpha = 0F),
//                                1F to Color.White
//                            )
//                        )
//                    }
//                },
//            painter = rememberImagePainter(data = imageUrl),
//            contentScale = ContentScale.FillBounds,
//            contentDescription = null,
//
//            )

        LazyVerticalGrid(
            modifier = Modifier
                .fillMaxWidth()
//                .background(Color.Blue)
            ,
            columns = GridCells.Fixed(3),
            contentPadding = PaddingValues(30.dp),
            horizontalArrangement = Arrangement.Center,
            verticalArrangement = Arrangement.Center
        ) {

            items(state.seats.size) { index ->
                GroupSeat(
                    state = state.seats[index],
                    onClickSeat = {
                        Log.v("ameerxyz", "now update $it")

                        onClickSeat(it)
                    }

                )
            }
        }
//        Row {
//
//            GroupSeat(
//                modifier = Modifier.rotate(9f),
//                state = GroupSeatUiState(,SeatState.Available, SeatState.Available),
//
//                onClickSeatRight = {},
//                onClickSeatLeft = {}
//
//            )
//
//            GroupSeat(
//                state = GroupSeatUiState(SeatState.Taken, SeatState.Taken),
//                modifier = Modifier,
//                onClickSeatRight = {},
//                onClickSeatLeft = {}
//
//            )
//
//            GroupSeat(
//
//                state = GroupSeatUiState(SeatState.Selected, SeatState.Selected),
//                modifier = Modifier.rotate(-9f),
//                onClickSeatRight = {},
//                onClickSeatLeft = {}
//
//            )
//        }


        Column(
            modifier = Modifier
                .weight(0.3f)
                .fillMaxSize()
        ) {
            SpacerVertical32()

            SpacerVertical32()
            SpacerVertical32()

            SpacerVertical32()

        }

        val view = LocalView.current
        if (!view.isInEditMode) {
            SideEffect {
                val window = (view.context as Activity).window
                WindowCompat.setDecorFitsSystemWindows(window, false)
                systemUiController.setStatusBarColor(color = Color.Transparent)
            }
        }
    }


}

