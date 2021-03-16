package leetcode.challenge.`2021`.`03`.week3

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/
fun maxProfit(prices: IntArray, fee: Int): Int {
    var cash = 0
    var hold = -prices[0]
    for (i in 1 until prices.size) {
        cash = maxOf(cash, hold + prices[i] - fee)
        hold = maxOf(hold, cash - prices[i])
    }
    return cash
}