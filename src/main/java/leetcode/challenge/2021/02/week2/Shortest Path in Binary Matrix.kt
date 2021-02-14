package leetcode.challenge.`2021`.`02`.week2

import java.util.*

// https://leetcode.com/problems/shortest-path-in-binary-matrix/
fun shortestPathBinaryMatrix(grid: Array<IntArray>): Int {
    val m = grid.size
    val n = grid[0].size

    if (grid[0][0] == 1 || grid[m - 1][n - 1] == 1) return -1

    val queue = LinkedList<Pair<Int, Int>>()

    queue.offerLast(0 to 0)
    grid[0][0] = 1
    var ans = 1

    while (queue.isNotEmpty()) {
        val s = queue.size

        for (i in 0 until s) {
            val node = queue.pollFirst()

            if (node.first == m - 1 && node.second == n - 1) {
                return ans
            }

            for (k in -1..1) {
                for (v in -1..1) {
                    val newX = node.first + k
                    val newY = node.second + v

                    if (newX in 0..m - 1 && newY in 0..n - 1 && grid[newX][newY] == 0) {
                        queue.offerLast(newX to newY)
                        grid[newX][newY] = 1
                    }
                }
            }
        }

        ans++
    }

    return -1
}