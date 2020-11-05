package leetcode.challenge.`2020`.`11`.week1

import kotlin.math.min

// https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
fun minCostToMoveChips(position: IntArray): Int {
    var even = 0
    var odd = 0
    for (i in position) {
        if (i % 2 == 0) even++ else odd++
    }
    return min(odd, even)
}