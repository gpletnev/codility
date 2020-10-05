package leetcode.challenge.`2020`.`10`.week1

import java.util.*

// https://leetcode.com/problems/remove-covered-intervals/
fun removeCoveredIntervals(intervals: Array<IntArray>): Int {
    var result = 0

    var right = 0
    Arrays.sort(intervals) { a: IntArray, b: IntArray -> if (a[0] != b[0]) a[0] - b[0] else b[1] - a[1] }
    intervals.forEach {
        if (it[1] > right) {
            ++result
            right = it[1]
        }
    }

    return result
}