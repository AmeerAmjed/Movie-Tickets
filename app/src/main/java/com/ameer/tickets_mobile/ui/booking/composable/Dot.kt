package com.ameer.tickets_mobile.ui.booking.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.ameer.tickets_mobile.ui.composable.SpacerHorizontal4

@Composable
fun Dot(
    modifier: Modifier = Modifier,
    size: Int = 15,
    idLabelRes: Int,
    color: Color = Color.Yellow,
) {

    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = modifier
                .size(size.dp, size.dp)
                .clip(CircleShape)
                .background(color),
        )
        SpacerHorizontal4()
        Text(text = stringResource(id = idLabelRes), color = Color.Gray)
    }

}
