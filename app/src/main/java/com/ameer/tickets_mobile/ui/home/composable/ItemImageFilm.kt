package com.ameer.tickets_mobile.ui.home.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import coil.compose.rememberImagePainter
import com.ameer.tickets_mobile.ui.composable.ImageNetwork
import com.ameer.tickets_mobile.ui.composable.modifier.imageGradientBlur
import com.ameer.tickets_mobile.ui.theme.zero
import kotlin.math.absoluteValue

@Composable
fun ItemImageFilm(
    imageUrl: String,
    pageOffset: Float,
) {

    Card(
        colors = CardDefaults.cardColors(Color.Transparent),
        shape = RoundedCornerShape(24.dp),
        elevation = CardDefaults.cardElevation(0.dp),
        modifier = Modifier
            .graphicsLayer {
                lerp(
                    start = 0.85f,
                    stop = 1f,
                    fraction = 1f - pageOffset.absoluteValue.coerceIn(0f, 1f)
                ).also { scale ->
                    scaleX = scale
                    scaleY = scale
                }
                alpha = lerp(
                    start = 0.8f,
                    stop = 1f,
                    fraction = 1f - pageOffset.absoluteValue.coerceIn(0f, 1f)
                )
            }

    ) {
        ImageNetwork(
            imageUrl = imageUrl,
            modifier = Modifier.offset {
                IntOffset(
                    x = (70.dp * pageOffset).roundToPx(),
                    y = 0,
                )
            },
        )

    }
}