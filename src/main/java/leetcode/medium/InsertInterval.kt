package leetcode.medium

// https://leetcode.com/problems/insert-interval/
fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
    val result = mutableListOf<IntArray>()

    var start = newInterval[0]
    var end = newInterval[1]

    var i = 0

    // get the intervals which are smaller than the newInterval
    while (i < intervals.size && intervals[i][1] < start) result.add(intervals[i++])

    // check if any overlapping exist and define the boundaries for the merged intervals
    while (i < intervals.size && intervals[i][0] <= end) {
        start = minOf(intervals[i][0], start)
        end = maxOf(intervals[i++][1], end)
    }

    // add the merged intervals
    result.add(intArrayOf(start, end))

    // add the remaining part that its size is larger than the merged part
    while (i < intervals.size) result.add(intervals[i++])

    return result.toTypedArray()
}