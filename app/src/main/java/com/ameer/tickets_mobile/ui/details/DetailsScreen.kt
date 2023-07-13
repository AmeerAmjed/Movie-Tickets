package com.ameer.tickets_mobile.ui.details

import android.app.Activity
import android.view.View
import android.view.Window
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.ameer.tickets_mobile.R
import com.ameer.tickets_mobile.ui.booking.navigateToBooKingScreen
import com.ameer.tickets_mobile.ui.composable.CustomButton
import com.ameer.tickets_mobile.ui.composable.ImageNetwork
import com.ameer.tickets_mobile.ui.composable.SpacerVertical16
import com.ameer.tickets_mobile.ui.composable.SpacerVertical8
import com.ameer.tickets_mobile.ui.details.composable.Actors
import com.ameer.tickets_mobile.ui.details.composable.AppBar
import com.ameer.tickets_mobile.ui.details.composable.ButtonPlay
import com.ameer.tickets_mobile.ui.details.composable.DetailsUiState
import com.ameer.tickets_mobile.ui.details.composable.Ratings
import com.ameer.tickets_mobile.ui.home.composable.FilmCategories
import com.ameer.tickets_mobile.ui.home.navigateToHomeScreen
import com.ameer.tickets_mobile.ui.theme.largeShape
import com.ameer.tickets_mobile.ui.theme.space16
import com.ameer.tickets_mobile.ui.theme.space8
import com.ameer.tickets_mobile.ui.theme.zero
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun DetailsScreen(
    navController: NavController,
    viewModel: DetailsViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    val systemUiController = rememberSystemUiController()
    val stateLazyRowCategories = rememberLazyListState()
    val stateLazyRowActors = rememberLazyListState()
    val view = LocalView.current
    val screenHeight = LocalConfiguration.current.screenHeightDp
    val window = (view.context as Activity).window

    DetailsContent(
        state = state,
        systemUiController = systemUiController,
        stateLazyRowCategories = stateLazyRowCategories,
        stateLazyRowActors = stateLazyRowActors,
        screenHeight = screenHeight,
        window = window,
        view = view,
        onClickClose = navController::navigateToHomeScreen,
        onClickBooking = navController::navigateToBooKingScreen,

        )
}

@Composable
private fun DetailsContent(
    state: DetailsUiState,
    systemUiController: SystemUiController,
    stateLazyRowCategories: LazyListState,
    stateLazyRowActors: LazyListState,
    screenHeight: Int,
    window: Window,
    view: View,
    onClickClose: () -> Unit,
    onClickBooking: () -> Unit,

    ) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Box(
                modifier = Modifier.fillMaxSize()
            ) {


                Box(
                    modifier = Modifier
                        .height((screenHeight / 2).dp)
                        .fillMaxSize()
                ) {
                    ImageNetwork(state.imageUrl)

                    AppBar(
                        modifier = Modifier.align(Alignment.TopCenter),
                        time = state.duration,
                        onClickClose = onClickClose
                    )

                    ButtonPlay(
                        modifier = Modifier.align(Alignment.Center)
                    )

                }


                Column(
                    modifier = Modifier
                        .height((screenHeight / 1.7).dp)
                        .align(Alignment.BottomCenter)
                        .clip(RoundedCornerShape(largeShape, largeShape, zero, zero))
                        .background(MaterialTheme.colorScheme.background)

                ) {
                    SpacerVertical8()
                    Ratings(state.rate)
                    SpacerVertical8()
                    Text(
                        text = state.name,
                        modifier = Modifier.fillMaxWidth(),
                        style = MaterialTheme.typography.titleLarge,
                        textAlign = TextAlign.Center,
                    )

                    SpacerVertical16()
                    FilmCategories(
                        categories = state.categories,
                        stateLazyRowCategories = stateLazyRowCategories
                    )

                    Actors(
                        actors = state.actors,
                        stateLazyRowActors = stateLazyRowActors
                    )
                    Text(
                        modifier = Modifier.padding(horizontal = space16),
                        text = state.descriptor,
                        textAlign = TextAlign.Justify
                    )

                    SpacerVertical16()

                    Box(modifier = Modifier.align(Alignment.CenterHorizontally)) {
                        CustomButton(
                            modifierLabel = Modifier.padding(vertical = space8),
                            idLabelRes = R.string.booking,
                            idIconRes = R.drawable.ic_card,
                            isEnabled = true,

                            onClick = onClickBooking,
                        )
                    }

                }
            }
        }


        if (!view.isInEditMode) {
            SideEffect {
                WindowCompat.setDecorFitsSystemWindows(window, false)
                systemUiController.setStatusBarColor(color = Color.Transparent)
            }
        }

    }
}