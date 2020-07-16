package leetcode.easy

// https://leetcode.com/problems/height-checker/
fun heightChecker(heights: IntArray): Int {
    var count = 0
    val sorted = heights.sortedArray()
    for (i in heights.indices) {
        if (heights[i] != sorted[i]) count++
    }
    return count
}