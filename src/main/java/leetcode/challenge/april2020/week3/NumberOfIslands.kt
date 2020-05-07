package leetcode.challenge.april2020.week3

object NumberOfIslands {
    private fun dfs(grid: Array<CharArray>, row: Int, col: Int) {
        grid[row][col] = '0'

        if (row + 1 <= grid.lastIndex) {
            if (grid[row + 1][col] != '0')
                dfs(grid, row + 1, col)
        }
        if (row - 1 >= 0) {
            if (grid[row - 1][col] != '0')
                dfs(grid, row - 1, col)
        }
        if (col + 1 <= grid[0].lastIndex) {
            if (grid[row][col + 1] != '0')
                dfs(grid, row, col + 1)
        }
        if (col - 1 >= 0) {
            if (grid[row][col - 1] != '0')
                dfs(grid, row, col - 1)
        }
    }

    fun numIslands(grid: Array<CharArray>): Int {
        var count = 0
        for (i in grid.indices) {
            for (j in grid[0].indices) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j)
                    count++
                }
            }
        }
        return count
    }
}