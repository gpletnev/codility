package leetcode.challenge.`2020`.`11`.week3

import java.util.*


fun merge(intervals: Array<IntArray>): Array<IntArray> {
    intervals.sortBy { it[0] }
    val result: MutableList<IntArray> = ArrayList()
    var newInterval = intervals[0]
    result.add(newInterval)
    for (interval in intervals) {
        if (interval[0] <= newInterval[1]) {
            // Overlapping intervals, move the end if needed
            newInterval[1] = Math.max(newInterval[1], interval[1])
        } else {
            // Disjoint intervals, add the new interval to the list
            newInterval = interval
            result.add(newInterval)
        }
    }
    return result.toTypedArray()
}