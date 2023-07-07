package com.ameer.tickets_mobile.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = lightPrimary,
    onPrimary = Color.White,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),

    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun TicketsMobileTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {

    val systemUiController = rememberSystemUiController()

    val colorsTheme = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }

    systemUiController.setSystemBarsColor(
        color = colorsTheme.background,
        darkIcons = !darkTheme
    )

    MaterialTheme(
        colorScheme = colorsTheme,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}