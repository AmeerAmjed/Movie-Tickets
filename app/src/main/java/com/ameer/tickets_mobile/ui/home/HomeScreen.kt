package com.ameer.tickets_mobile.ui.home


import android.annotation.SuppressLint
import android.app.Activity
import android.view.View
import android.view.Window
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.FabPosition
import androidx.compose.material.Scaffold
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.ameer.tickets_mobile.R
import com.ameer.tickets_mobile.ui.composable.ImageNetwork
import com.ameer.tickets_mobile.ui.composable.SpacerVertical16
import com.ameer.tickets_mobile.ui.composable.SpacerVertical32
import com.ameer.tickets_mobile.ui.composable.buttom_navigation_bar.BottomNavItem
import com.ameer.tickets_mobile.ui.composable.buttom_navigation_bar.BottomNavigation
import com.ameer.tickets_mobile.ui.composable.modifier.imageGradientBlur
import com.ameer.tickets_mobile.ui.details.navigateToDetailsScreen
import com.ameer.tickets_mobile.ui.home.composable.DurationFilm
import com.ameer.tickets_mobile.ui.home.composable.FilmCategories
import com.ameer.tickets_mobile.ui.home.composable.HeaderHome
import com.ameer.tickets_mobile.ui.home.composable.Images
import com.ameer.tickets_mobile.ui.navigation.MainRoute
import com.ameer.tickets_mobile.ui.theme.zero
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.rememberPagerState
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.accompanist.systemuicontroller.rememberSystemUiController


@OptIn(ExperimentalPagerApi::class)
@Composable
fun HomeScreen(
    navController: NavController,
) {

    val pagerState = rememberPagerState(initialPage = 1)
    val systemUiController = rememberSystemUiController()
    val stateLazyRowCategories = rememberLazyListState()
    val view = LocalView.current
    val window = (view.context as Activity).window
    HomeContent(
        state = HomeUiState(),
        pagerState = pagerState,
        systemUiController = systemUiController,
        stateLazyRowCategories = stateLazyRowCategories,
        window = window,
        view = view,
        navController = navController
    )
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@OptIn(ExperimentalPagerApi::class)
@Composable
private fun HomeContent(
    state: HomeUiState,
    pagerState: PagerState,
    systemUiController: SystemUiController,
    stateLazyRowCategories: LazyListState,
    window: Window,
    view: View,
    navController: NavController,
) {


    Scaffold(
        modifier = Modifier.navigationBarsPadding(),
        isFloatingActionButtonDocked = true,
        floatingActionButtonPosition = FabPosition.Center,
        bottomBar = {
            BottomNavigation(listOf(
                BottomNavItem(
                    route = MainRoute.Home,
                    icon = painterResource(R.drawable.ic_play),
                ),
                BottomNavItem(
                    route = MainRoute.Home,
                    icon = painterResource(R.drawable.ic_play),
                ),
                BottomNavItem(
                    route = MainRoute.Home,
                    icon = painterResource(R.drawable.ic_play),
                ),
                BottomNavItem(
                    route = MainRoute.Home,
                    icon = painterResource(R.drawable.ic_play),
                ),
            ), navController = rememberNavController(), onItemClick = {

            })

        },

        ) {

        Box(
            modifier = Modifier
                .padding(zero)
                .fillMaxWidth()
                .padding(zero),
        ) {

            ImageNetwork(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp)
                    .padding(zero)
                    .imageGradientBlur(),
                imageUrl = state.file[pagerState.currentPage].imageUrl
            )

            Column(
                modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Top
            ) {
                SpacerVertical32()

                HeaderHome(onClickComingSoon = {}, onClickNowShowing = {})

                SpacerVertical32()

                Images(
                    state = state.file,
                    pagerState = pagerState,
                    onCLick = navController::navigateToDetailsScreen
                )

                SpacerVertical32()
                DurationFilm(state.file[pagerState.currentPage].duration)
                SpacerVertical16()
                Text(
                    text = state.file[pagerState.currentPage].name,
                    modifier = Modifier.fillMaxWidth(),
                    style = MaterialTheme.typography.titleLarge,
                    textAlign = TextAlign.Center,
                )
                SpacerVertical16()
                FilmCategories(
                    categories = state.file[pagerState.currentPage].categories,
                    stateLazyRowCategories = stateLazyRowCategories
                )
                Spacer(modifier = Modifier.weight(1f))
                Spacer(modifier = Modifier.weight(1f))

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


