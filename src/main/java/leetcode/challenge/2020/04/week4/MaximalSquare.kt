package leetcode.challenge.`2020`.`04`.week4

// https://leetcode.com/problems/maximal-square/
object MaximalSquare {
    fun maximalSquare(matrix: Array<CharArray>): Int {
        val m = matrix.size
        val n = if (m > 0) matrix[0].size else 0

        var maxLength = 0

/*        val dp = Array(m + 1) { IntArray(n + 1) }
        for (i in 1..m)
            for (j in 1..n) {
                if (matrix[i - 1][j - 1] == '1') {
                    dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]) + 1
                    maxLength = Math.max(maxLength, dp[i][j])
                }
            }*/

        val dp = IntArray(n + 1)
        var prev = 0
        for (i in 1..m)
            for (j in 1..n) {
                val temp = dp[j]
                if (matrix[i - 1][j - 1] == '1') {
                    dp[j] = Math.min(Math.min(dp[j - 1], prev), dp[j]) + 1
                    maxLength = Math.max(maxLength, dp[j])
                } else {
                    dp[j] = 0
                }
                prev = temp
            }
        return maxLength * maxLength
    }
}