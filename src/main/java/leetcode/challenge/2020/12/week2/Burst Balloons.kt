package leetcode.challenge.`2020`.`12`.week2

// https://leetcode.com/problems/burst-balloons/
fun maxCoins(_nums: IntArray): Int {
    val nums = IntArray(_nums.size + 2)
    var n = 1
    for (x in _nums) if (x > 0) nums[n++] = x
    nums[0] = 1.also { nums[n++] = it }

    val dp = Array(n) { IntArray(n) }
    for (k in 2 until n)
        for (left in 0 until n - k) {
            val right = left + k
            for (i in left + 1 until right) dp[left][right] = Math.max(
                dp[left][right],
                nums[left] * nums[i] * nums[right] + dp[left][i] + dp[i][right]
            )
        }

    return dp[0][n - 1]
}
