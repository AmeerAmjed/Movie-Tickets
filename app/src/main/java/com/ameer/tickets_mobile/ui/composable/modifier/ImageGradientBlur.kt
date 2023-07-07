package com.ameer.tickets_mobile.ui.composable.modifier

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


fun Modifier.imageGradientBlur(): Modifier {
    return then(drawWithCache {
        onDrawWithContent {
            drawContent()
            drawRect(
                Brush.verticalGradient(
                    0.7f to Color.White.copy(alpha = 0F), 1F to Color.White
                )
            )
        }
    }.blur(19.dp))
}


