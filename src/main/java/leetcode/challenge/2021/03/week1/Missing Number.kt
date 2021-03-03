package leetcode.challenge.`2021`.`03`.week1

// https://leetcode.com/problems/missing-number/
fun missingNumber(nums: IntArray): Int {
    val sum = nums.size * (nums.size + 1) / 2
    return sum - nums.sum()
}