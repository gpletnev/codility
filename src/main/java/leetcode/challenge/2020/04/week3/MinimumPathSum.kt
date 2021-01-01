package leetcode.challenge.`2020`.`04`.week3

object MinimumPathSum {

    fun minPathSum(grid: Array<IntArray>): Int {
        val m: Int = grid.size
        val n: Int = grid[0].size
        //return minPath(grid, m - 1, n - 1)

        for (i in 1 until m) {
            grid[i][0] += grid[i - 1][0]
        }

        for (j in 1 until n) {
            grid[0][j] += grid[0][j - 1]
        }

        for (i in 1 until m) {
            for (j in 1 until n) {
                grid[i][j] += Math.min(grid[i][j - 1], grid[i - 1][j])
            }
        }

        return grid[m - 1][n - 1]
    }

    fun minPath(grid: Array<IntArray>, row: Int, col: Int): Int {
        if (row == 0 && col == 0) return grid[row][col]

        if (row == 0) return grid[row][col] + minPath(grid, row, col - 1)

        if (col == 0) return grid[row][col] + minPath(grid, row - 1, col)

        return grid[row][col] + Math.min(minPath(grid, row - 1, col), minPath(grid, row, col - 1))
    }
}