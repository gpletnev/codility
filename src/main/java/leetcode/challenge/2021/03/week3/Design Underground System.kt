package leetcode.challenge.`2021`.`03`.week3

// https://leetcode.com/problems/design-underground-system/
class UndergroundSystem {
    var checkoutMap = mutableMapOf<String, Pair<Int, Int>>() // Route - {TotalTime, Count}
    var checkInMap = mutableMapOf<Int, Pair<String, Int>>() // Uid - {StationName, Time}

    fun checkIn(id: Int, stationName: String, t: Int) {
        checkInMap[id] = Pair(stationName, t)
    }

    fun checkOut(id: Int, stationName: String, t: Int) {
        val checkIn = checkInMap[id]!!
        val route = "${checkIn.first}_$stationName"
        val totalTime = t - checkIn.second
        val checkout = checkoutMap.getOrDefault(route, Pair(0, 0))
        checkoutMap[route] = Pair(checkout.first + totalTime, checkout.second + 1)
    }

    fun getAverageTime(startStation: String, endStation: String): Double {
        val route = "${startStation}_$endStation"
        val checkout = checkoutMap[route]!!
        return checkout.first.toDouble() / checkout.second
    }
}