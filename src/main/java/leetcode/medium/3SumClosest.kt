package leetcode.medium

import kotlin.math.abs

// https://leetcode.com/problems/3sum-closest/
fun threeSumClosest(nums: IntArray, target: Int): Int {
    nums.sort()
    var closest = nums.first() + nums[1] + nums.last()
    for (i in 0..nums.lastIndex - 2) {
        var left = i + 1
        var right = nums.lastIndex
        while (left < right) {
            val sum = nums[i] + nums[left] + nums[right]
            when {
                sum > target -> right--
                sum < target -> left++
                else -> return sum
            }
            if (abs(sum - target) < abs(closest - target)) closest = sum
        }
    }

    return closest
}