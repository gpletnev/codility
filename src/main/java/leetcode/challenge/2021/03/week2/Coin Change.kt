package leetcode.challenge.`2021`.`03`.week2

// https://leetcode.com/problems/coin-change/
fun coinChange(coins: IntArray, amount: Int): Int {
    val dp = IntArray(amount + 1)
    for (i in 1..amount) {
        var min = Int.MAX_VALUE
        for (coin in coins) {
            val j = i - coin
            if (j >= 0 && dp[j] < min)
                min = dp[j] + 1
        }
        // Set dp[i] to -1 if i (current amount) can not be reach by  coins array
        dp[i] = min
    }
    return if (dp[amount] == Int.MAX_VALUE) -1 else dp[amount]
}