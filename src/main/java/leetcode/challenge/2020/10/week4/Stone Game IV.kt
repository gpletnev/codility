package leetcode.challenge.`2020`.`10`.week4

// https://leetcode.com/problems/stone-game-iv/
fun winnerSquareGame(n: Int): Boolean {
    val dp = BooleanArray(n + 1)
    for (i in 0..n) {
        if (dp[i]) {
            continue
        }
        var k = 1
        while (i + k * k <= n) {
            dp[i + k * k] = true
            k++
        }
    }
    return dp[n]
}