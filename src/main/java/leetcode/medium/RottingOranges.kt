package leetcode.medium

import java.util.*

// https://leetcode.com/problems/rotting-oranges/
fun orangesRotting(grid: Array<IntArray>): Int {
    var min = 0
    var fresh = 0
    val m = grid.size
    val n = grid[0].size
    val rotten = LinkedList<Pair<Int, Int>>()
    for (i in 0 until m)
        for (j in 0 until n) {
            when (grid[i][j]) {
                1 -> fresh++
                2 -> rotten.offer(Pair(i, j))
            }
        }

    val dirs = listOf(Pair(1, 0), Pair(-1, 0), Pair(0, 1), Pair(0, -1))
    while (fresh > 0 && rotten.isNotEmpty()) {
        min++
        repeat(rotten.size) {
            val (i, j) = rotten.poll()

            for (dir in dirs) {
                val x = i + dir.first
                val y = j + dir.second
                if (x in 0 until m && y in 0 until n && grid[x][y] == 1) {
                    rotten.offer(Pair(x, y))
                    grid[x][y] = 2
                    fresh--
                }
            }
        }
    }


    return if (fresh == 0) min else -1
}