package com.ameer.tickets_mobile.ui.home.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.ameer.tickets_mobile.ui.theme.border1
import com.ameer.tickets_mobile.ui.theme.lightIconColorSecondary
import com.ameer.tickets_mobile.ui.theme.lightSelected
import com.ameer.tickets_mobile.ui.theme.space4
import com.ameer.tickets_mobile.ui.theme.space8

@Composable
fun TextOutLineBorder(
    text: String,
    modifier: Modifier = Modifier,
    isActive: Boolean = false,
    onClick: (() -> Unit)? = null
) {
    val colorText =
        if (isActive) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onBackground

    val colorBackground = if (isActive) lightSelected else MaterialTheme.colorScheme.background
    val colorBorder = if (isActive) Color.Transparent else lightIconColorSecondary

    val shape = MaterialTheme.shapes.large
    Text(
        text = text,
        style = MaterialTheme.typography.bodyLarge,
        color = colorText,
        modifier = modifier
            .padding(space4)
            .background(colorBackground, shape = shape)
            .border(
                border1,
                colorBorder,
                shape = shape
            )
            .clip(shape = shape)
            .clickable(
                enabled = onClick != null
            ) { onClick?.invoke() }
            .padding(space8, space4)
    )
}


@Composable
@Preview(showBackground = true)
private fun TextOutLineBorderPreview() {
    TextOutLineBorder("Ameer", isActive = false)
}

@Composable
@Preview(showBackground = true)
private fun TextOutLineBorderActivePreview() {
    TextOutLineBorder("Ameer", isActive = true)
}