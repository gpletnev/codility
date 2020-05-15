package leetcode.challenge.april2020.week1

import java.lang.Integer.max

// https://leetcode.com/problems/maximum-subarray/
object MaximumSubarray {
    fun maxSubArray(nums: IntArray): Int {
        var localMax = 0
        var globalMax = Int.MIN_VALUE

        for (n in nums) {
            localMax = max(n, n + localMax)
            if (localMax > globalMax)
                globalMax = localMax
        }
        return globalMax
        //return maxSubArraySum(nums, 0, nums.lastIndex)
    }

    private fun maxSubArraySum(nums: IntArray, l: Int, r: Int): Int {
        if (l == r)
            return nums[l]

        val m = (l + r) / 2

        return Math.max(Math.max(maxSubArraySum(nums, l, m),
                maxSubArraySum(nums, m + 1, r)),
                maxCrossingSum(nums, l, m, r))
    }

    private fun maxCrossingSum(nums: IntArray, l: Int, m: Int, r: Int): Int {
        var sum = 0
        var leftSum = Int.MIN_VALUE
        for (i in m downTo l) {
            sum += nums[i]
            if (sum > leftSum) leftSum = sum
        }

        sum = 0
        var rightSum = Int.MIN_VALUE
        for (i in m + 1..r) {
            sum += nums[i]
            if (sum > rightSum) rightSum = sum
        }

        return leftSum + rightSum
    }
}