package com.ameer.tickets_mobile.ui.home.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.util.lerp
import coil.compose.rememberImagePainter
import com.ameer.tickets_mobile.ui.home.FilmUiState
import com.ameer.tickets_mobile.ui.theme.Shapes
import com.ameer.tickets_mobile.ui.theme.space16
import com.ameer.tickets_mobile.ui.theme.zero


@Composable
fun ItemCategory(
    state: FilmUiState,
    pageOffset: Float,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxSize()
            .padding(zero)
            .graphicsLayer {
                lerp(
                    start = 0.85f,
                    stop = 1f,
                    fraction = 1f - pageOffset.coerceIn(0f, 1f)
                ).also { scale ->
                    scaleX = scale
                    scaleY = scale
                }
                alpha = lerp(
                    start = 0.5f,
                    stop = 1f,
                    fraction = 1f - pageOffset.coerceIn(0f, 1f)
                )
            }

    ) {
        Card(
            modifier = modifier
                .fillMaxSize()
                .clip(Shapes.large)
        ) {
            Column(
                modifier = modifier
                    .fillMaxSize()
                    .padding(space16, space16, space16, zero),
                verticalArrangement = Arrangement.Bottom,

                ) {

                Image(

                    painter = rememberImagePainter(data = state.imageUrl),
                    contentDescription = null,
//                    modifier = Modifier
//                        .offset {
//                            // Calculate the offset for the current page from the
//                            // scroll position
//                            val pageOffset =
//                                this@HorizontalPager.calculateCurrentOffsetForPage(page)
//                            // Then use it as a multiplier to apply an offset
//                            IntOffset(
//                                x = (70.dp * pageOffset).roundToPx(),
//                                y = 0,
//                            )
//                        }
                )
                Spacer(modifier = Modifier.weight(1f))
                Text(text = state.name)




            }
        }


    }
}

@Preview
@Composable
fun ItemCategoryPreview() {
//    ItemCategory(
//        state = CategoryUiState(R.string.science, R.drawable.ic_science, Purple500),
//        pageOffset = 0f,
//        onClickItem = {}
//    )
}