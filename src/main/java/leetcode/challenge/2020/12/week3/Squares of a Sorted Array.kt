package leetcode.challenge.`2020`.`12`.week3

import kotlin.math.abs

// https://leetcode.com/problems/squares-of-a-sorted-array/
fun sortedSquares(nums: IntArray): IntArray {
    val result = IntArray(nums.size)
    var left = 0
    var right = nums.lastIndex
    for (i in nums.lastIndex downTo 0) {
        val absLeft = abs(nums[left])
        val absRight = abs(nums[right])
        if (abs(absLeft) > abs(absRight)) {
            result[i] = absLeft * absLeft
            left++
        } else {
            result[i] = absRight * absRight
            right--
        }
    }
    return result
}