package com.phoenixredwolfdigitalservices.colorlibrary

import com.phoenixredwolfdigitalservices.colorlibrary.colorSupport.Color
import org.jetbrains.compose.web.css.CSSColorValue

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val outerColor = com.varabyte.kobweb.compose.ui.graphics.Color
fun Color.toCSS(): CSSColorValue = outerColor.argb(this.alpha, this.red, this.green, this.blue)