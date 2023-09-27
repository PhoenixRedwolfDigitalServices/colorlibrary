package com.phoenixredwolf.colorlibrary

import com.phoenixredwolf.colorlibrary.colorSupport.Color
import org.jetbrains.compose.web.css.CSSColorValue

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

/**
 * Add your own colors here
 */

val outerColor = com.varabyte.kobweb.compose.ui.graphics.Color
fun Color.toCSS(): CSSColorValue = com.phoenixredwolf.colorlibrary.outerColor.argb(this.alpha, this.red, this.green, this.blue)