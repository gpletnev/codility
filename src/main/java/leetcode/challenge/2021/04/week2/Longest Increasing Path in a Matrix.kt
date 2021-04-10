package leetcode.challenge.`2021`.`04`.week2

// https://leetcode.com/problems/longest-increasing-path-in-a-matrix/
val dirs = arrayOf(intArrayOf(0, 1), intArrayOf(1, 0), intArrayOf(0, -1), intArrayOf(-1, 0))

fun longestIncreasingPath(matrix: Array<IntArray>): Int {
    val m = matrix.size
    val n = matrix[0].size
    val cache = Array(m) { IntArray(n) }
    var max = 1
    for (i in 0 until m) {
        for (j in 0 until n) {
            val len = dfs(matrix, i, j, m, n, cache)
            max = Math.max(max, len)
        }
    }
    return max
}

fun dfs(matrix: Array<IntArray>, i: Int, j: Int, m: Int, n: Int, cache: Array<IntArray>): Int {
    if (cache[i][j] != 0) return cache[i][j]
    var max = 1
    for (dir in dirs) {
        val x = i + dir[0]
        val y = j + dir[1]
        if (x < 0 || x >= m || y < 0 || y >= n || matrix[x][y] <= matrix[i][j]) continue
        val len = 1 + dfs(matrix, x, y, m, n, cache)
        max = Math.max(max, len)
    }
    cache[i][j] = max
    return max
}