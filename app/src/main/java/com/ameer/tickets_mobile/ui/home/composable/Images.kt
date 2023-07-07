package com.ameer.tickets_mobile.ui.home.composable

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ameer.tickets_mobile.ui.home.FilmUiState
import com.ameer.tickets_mobile.ui.theme.zero
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.calculateCurrentOffsetForPage

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Images(
    state: List<FilmUiState>,
    pagerState: PagerState,
) {
    HorizontalPager(
        count = state.size,
        state = pagerState,
        modifier = Modifier
            .padding(zero)
            .fillMaxWidth(),
        verticalAlignment = Alignment.Top,
        contentPadding = PaddingValues(horizontal = 70.dp, vertical = 0.dp),
    ) { page ->

        ItemImageFilm(
            imageUrl = state[page].imageUrl,
            pageOffset = calculateCurrentOffsetForPage(page)
        )

    }
}