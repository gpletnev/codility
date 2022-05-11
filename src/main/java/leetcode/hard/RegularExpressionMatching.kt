package leetcode.hard

// https://leetcode.com/problems/regular-expression-matching/
fun isMatch(s: String, p: String): Boolean {
    if (p.isEmpty()) return s.isEmpty()

    val dp = Array(s.length + 1) {
        BooleanArray(
            p.length + 1
        )
    }
    dp[0][0] = true
    for (j in 2..p.length) {
        dp[0][j] = p[j - 1] == '*' && dp[0][j - 2]
    }

    for (j in 1..p.length) {
        for (i in 1..s.length) {
            if (p[j - 1] == s[i - 1] || p[j - 1] == '.') {
                dp[i][j] = dp[i - 1][j - 1]
            } else if (p[j - 1] == '*') {
                dp[i][j] = dp[i][j - 2] || (s[i - 1] == p[j - 2] || p[j - 2] == '.') && dp[i - 1][j]
            }
        }
    }
    return dp[s.length][p.length]
}