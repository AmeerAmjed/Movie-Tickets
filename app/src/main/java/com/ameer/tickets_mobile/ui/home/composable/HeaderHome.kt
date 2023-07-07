package com.ameer.tickets_mobile.ui.home.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.ameer.tickets_mobile.R
import com.ameer.tickets_mobile.ui.composable.CustomButton
import com.ameer.tickets_mobile.ui.composable.SpacerHorizontal4

@Composable
fun HeaderHome(
    onClickNowShowing: () -> Unit,
    onClickComingSoon: () -> Unit,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        CustomButton(
            idLabelRes = R.string.now_showing,
            onClick = onClickNowShowing
        )
        SpacerHorizontal4()
        CustomButton(
            idLabelRes = R.string.coming_soon,
            isFullBackground = false,
            onClick = onClickComingSoon
        )
    }
}