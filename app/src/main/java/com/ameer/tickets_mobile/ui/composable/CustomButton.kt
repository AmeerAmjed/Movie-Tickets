package com.ameer.tickets_mobile.ui.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp


@Composable
fun CustomButton(
    idStringRes: Int,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
    isFullBackground: Boolean = true,
    background: Color = MaterialTheme.colorScheme.primary,
    onClick: () -> Unit,
) {
    val backgroundButton = if (isFullBackground) background else Color.Transparent
    val borderColorButton = if (isFullBackground) Color.Transparent else Color.Gray
    Button(
        onClick = { onClick() },
        enabled = isEnabled,
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundButton,
            disabledContainerColor = Color.Transparent
        ),
        border = BorderStroke(1.dp, borderColorButton)
    ) {
        Text(
            text = stringResource(id = idStringRes),
            style = MaterialTheme.typography.bodyMedium,
        )
    }
}