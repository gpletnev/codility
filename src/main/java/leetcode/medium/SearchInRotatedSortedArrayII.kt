package leetcode.medium

// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
object SearchInRotatedSortedArrayII {
    fun search(nums: IntArray, target: Int): Boolean {
        var lo = 0
        var hi = nums.lastIndex
        while (lo <= hi) {
            val m = lo + (hi - lo) / 2
            if (nums[m] == target) return true
            if (nums[m] == nums[lo]) lo++
            else if (nums[m] > nums[lo]) {
                if (nums[m] > target && nums[lo] <= target)
                    hi = m - 1
                else
                    lo = m + 1
            } else {
                if (nums[m] < target && nums[hi] >= target)
                    lo = m + 1
                else
                    hi = m - 1
            }
        }
        return false
    }
}