package leetcode.challenge.`2021`.`04`.week1

// https://leetcode.com/problems/ones-and-zeroes/
fun findMaxForm(strs: Array<String>, m: Int, n: Int): Int {
    val dp = Array(m + 1) { IntArray(n + 1) }
    for (str in strs) {
        val zeros = str.filter { c -> c == '0' }.length
        val ones = str.length - zeros
        for (i in m downTo zeros)
            for (j in n downTo ones)
                dp[i][j] = kotlin.math.max(dp[i - zeros][j - ones] + 1, dp[i][j])
    }
    return dp[m][n]
}