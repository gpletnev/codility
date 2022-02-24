package leetcode.medium

// https://leetcode.com/problems/house-robber/
fun rob(nums: IntArray): Int {
    when (nums.size) {
        1 -> return nums[0]
        2 -> return maxOf(nums[0], nums[1])
    }
    var n2 = nums[0]
    var n1 = maxOf(nums[0], nums[1])
    var max = n1
    for (i in 2..nums.lastIndex) {
        max = maxOf(n2 + nums[i], n1)
        n2 = n1
        n1 = max
    }

    return max
}