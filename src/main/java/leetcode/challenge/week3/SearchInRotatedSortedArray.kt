package leetcode.challenge.week3

// https://leetcode.com/problems/search-in-rotated-sorted-array/
object SearchInRotatedSortedArray {
    fun search(nums: IntArray, target: Int): Int {
        var lo = 0
        var hi: Int = nums.lastIndex
        while (lo <= hi) {
            val mid = lo + (hi - lo) / 2
            if (nums[mid] == target)
                return mid
            // If nums[mid] and target are "on the same side" of nums[0], just take nums[mid].
            val num = if (nums[mid] < nums[0] == target < nums[0]) {
                nums[mid]
            } else {
                if (target < nums[0]) Int.MIN_VALUE else Int.MAX_VALUE
            }

            when {
                num < target -> lo = mid + 1
                num > target -> hi = mid - 1
            }
        }
        return -1
    }
}