package leetcode.challenge.may2020.week2

// https://leetcode.com/problems/single-element-in-a-sorted-array/
object SingleElementInASortedArray {
    fun singleNonDuplicate(nums: IntArray): Int {
        var left = 0
        var right = nums.lastIndex

        while (left < right) {
            val mid = left + (right - left) / 2

            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid + 1])
                    left = mid + 1
                else
                    right = mid
            } else {
                if (nums[mid] == nums[mid - 1])
                    left = mid + 1
                else
                    right = mid
            }
        }

        return nums[left]
        //return nums.fold(0) {xor, item -> xor.xor(item)}
    }
}