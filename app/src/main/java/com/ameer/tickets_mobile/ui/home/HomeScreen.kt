package com.ameer.tickets_mobile.ui.home


import android.app.Activity
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import coil.compose.rememberImagePainter
import com.ameer.tickets_mobile.R
import com.ameer.tickets_mobile.ui.composable.CustomButton
import com.ameer.tickets_mobile.ui.composable.SpacerHorizontal4
import com.ameer.tickets_mobile.ui.composable.SpacerVertical16
import com.ameer.tickets_mobile.ui.composable.SpacerVertical32
import com.ameer.tickets_mobile.ui.composable.SpacerVertical8
import com.ameer.tickets_mobile.ui.home.composable.DurationFilm
import com.ameer.tickets_mobile.ui.home.composable.FilmCategories
import com.ameer.tickets_mobile.ui.theme.zero
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.calculateCurrentOffsetForPage
import com.google.accompanist.pager.rememberPagerState
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.accompanist.systemuicontroller.rememberSystemUiController


@OptIn(ExperimentalPagerApi::class)
@Composable
fun HomeScreen() {

    val pagerState = rememberPagerState(initialPage = 1)
    val systemUiController = rememberSystemUiController()
    val stateLazyRowCategories = rememberLazyListState()

    HomeContent(
        state = HomeUiState(),
        pagerState = pagerState,
        systemUiController = systemUiController,
        stateLazyRowCategories = stateLazyRowCategories
    )
}

@OptIn(ExperimentalPagerApi::class)
@Composable
private fun HomeContent(
    state: HomeUiState,
    pagerState: PagerState,
    systemUiController: SystemUiController,
    stateLazyRowCategories: LazyListState

    ) {

    Box(
        modifier = Modifier
            .padding(zero)
            .fillMaxWidth()
            .padding(zero),
    ) {


        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
                .padding(zero)
                .drawWithCache {
                    onDrawWithContent {
                        drawContent()
                        drawRect(
                            Brush.verticalGradient(
                                0.7f to Color.White.copy(alpha = 0F),
                                1F to Color.White
                            )
                        )
                    }
                }
                .blur(19.dp),
            painter = rememberImagePainter(data = state.file[pagerState.currentPage].imageUrl),
            contentScale = ContentScale.FillWidth,
            contentDescription = null,
        )

        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Top
        ) {
            SpacerVertical32()
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                CustomButton(
                    idStringRes = R.string.now_showing,
                ) {

                }
                SpacerHorizontal4()
                CustomButton(
                    idStringRes = R.string.coming_soon,
                    isFullBackground = false,
                ) {

                }
            }
            SpacerVertical32()
            HorizontalPager(
                count = state.file.size,
                state = pagerState,
                modifier = Modifier
                    .padding(zero)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.Top,
                contentPadding = PaddingValues(horizontal = 70.dp, vertical = 0.dp),
            ) { page ->
                val pageOffset = calculateCurrentOffsetForPage(page)

                ItemImageFilm(
                    imageUrl = state.file[page].imageUrl,
                    pageOffset = pageOffset
                )


            }
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

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            WindowCompat.setDecorFitsSystemWindows(window, false)
            systemUiController.setStatusBarColor(color = Color.Transparent)
        }
    }

}


