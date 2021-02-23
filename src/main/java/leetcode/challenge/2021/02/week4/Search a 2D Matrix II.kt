package leetcode.challenge.`2021`.`02`.week4

// https://leetcode.com/problems/search-a-2d-matrix-ii/
fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    val n = matrix.size
    val m = matrix[0].size
    var i = 0
    var j = m - 1

    while (i < n && j >= 0) {
        val num = matrix[i][j]
        if (num == target)
            return true
        else if (num > target)
            j--
        else
            i++
    }

    return false
}