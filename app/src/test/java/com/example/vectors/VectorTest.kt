package com.example.vectors

import com.google.common.truth.Truth
import org.junit.Test

class VectorTest {

    @Test
    fun t() {
        val v = Vector(1, 0, 0)
        val x = Vector(0, 1, 0)

        val vx = v.crossProduct(x)

        val res = Vector(0, 0, -1)

        Truth.assertThat(vx).isEqualTo(res)
    }
}