package leetcode.easy.array

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
object BestTimeToBuyAndSellStock {
    fun maxProfit(prices: IntArray): Int {
    // find min followed by max
        var maxProfit = 0
        if (prices.isNotEmpty()) {
            var min = prices[0]
            for (i in 1..prices.lastIndex) {
                if (prices[i] < min) {
                    min = prices[i]
                }
                val diff = prices[i] - min
                if (diff > 0 && diff > maxProfit)
                    maxProfit = diff
            }
        }
        return maxProfit
    }
}