package com.ameer.tickets_mobile.ui.composable

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ameer.tickets_mobile.ui.theme.space4
import com.ameer.tickets_mobile.ui.theme.space8


@Composable
fun SpacerHorizontal4() {
    Spacer(modifier = Modifier.width(space4))
}
@Composable
fun SpacerHorizontal8() {
    Spacer(modifier = Modifier.width(space8))
}


