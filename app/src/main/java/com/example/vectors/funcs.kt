package com.example.vectors

import java.util.*
import kotlin.math.PI


internal fun invalid(s: String = ""): Nothing = throw Exception(s)

fun Float.radToDeg() = (this * (180 / PI)).toFloat()
fun Float.degToRad() = (this * (PI / 180)).toFloat()

fun Float.format2() = "%.2f".format(Locale.ENGLISH,this)