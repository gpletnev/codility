package leetcode.challenge.`2021`.`02`.week3

// https://leetcode.com/problems/container-with-most-water/
fun maxArea(height: IntArray): Int {
    var left = 0
    var right = height.lastIndex
    var maxArea = 0
    while (left < right) {
        maxArea = maxOf(maxArea, (right - left) * minOf(height[left], height[right]))
        if (height[left] < height[right]) left++ else right--
    }
    return maxArea
}