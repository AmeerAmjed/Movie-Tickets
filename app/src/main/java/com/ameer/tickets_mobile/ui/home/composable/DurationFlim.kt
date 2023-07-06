package com.ameer.tickets_mobile.ui.home.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.DateRange
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.ameer.tickets_mobile.ui.composable.SpacerHorizontal4
import com.ameer.tickets_mobile.ui.theme.lightIconColorSecondary

@Composable
fun DurationFilm(
    duration: String,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = Icons.Rounded.DateRange,
            tint = lightIconColorSecondary,
            contentDescription = ""
        )
        SpacerHorizontal4()
        Text(text = duration)
    }
}