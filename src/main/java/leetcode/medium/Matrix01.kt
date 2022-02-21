package leetcode.medium

// https://leetcode.com/problems/01-matrix/
fun updateMatrix(mat: Array<IntArray>): Array<IntArray> {
    val m = mat.size
    val n = mat[0].size
    val dist = Array(m) { IntArray(n) { m + n - 2 } }

    for (i in 0 until m)
        for (j in 0 until n) {
            if (mat[i][j] == 0) {
                dist[i][j] = 0
            } else {
                if (i > 0)
                    dist[i][j] = minOf(dist[i][j], dist[i - 1][j] + 1)
                if (j > 0)
                    dist[i][j] = minOf(dist[i][j], dist[i][j - 1] + 1)
            }
        }

    for (i in m - 1 downTo 0)
        for (j in n - 1 downTo 0) {
            if (i < m - 1)
                dist[i][j] = minOf(dist[i][j], dist[i + 1][j] + 1)
            if (j < n - 1)
                dist[i][j] = minOf(dist[i][j], dist[i][j + 1] + 1)
        }

    return dist
}