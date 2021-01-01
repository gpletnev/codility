package leetcode.challenge.`2020`.`07`.week4

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
fun findMin(nums: IntArray): Int {
    var lo = 0
    var hi: Int = nums.lastIndex

    while (lo < hi) {
        val mid = lo + (hi - lo) / 2
        when {
            nums[mid] > nums[hi] -> {
                lo = mid + 1
            }
            nums[mid] < nums[hi] -> {
                hi = mid
            }
            else -> {
                hi--
            }
        }
    }
    return nums[lo]
}