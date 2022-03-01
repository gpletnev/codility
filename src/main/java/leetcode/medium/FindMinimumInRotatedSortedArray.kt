package leetcode.medium

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
fun findMin(nums: IntArray): Int {
    var l = 0
    var r = nums.size - 1
    while (l <= r) {
        val m = l + (r - l) / 2
        when {
            nums[m] > nums[r] -> l = m + 1
            nums[m] < nums[r] -> r = m
            else -> return nums[m]
        }
    }
    return -1
}