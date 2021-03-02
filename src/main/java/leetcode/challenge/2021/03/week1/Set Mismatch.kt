package leetcode.challenge.`2021`.`03`.week1

// https://leetcode.com/problems/set-mismatch/
fun findErrorNums(nums: IntArray): IntArray {
    val correctSum = nums.size * (1 + nums.size) / 2
    var actualSum = 0
    var duplicated = 0
    for (n in nums) {
        nums[Math.abs(n) - 1] *= -1
        if (nums[Math.abs(n) - 1] > 0) {
            duplicated = Math.abs(n)
        }
        actualSum += Math.abs(n)
    }
    return intArrayOf(duplicated, correctSum - (actualSum - duplicated))
}