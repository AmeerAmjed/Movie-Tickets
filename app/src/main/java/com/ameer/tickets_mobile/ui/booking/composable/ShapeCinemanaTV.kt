package com.ameer.tickets_mobile.ui.booking.composable

import androidx.compose.foundation.shape.GenericShape
import androidx.compose.ui.geometry.Size


val ShapeCinemanaTV = GenericShape { size: Size, ـ ->
    val yRatio = 0.25f
    val xRatio = 0.40f
    moveTo(0f, size.height * yRatio)
    lineTo(0f, size.height)
    quadraticBezierTo(
        size.width / 2,
        size.height * xRatio,
        size.width,
        size.height
    )
    lineTo(size.width, size.height * yRatio)
    quadraticBezierTo(
        size.width / 2,
        0f,
        0f,
        size.height * yRatio,
    )

}

