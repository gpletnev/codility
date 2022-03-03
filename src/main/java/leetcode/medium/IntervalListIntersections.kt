package leetcode.medium

// https://leetcode.com/problems/interval-list-intersections/
fun intervalIntersection(firstList: Array<IntArray>, secondList: Array<IntArray>): Array<IntArray> {
    val result = mutableListOf<IntArray>()
    var i = 0
    var j = 0

    while (i < firstList.size && j < secondList.size) {
        val lo = maxOf(firstList[i][0], secondList[j][0])
        val hi = minOf(firstList[i][1], secondList[j][1])

        if (lo <= hi) result.add(intArrayOf(lo, hi))

        if (firstList[i][1] < secondList[j][1])
            i++
        else
            j++
    }

    return result.toTypedArray()
}