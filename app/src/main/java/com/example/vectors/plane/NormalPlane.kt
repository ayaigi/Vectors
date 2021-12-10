package com.example.vectors.plane

import com.example.vectors.Vector

class NormalPlane(val normalVector: Vector, val support: Vector) : Plane {
    fun toCoordinatesPlane() = CoordinatesPlane(
        normalVector.x,
        normalVector.y,
        normalVector.z,
        normalVector.scalarProduct(support)
    )
}