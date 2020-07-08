package leetcode.challenge.july2020.week1

object `Island Perimeter` {
    fun islandPerimeter(grid: Array<IntArray>): Int {
        var islands = 0
        var neighbours = 0

        for (i in grid.indices) {
            for (j in grid[i].indices) {
                if (grid[i][j] == 1) {
                    islands++
                    if (i < grid.lastIndex && grid[i + 1][j] == 1) neighbours++
                    if (j < grid[i].lastIndex && grid[i][j + 1] == 1) neighbours++
                }
            }
        }

        return islands * 4 - neighbours * 2
    }
}