package com.ameer.tickets_mobile.ui.details.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun ItemRate(
    state: String,
    idLabelRes: Int,
    modifier: Modifier = Modifier,

    ) {

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center


    ) {
        Text(
            text = state,
            style = MaterialTheme.typography.bodyLarge.copy(
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            ),


            )
        Text(
            text = stringResource(id = idLabelRes),
            style = MaterialTheme.typography.bodyLarge,
            color = Color.Gray
        )
    }

}