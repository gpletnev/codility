package leetcode.challenge.week1

// https://leetcode.com/problems/move-zeroes/
object MoveZeroes {
    fun moveZeroes(nums: IntArray) {
        var j = 0
        for (n in nums) {
            if (n != 0) {
                nums[j++] = n
            }
        }
        while (j < nums.size) {
            nums[j++] = 0
        }
    }
}