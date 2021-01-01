package leetcode.challenge.`2020`.`06`.week2

// https://leetcode.com/problems/cheapest-flights-within-k-stops/
object CheapestFlightsWithinKStops {
    fun findCheapestPrice(n: Int, flights: Array<IntArray>, src: Int, dst: Int, K: Int): Int {

        var prices = IntArray(n) { Int.MAX_VALUE }
        prices[src] = 0
        for (i in 0..K) {
            val temp = prices.copyOf(n)
            for (flight in flights) {
                val cur = flight[0]
                val next = flight[1]
                val price = flight[2]
                if (prices[cur] == Int.MAX_VALUE) continue
                temp[next] = minOf(temp[next], prices[cur] + price)
            }
            prices = temp
        }
        return if (prices[dst] == Int.MAX_VALUE) -1 else prices[dst]
    }
}