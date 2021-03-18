package leetcode.challenge.`2021`.`03`.week3

// https://leetcode.com/problems/wiggle-subsequence/
fun wiggleMaxLength(nums: IntArray): Int {
    if (nums.size < 2) return nums.size
    var prevdiff = nums[1] - nums[0]
    var count = if (prevdiff != 0) 2 else 1
    for (i in 2 until nums.size) {
        val diff = nums[i] - nums[i - 1]
        if (diff > 0 && prevdiff <= 0 || diff < 0 && prevdiff >= 0) {
            count++
            prevdiff = diff
        }
    }
    return count
}