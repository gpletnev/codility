package leetcode.challenge.`2020`.`10`.week2

import kotlin.math.min

// https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/
fun findMinArrowShots(points: Array<IntArray>): Int {
    if (points.isEmpty()) return 0

    points.sortBy { it[0] }

    var count = 1
    var minEnd = points[0][1]

    for (point in points) {
        minEnd = if (point[0] > minEnd) {
            count++
            point[1]
        } else {
            min(minEnd, point[1])
        }
    }
    return count
}