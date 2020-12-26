package leetcode.challenge.`2020`.`12`.week4

// https://leetcode.com/problems/decode-ways/
fun numDecodings(s: String): Int {
    val dp = IntArray(s.length + 1) { 0 }

    dp[0] = 1
    dp[1] = if (s[0] == '0') 0 else 1

    for (i in 2..s.length) {
        if (s[i - 1] >= '1') {
            dp[i] += dp[i - 1]
        }
        if (s[i - 2] == '1' || (s[i - 2] == '2' && s[i - 1] <= '6')) {
            dp[i] += dp[i - 2]
        }
    }
    return dp[s.length]
}