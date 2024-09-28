package com.example.viikkotehtava4.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val CustomTypography = Typography(
    headlineSmall = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        letterSpacing = 1.5.sp,
        fontFamily = FontFamily.SansSerif,
    ),
    labelLarge = TextStyle(  // Määritellään painikkeen tekstin tyyli
        color = Color.Black    // Vaihdetaan oletusväri mustaksi
    )
)
