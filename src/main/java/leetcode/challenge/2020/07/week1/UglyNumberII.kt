package leetcode.challenge.`2020`.`07`.week1

// https://leetcode.com/problems/ugly-number-ii/
object UglyNumberII {
    fun nthUglyNumber(n: Int): Int {
        val nums = IntArray(n)
        var index2 = 0
        var index3 = 0
        var index5 = 0
        nums[0] = 1
        for (i in 1..nums.lastIndex) {
            nums[i] = minOf(nums[index2] * 2, nums[index3] * 3, nums[index5] * 5)
            if (nums[i] == nums[index2] * 2) index2++
            if (nums[i] == nums[index3] * 3) index3++
            if (nums[i] == nums[index5] * 5) index5++
        }
        return nums.last()
    }
}