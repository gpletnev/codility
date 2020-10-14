package leetcode.challenge.`2020`.`10`.week2

import kotlin.math.max

// https://leetcode.com/problems/house-robber-ii/
fun rob(nums: IntArray): Int {
    if (nums.isEmpty()) return 0
    if (nums.size == 1) return nums[0]
    return max(robClassic(nums.copyOfRange(0, nums.lastIndex)), robClassic(nums.copyOfRange(1, nums.lastIndex + 1)))
}

fun robClassic(nums: IntArray): Int {
    var prevNo = 0
    var prevYes = 0
    for (num in nums) {
        val temp = prevNo
        prevNo = max(prevNo, prevYes)
        prevYes = num + temp
    }
    return Math.max(prevNo, prevYes)
}