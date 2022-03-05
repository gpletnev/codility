package leetcode.medium

// https://leetcode.com/problems/minimum-size-subarray-sum/
fun minSubArrayLen(target: Int, nums: IntArray): Int {
    var count = Int.MAX_VALUE

    var start = 0
    var sum = 0

    for (end in nums.indices) {
        sum += nums[end]
        while (sum >= target) {
            count = minOf(count, end - start + 1)
            sum -= nums[start++]
        }
    }
    return if (count != Int.MAX_VALUE) count else 0
}