package com.ameer.tickets_mobile.ui.details.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ameer.tickets_mobile.R
import com.ameer.tickets_mobile.ui.composable.SpacerHorizontal4
import com.ameer.tickets_mobile.ui.theme.lightIconColorSecondary
import com.ameer.tickets_mobile.ui.theme.space4
import com.ameer.tickets_mobile.ui.theme.space8


@Composable
fun Time(
    time: String,
    modifier: Modifier = Modifier,
) {

    val shape = MaterialTheme.shapes.large
    Row(
        modifier = modifier
            .padding(space4)
            .background(MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.3f), shape = shape)
            .clip(shape = shape)

            .padding(space8, space4),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            modifier = Modifier.size(20.dp),
            painter = painterResource(id = R.drawable.ic_time),
            contentDescription = null,
            tint = lightIconColorSecondary
        )
        SpacerHorizontal4()
        Text(
            text = time,
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onPrimary,
        )
    }

}


