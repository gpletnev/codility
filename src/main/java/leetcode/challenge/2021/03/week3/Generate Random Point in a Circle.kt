package leetcode.challenge.`2021`.`03`.week3

import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt

// https://leetcode.com/problems/generate-random-point-in-a-circle/
class Solution(val radius: Double, val x_center: Double, val y_center: Double) {

    fun randPoint(): DoubleArray {
        val len = sqrt(Math.random()) * radius
        val deg = Math.random() * 2 * Math.PI
        val x = x_center + len * cos(deg)
        val y = y_center + len * sin(deg)
        return doubleArrayOf(x, y)
    }
}
