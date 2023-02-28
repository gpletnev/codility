package leetcode.medium

// https://leetcode.com/problems/house-robber/
fun rob(nums: IntArray): Int {
    if (nums.size == 1) return nums[0]

    var prev = nums[0]
    var curr = maxOf(nums[0], nums[1])
    var max = curr
    for (i in 2..nums.lastIndex) {
        max = maxOf(prev + nums[i], curr)
        prev = curr
        curr = max
    }

    return max
}