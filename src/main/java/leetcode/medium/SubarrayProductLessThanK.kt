package leetcode.medium

// https://leetcode.com/problems/subarray-product-less-than-k/
fun numSubarrayProductLessThanK(nums: IntArray, k: Int): Int {
    if (k <= 1) return 0
    var prod = 1
    var count = 0
    var left = 0
    for (right in nums.indices) {
        prod *= nums[right]
        while (prod >= k) prod /= nums[left++]
        count += right - left + 1
    }
    return count
}