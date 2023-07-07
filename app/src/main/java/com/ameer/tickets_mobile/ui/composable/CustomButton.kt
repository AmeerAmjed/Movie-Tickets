package com.ameer.tickets_mobile.ui.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import com.ameer.tickets_mobile.ui.theme.border1
import com.ameer.tickets_mobile.ui.theme.space8


@Composable
fun CustomButton(
    modifier: Modifier = Modifier,
    modifierLabel: Modifier = Modifier,
    idLabelRes: Int,
    idIconRes: Int? = null,
    isEnabled: Boolean = true,
    isFullBackground: Boolean = true,
    styleLabel: TextStyle = MaterialTheme.typography.bodyLarge,
    background: Color = MaterialTheme.colorScheme.primary,
    onClick: () -> Unit,
) {
    val backgroundButton = if (isFullBackground) background else Color.Transparent
    val borderColorButton = if (isFullBackground) Color.Transparent else Color.Gray
    Button(
        modifier = modifier,
        onClick = { onClick() },
        enabled = isEnabled,
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundButton,
            disabledContainerColor = Color.Transparent
        ),
        border = BorderStroke(border1, borderColorButton)
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {


            if (idIconRes != null) Icon(
                modifier = Modifier.padding(end = space8),
                painter = painterResource(id = idIconRes),
                contentDescription = ""
            )

            Text(
                modifier = modifierLabel,
                text = stringResource(id = idLabelRes),
                style = styleLabel
            )
        }

    }
}