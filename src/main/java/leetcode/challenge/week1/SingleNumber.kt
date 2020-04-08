package leetcode.challenge.week1

// https://leetcode.com/problems/single-number/
object SingleNumber {
    fun singleNumber(nums: IntArray): Int {
        return nums.fold(0) {xor, item -> xor.xor(item)}
    }
}