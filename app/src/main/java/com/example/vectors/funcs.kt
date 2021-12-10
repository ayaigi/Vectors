package com.example.vectors

import kotlin.math.PI


internal fun invalid(s: String = ""): Nothing = throw Exception(s)

fun Float.radToDeg() = (this * (180 / PI)).toFloat()
fun Float.degToRad() = (this * (PI / 180)).toFloat()