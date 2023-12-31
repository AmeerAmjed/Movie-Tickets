package com.ameer.tickets_mobile.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import coil.compose.rememberImagePainter


@Composable
fun ImageNetwork(
    imageUrl: String,
    modifier: Modifier = Modifier,
    contentDescription: String = "",
    contentScale: ContentScale = ContentScale.Crop,
) {
    Image(
        modifier = modifier.fillMaxWidth(),
        painter = rememberImagePainter(data = imageUrl),
        contentScale = contentScale,
        contentDescription = contentDescription,
    )

}