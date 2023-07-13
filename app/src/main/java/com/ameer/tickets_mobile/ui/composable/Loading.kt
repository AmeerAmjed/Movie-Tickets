package com.ameer.tickets_mobile.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.ameer.tickets_mobile.ui.theme.lightIconColorSecondary
import com.ameer.tickets_mobile.ui.theme.lightPrimary

@Composable
fun Loading() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(lightIconColorSecondary.copy(0.3F)),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator()
    }
}