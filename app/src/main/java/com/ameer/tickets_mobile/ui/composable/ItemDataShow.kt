package com.ameer.tickets_mobile.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ameer.tickets_mobile.ui.booking.DateUiState
import com.ameer.tickets_mobile.ui.theme.border1
import com.ameer.tickets_mobile.ui.theme.lightIconColorSecondary
import com.ameer.tickets_mobile.ui.theme.lightSelected
import com.ameer.tickets_mobile.ui.theme.space4
import com.ameer.tickets_mobile.ui.theme.space8

@Composable
fun ItemDataShow(
    data: DateUiState,
    modifier: Modifier = Modifier,
    isActive: Boolean = false,
    onClick: (() -> Unit)? = null
) {
    val colorText =
        if (isActive) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onBackground

    val colorBackground = if (isActive) lightSelected else MaterialTheme.colorScheme.background
    val colorBorder = if (isActive) Color.Transparent else lightIconColorSecondary

    val shape = MaterialTheme.shapes.medium
    Column(modifier = modifier
        .size(70.dp, 80.dp)
        .padding(space4)
        .background(colorBackground, shape = shape)
        .border(
            border1, colorBorder, shape = shape
        )
        .clip(shape = shape)
        .clickable(
            enabled = onClick != null
        ) { onClick?.invoke() }
        .padding(space8, space4),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center


    ) {
        Text(
            text = data.day,
            style = MaterialTheme.typography.bodyLarge.copy(
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            ),
            color = colorText,

            )
        Text(
            text = data.week,
            style = MaterialTheme.typography.bodyLarge,
            color = colorText,

            )
    }

}


@Composable
@Preview(showBackground = true)
private fun ItemDataShowPreview() {
    ItemDataShow(DateUiState(1, "1", "Sun"), isActive = false)
}

@Composable
@Preview(showBackground = true)
private fun ItemDataShowActivePreview() {
    ItemDataShow(DateUiState(1, "1", "Sun"), isActive = true)

}