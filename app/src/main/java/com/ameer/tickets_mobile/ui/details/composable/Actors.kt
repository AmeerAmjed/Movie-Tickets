package com.ameer.tickets_mobile.ui.details.composable

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.ameer.tickets_mobile.ui.composable.ImageNetwork
import com.ameer.tickets_mobile.ui.theme.space16
import com.ameer.tickets_mobile.ui.theme.space4


@Composable
fun Actors(
    actors: List<String>,
    stateLazyRowActors: LazyListState
) {
    LazyRow(
        state = stateLazyRowActors,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(space16)
    ) {
        items(count = actors.size) { index ->
            ImageNetwork(actors[index],
                modifier = Modifier
                    .padding(horizontal = space4)
                    .size(80.dp)
                    .clip(CircleShape)
                    .clickable { }
            )
        }
    }
}