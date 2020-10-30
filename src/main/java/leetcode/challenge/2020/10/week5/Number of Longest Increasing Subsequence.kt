package leetcode.challenge.`2020`.`10`.week5

// https://leetcode.com/problems/number-of-longest-increasing-subsequence/
fun findNumberOfLIS(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    val dp = Array(nums.size) { IntArray(2) } // dp[i] is the longest increasing subsequence ending with element i. dp[i][0] is length of LIS, dp[i][1] is number of LIS'.

    var numLIS = 0
    var lengthLIS = 0
    for (i in nums.indices) {
        dp[i][0] = 1 // Initial values are 1 because every element alone by itself forms a LIS of length 1.
        dp[i][1] = 1
        // This loop iterates through all LIS' that end at previous elements j to compute the LIS' that end at the current element i.
        for (j in 0 until i) {
            // Check if LIS ending with element j can be extended by element i.
            if (nums[j] < nums[i]) {
                if (dp[j][0] + 1 == dp[i][0]) {
                    // When extending dp[j] we get subsequences of the same length as the current LIS so we just update the number of them.
                    dp[i][1] += dp[j][1]
                } else if (dp[i][0] < dp[j][0] + 1) {
                    // By extending dp[j] with element i we get longer subsequences ending at i than the ones known so far.
                    dp[i][0] = dp[j][0] + 1
                    dp[i][1] = dp[j][1]
                }
            }
        }
        // Now that we have all the LIS' that end at element i we check how this influences the result (new max length is found or more of the already known max length is found)
        if (lengthLIS < dp[i][0]) {
            lengthLIS = dp[i][0]
            numLIS = dp[i][1]
        } else if (lengthLIS == dp[i][0]) {
            numLIS += dp[i][1]
        }
    }
    return numLIS
}