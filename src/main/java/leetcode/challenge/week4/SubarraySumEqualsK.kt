package leetcode.challenge.week4

import java.util.*

// https://leetcode.com/problems/subarray-sum-equals-k/solution/
object SubarraySumEqualsK {
    // time O(n*n) space O(n)
/*    fun subarraySum(nums: IntArray, k: Int): Int {
        val sums = IntArray(nums.size + 1)
        for (i in 1..nums.size)
            sums[i] = sums[i - 1] + nums[i - 1]

        var count = 0
        for (i in nums.indices) {
            for (j in (i + 1)..nums.size) {
                if (sums[j] - sums[i] == k)
                    count++
            }
        }
        return count
    }*/

    // time O(n*n) space O(1)
/*    fun subarraySum(nums: IntArray, k: Int): Int {
        var count = 0
        for (start in nums.indices) {
            var sum = 0
            for (end in start until nums.size) {
                sum += nums[end]
                if (sum == k) count++
            }
        }
        return count
    }*/

    // time O(n) space O(n)
    fun subarraySum(nums: IntArray, k: Int): Int {
        var count = 0
        var sum = 0
        val map = HashMap<Int, Int>()
        map[0] = 1
        for (i in nums.indices) {
            sum += nums[i]
            count += map.getOrDefault(sum - k, 0)
            map[sum] = map.getOrDefault(sum, 0) + 1
        }
        return count
    }
}