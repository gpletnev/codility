package leetcode.challenge.week1

object SingleNumber {

    fun singleNumber(nums: IntArray): Int {
        return nums.fold(0) {xor, item -> xor.xor(item)}
    }
}