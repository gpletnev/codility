package leetcode.easy.array

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
object BestTimeToBuyAndSellStockII {
    public final fun maxProfit(prices: IntArray): Int {
    // at every profit
        var maxProfit = 0
        for (i in 1..prices.lastIndex) {
            val diff = prices[i] - prices[i - 1]
            if (diff > 0) {
                maxProfit += diff
            }
        }
        return maxProfit
    }
}