package com.example.vectors.plane

import com.example.vectors.Vector


data class ParameterPlane(val support: Vector, val multiA: Vector, val multiB: Vector) : Plane {
    fun toNormal() = NormalPlane(multiA.crossProduct(multiB), support)
}