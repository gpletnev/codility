package leetcode.challenge.june2020.week1

// https://leetcode.com/problems/two-city-scheduling/
object TwoCityScheduling {
    fun twoCitySchedCost(costs: Array<IntArray>): Int {
        costs.sortWith(Comparator { a, b -> a[0] - a[1] - (b[0] - b[1]) })

        val n = costs.lastIndex / 2

        return costs.foldIndexed(0) { i, cost, it -> cost + if (i > n) it[1] else it[0] }
    }
}