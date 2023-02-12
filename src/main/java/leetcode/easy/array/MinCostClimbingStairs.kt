package leetcode.easy.array

// https://leetcode.com/problems/min-cost-climbing-stairs/
fun minCostClimbingStairs(cost: IntArray): Int {

    for (i in 2..cost.lastIndex) {
        cost[i] += minOf(cost[i-1], cost[i-2])
    }

    return minOf(cost[cost.lastIndex-1], cost.last())
}