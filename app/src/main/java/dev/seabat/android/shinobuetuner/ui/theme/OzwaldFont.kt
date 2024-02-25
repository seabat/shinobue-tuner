package dev.seabat.android.shinobuetuner.ui.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import dev.seabat.android.shinobuetuner.R

private val Ozwald = FontFamily(
    Font(R.font.oswald_variablefont_wght, FontWeight.Normal),
)

object OzwaldTextStyle {
    val regular70Black = TextStyle(
        fontFamily = Ozwald,
        fontWeight = FontWeight.Normal,
        fontSize = 70.sp,
        color = Color.Black,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )
    val regular40Black = TextStyle(
        fontFamily = Ozwald,
        fontWeight = FontWeight.Normal,
        fontSize = 40.sp,
        color = Color.Black,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )
    val regular30Black = TextStyle(
        fontFamily = Ozwald,
        fontWeight = FontWeight.Normal,
        fontSize = 30.sp,
        color = Color.Black,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )
    val regular18Black = TextStyle(
        fontFamily = Ozwald,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        color = Color.Black,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )
    val regular16Black = TextStyle(
        fontFamily = Ozwald,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        color = Color.Black,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )
    val regular14Black = TextStyle(
        fontFamily = Ozwald,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        color = Color.Black,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        )
    )
}