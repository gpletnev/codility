package leetcode.challenge.day1

object SingleNumber {

    fun singleNumber(nums: IntArray): Int {
        return nums.fold(0) {xor, item -> xor.xor(item)}
    }
}