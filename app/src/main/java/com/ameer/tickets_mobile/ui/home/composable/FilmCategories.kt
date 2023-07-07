package com.ameer.tickets_mobile.ui.home.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun FilmCategories(
    categories: List<String>,
    stateLazyRowCategories: LazyListState
) {
    LazyRow(
        state = stateLazyRowCategories,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth(),
    ) {
        items(count = categories.size) { index ->
            TextOutLineBorder(categories[index])
        }
    }
}


@Composable
@Preview(showBackground = true)
private fun FilmCategoriesPreview(
) {
    FilmCategories(
        categories = listOf("Action", "Thriller", "Science Fiction"),
        stateLazyRowCategories = rememberLazyListState()
    )
}