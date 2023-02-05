package leetcode.easy.array

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
object BestTimeToBuyAndSellStock {
    fun maxProfit(prices: IntArray): Int {
        // find min followed by max
        val iterator = prices.iterator()
        var maxProfit = 0
        var min = iterator.next()
        while (iterator.hasNext()) {
            val price = iterator.next()
            if (price < min) {
                min = price
            }
            val diff = price - min
            if (diff > 0 && diff > maxProfit) {
                maxProfit = diff
            }
        }

        return maxProfit
    }
}