package com.ameer.tickets_mobile.ui.booking.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.ameer.tickets_mobile.R
import com.ameer.tickets_mobile.ui.booking.BookingUiState
import com.ameer.tickets_mobile.ui.composable.CustomButton
import com.ameer.tickets_mobile.ui.theme.space16
import com.ameer.tickets_mobile.ui.theme.space8

@Composable
fun BuyTickets(
    state: BookingUiState
) {
    Row(
        Modifier.padding(space16)
    ) {
        Column {
            Text(
                (state.numberSeatSelected * state.priceSeatTicket).toString(),
                style = MaterialTheme.typography.titleLarge.copy(
                    fontWeight = FontWeight.Bold
                ),
                color = MaterialTheme.colorScheme.onBackground

            )
            Text(
                "${state.numberSeatSelected} " + stringResource(id = R.string.tickets),
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.onBackground.copy(0.3F)
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        CustomButton(
            modifierLabel = Modifier.padding(vertical = space8),
            idLabelRes = R.string.buy_tickets,
            idIconRes = R.drawable.ic_card,
            isEnabled = state.numberSeatSelected != 0,
            onClick = {},
        )
    }
}