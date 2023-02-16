package leetcode.medium

// https://leetcode.com/problems/where-will-the-ball-fall/
fun findBall(grid: Array<IntArray>): IntArray {
    val result = IntArray(grid[0].size)
    for (i in grid[0].indices) {
        result[i] = findBallDropColumn(0, i, grid)
    }
    return result
}

fun findBallDropColumn(row: Int, col: Int, grid: Array<IntArray>): Int {
    if (row == grid.size) return col
    val nextColumn = col + grid[row][col]
    return if (nextColumn in grid[0].indices && grid[row][col] == grid[row][nextColumn]) {
        findBallDropColumn(row + 1, nextColumn, grid)
    } else {
        -1
    }
}