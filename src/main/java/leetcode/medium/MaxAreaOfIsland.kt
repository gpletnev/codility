package leetcode.medium

// https://leetcode.com/problems/max-area-of-island/submissions/
fun maxAreaOfIsland(grid: Array<IntArray>): Int {
    var maxArea = 0

    for (i in grid.indices)
        for (j in grid[0].indices) {
            if (grid[i][j] != 0) {
                maxArea = maxOf(maxArea, maxAreaOfIsland(grid, i, j))
            }
        }

    return maxArea
}

private fun maxAreaOfIsland(grid: Array<IntArray>, i: Int, j: Int): Int {
    if (i !in grid.indices || j !in grid[0].indices || grid[i][j] == 0) return 0
    grid[i][j] = 0
    return 1 + maxAreaOfIsland(grid, i + 1, j) + maxAreaOfIsland(grid, i - 1, j) + maxAreaOfIsland(
        grid,
        i,
        j + 1
    ) + maxAreaOfIsland(grid, i, j - 1)
}

