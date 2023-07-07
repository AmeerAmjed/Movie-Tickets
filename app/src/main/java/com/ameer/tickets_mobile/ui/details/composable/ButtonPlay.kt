package com.ameer.tickets_mobile.ui.details.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ameer.tickets_mobile.R

@Composable
fun ButtonPlay(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .size(70.dp)
            .clip(CircleShape)
            .background(MaterialTheme.colorScheme.primary)
            .clickable { },

        ) {
        Icon(
            modifier = Modifier
                .align(Alignment.Center)
                .size(30.dp)
                .clip(CircleShape)
                .background(MaterialTheme.colorScheme.primary),
            painter = painterResource(id = R.drawable.ic_play),
            contentDescription = null,
            tint = MaterialTheme.colorScheme.onPrimary
        )
    }
}