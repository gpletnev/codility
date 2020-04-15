package leetcode.challenge.week3

// https://leetcode.com/problems/product-of-array-except-self/
object ProductOfArrayExceptSelf {
    fun productExceptSelf(nums: IntArray): IntArray {
/*        val output = IntArray(nums.size) { 1 }
        var l = 1;
        var r = 1
        for (i in nums.indices) {
            output[i] *= l
            output[nums.lastIndex - i] *= r
            l *= nums[i]
            r *= nums[nums.lastIndex - i]
        }*/
        val output = IntArray(nums.size)

        output[0] = 1
        for (i in 1..nums.lastIndex) {
            output[i] = output[i - 1] * nums[i - 1]
        }

        var r = 1
        for (i in nums.lastIndex downTo 0) {
            output[i] *= r
            r *= nums[i]
        }

        return output
    }
}