package leetcode.challenge.may2020.week4

// https://leetcode.com/problems/uncrossed-lines/
object UncrossedLines {
    fun maxUncrossedLines(A: IntArray, B: IntArray): Int {
        val dp = Array(2) { IntArray(B.size + 1) }

        var flag = 1
        for (i in A.lastIndex downTo 0) {
            for (j in B.lastIndex downTo 0) {
                dp[flag][j] = if (A[i] == B[j]) dp[flag xor 1][j + 1] + 1 else maxOf(dp[flag][j + 1], dp[flag xor 1][j])
            }
            flag = flag xor 1
        }

        return dp[flag xor 1][0]
    }
}