package com.ameer.tickets_mobile.ui.booking.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.ameer.tickets_mobile.ui.composable.modifier.imageHorizontalBlur
import com.ameer.tickets_mobile.ui.theme.space32


@Composable
fun CinemaTV(
    modifier: Modifier = Modifier,
    imageUrl: String
) {
    Image(
        modifier = modifier
            .size(350.dp, 120.dp)
            .padding(horizontal = space32)
            .clip(ShapeCinemanaTV)
            .imageHorizontalBlur(),
        painter = rememberImagePainter(data = imageUrl),
        contentScale = ContentScale.FillBounds,
        contentDescription = null,
    )
}