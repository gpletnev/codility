package leetcode.challenge.`2021`.`01`.week3

// https://leetcode.com/problems/find-the-most-competitive-subsequence/
fun mostCompetitive(nums: IntArray, k: Int): IntArray {
    if (k == nums.size) return nums

    var index = -1
    val result = IntArray(k)
    var left: Int

    for (i in nums.indices) {
        left = nums.size - i
        while (index >= 0 && nums[i] < result[index] && left >= k - index) {
            --index
        }
        if (index < result.lastIndex) result[++index] = nums[i]
    }

    return result
}