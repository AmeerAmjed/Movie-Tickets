package com.ameer.tickets_mobile.ui.booking.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter

@Composable
fun CinemaTV(
    modifier: Modifier = Modifier,
    imageUrl: String
) {
    Image(
        modifier = modifier
            .size(350.dp, 120.dp)
            .drawWithCache {
                onDrawWithContent {
                    drawContent()
                    drawRect(
                        Brush.horizontalGradient(
                            0.5f to Color.Black.copy(alpha = 0F),
                            1F to Color.Black
                        )
                    )
                }

            }
            .drawWithCache {
                onDrawWithContent {
                    drawContent()
                    drawRect(
                        brush = Brush.linearGradient(
                            .5f to Color.Black.copy(alpha = 0F),
                            1F to Color.Black,
                            start = Offset(933F, -1F),
                            end = Offset(44F, 9F)
                        ),
                        alpha = 1f
                    )

                }

            },
        painter = rememberImagePainter(data = imageUrl),
        contentScale = ContentScale.FillBounds,
        contentDescription = null,
    )
}