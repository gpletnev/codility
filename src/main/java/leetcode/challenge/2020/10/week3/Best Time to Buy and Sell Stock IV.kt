package leetcode.challenge.`2020`.`10`.week3

import java.util.*

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/
fun maxProfit(k: Int, prices: IntArray): Int {
    val n: Int = prices.size
    // solve special cases
    if (n <= 0 || k <= 0) {
        return 0
    }

    var res = 0
    /*
// dp solution
        if (2 * k > n) {
            var res = 0
            for (i in 1 until n) {
                res += max(0, prices[i] - prices[i - 1])
            }
            return res
        }

        // dp[i][used_k][ishold] = balance
        // ishold: 0 nothold, 1 hold
        // initialize the array with -inf
        val dp = Array(n) { Array(k + 1) { IntArray(2) { -1000000 } } }

        // set starting value
        dp[0][0][0] = 0
        dp[0][1][1] = -prices[0]

        // fill the array
        for (i in 1 until n) {
            for (j in 0..k) {
                // transition equation
                dp[i][j][0] = max(dp[i - 1][j][0], dp[i - 1][j][1] + prices[i])
                // you can't hold stock without any transaction
                if (j > 0) {
                    dp[i][j][1] = max(dp[i - 1][j][1], dp[i - 1][j - 1][0] - prices[i])
                }
            }
        }
        for (j in 0..k) {
            res = max(res, dp[n - 1][j][0])
        }
    */
    // find all consecutively increasing subsequence
    val transactions = ArrayList<IntArray>()
    var start = 0
    var end = 0
    for (i in 1 until n) {
        if (prices[i] >= prices[i - 1]) {
            end = i
        } else {
            if (end > start) {
                val t = intArrayOf(start, end)
                transactions.add(t)
            }
            start = i
        }
    }
    if (end > start) {
        val t = intArrayOf(start, end)
        transactions.add(t)
    }

    while (transactions.size > k) {
        // check delete loss
        var delete_index = 0
        var min_delete_loss = Int.MAX_VALUE
        for (i in transactions.indices) {
            val t = transactions[i]
            val profit_loss = prices[t[1]] - prices[t[0]]
            if (profit_loss < min_delete_loss) {
                min_delete_loss = profit_loss
                delete_index = i
            }
        }

        // check merge loss
        var merge_index = 0
        var min_merge_loss = Int.MAX_VALUE
        for (i in 1 until transactions.size) {
            val t1 = transactions[i - 1]
            val t2 = transactions[i]
            val profit_loss = prices[t1[1]] - prices[t2[0]]
            if (profit_loss < min_merge_loss) {
                min_merge_loss = profit_loss
                merge_index = i
            }
        }

        // delete or merge
        if (min_delete_loss <= min_merge_loss) {
            transactions.removeAt(delete_index)
        } else {
            val t1 = transactions[merge_index - 1]
            val t2 = transactions[merge_index]
            t1[1] = t2[1]
            transactions.removeAt(merge_index)
        }
    }

    for (t in transactions) {
        res += prices[t[1]] - prices[t[0]]
    }
    return res
}