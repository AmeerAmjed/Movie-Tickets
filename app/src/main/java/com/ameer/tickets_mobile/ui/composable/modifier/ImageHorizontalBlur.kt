package com.ameer.tickets_mobile.ui.composable.modifier

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

fun Modifier.imageHorizontalBlur(): Modifier {
    return then(drawWithCache {
        onDrawWithContent {
            drawContent()
            drawRect(
                Brush.horizontalGradient(
                    0.5f to Color.Black.copy(alpha = 0F),
                    1F to Color.Black
                )
            )
        }

    }.drawWithCache {
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

    })
}