package com.ameer.tickets_mobile.ui.booking

import android.app.Activity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.ameer.tickets_mobile.R
import com.ameer.tickets_mobile.ui.booking.composable.BuyTickets
import com.ameer.tickets_mobile.ui.booking.composable.CinemaTV
import com.ameer.tickets_mobile.ui.booking.composable.DateShow
import com.ameer.tickets_mobile.ui.booking.composable.IconButtonSmall
import com.ameer.tickets_mobile.ui.booking.composable.InfoColorSeat
import com.ameer.tickets_mobile.ui.booking.composable.Seats
import com.ameer.tickets_mobile.ui.booking.composable.ShowTime
import com.ameer.tickets_mobile.ui.composable.SpacerVertical16
import com.ameer.tickets_mobile.ui.composable.SpacerVertical8
import com.ameer.tickets_mobile.ui.home.navigateToHomeScreen
import com.ameer.tickets_mobile.ui.theme.largeShape
import com.ameer.tickets_mobile.ui.theme.space16
import com.ameer.tickets_mobile.ui.theme.space40
import com.ameer.tickets_mobile.ui.theme.zero
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun BookingScreen(
    navController: NavController,
    viewModel: BookingViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    val systemUiController = rememberSystemUiController()

    BookingContent(
        state = state,
        systemUiController = systemUiController,
        onClickSeat = viewModel::onClickSeat,
        onClickTime = viewModel::onChangeTimeSelected,
        onClickData = viewModel::onChangeDateSelected,
        onClickBack = navController::navigateToHomeScreen
    )
}


@Composable
private fun BookingContent(
    state: BookingUiState,
    systemUiController: SystemUiController,
    onClickSeat: (idSeat: Int) -> Unit,
    onClickTime: (time: String) -> Unit,
    onClickData: (idData: Int) -> Unit,
    onClickBack: () -> Unit,
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
            IconButtonSmall(
                iconColor = MaterialTheme.colorScheme.onPrimary,
                idIconRes = R.drawable.ic_close_circle,
                modifier = Modifier.padding(top = space40, start = space16)
            ) { onClickBack() }
            var imageUrl =
                "https://m.media-amazon.com/images/M/MV5BMjAxMzY3NjcxNF5BMl5BanBnXkFtZTcwNTI5OTM0Mw@@._V1_.jpg"
            CinemaTV(
                imageUrl = imageUrl,
                modifier = Modifier
                    .size(350.dp, 120.dp)
                    .align(Alignment.CenterHorizontally)
            )

            Seats(
                state = state.seats,
                onClickSeat = onClickSeat
            )

            InfoColorSeat()
            SpacerVertical16()

        }

        Column(
            modifier = Modifier
                .weight(0.3f)
                .fillMaxSize()

                .clip(RoundedCornerShape(largeShape, largeShape, zero, zero))
                .background(MaterialTheme.colorScheme.onPrimary)

        ) {
            SpacerVertical8()
            DateShow(state.dataShow, state.dataSelected, onClickData)
            ShowTime(state.showTime, state.timeSelected, onClickTime)
            BuyTickets(state = state)


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
