package com.ameer.tickets_mobile.ui.home.composable

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ameer.tickets_mobile.ui.theme.border1
import com.ameer.tickets_mobile.ui.theme.lightIconColorSecondary
import com.ameer.tickets_mobile.ui.theme.space4
import com.ameer.tickets_mobile.ui.theme.space8

@Composable
fun ItemFilmCategory(category: String) {
    Text(
        text = category,
        modifier = Modifier
            .padding(space4)
            .border(
                border1,
                lightIconColorSecondary,
                shape = MaterialTheme.shapes.large
            )
            .padding(space8, space4)
    )
}
