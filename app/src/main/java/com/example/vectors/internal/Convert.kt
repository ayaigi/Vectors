package com.example.vectors.internal

import com.example.vectors.Plane
import com.example.vectors.Vector
import com.example.vectors.degToRad
import com.example.vectors.radToDeg


private val N = Vector(1, 0, 0)
private val S = Vector(-1, 0, 0)
private val SN = N - S
val nXY = Vector(0, 0, 1)

fun main() {
    val alt = 60f
    val azi = 90f

    Convert(alt.degToRad(), azi.degToRad())
}

/**
 * values in Radians
 */
internal class Convert(altitude: Float, azimuth: Float) {
    init {
        val x = Vector.fromPolarH(altitude, azimuth)
        val p = Plane.fromPoints(x, N, S)
        val np = p.normalVector()

        val gamma = SN.angle(x).radToDeg()
        val delta = np.angle(nXY).radToDeg()
    }
}