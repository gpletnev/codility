package leetcode.challenge.`2021`.`01`.week4

// https://leetcode.com/problems/sort-the-matrix-diagonally/
fun diagonalSort(mat: Array<IntArray>): Array<IntArray> {
    for (i in mat.indices) {
        sort(mat, i, 0)
    }
    for (j in 1..mat[0].lastIndex) {
        sort(mat, 0, j)
    }
    return mat
}

private fun sort(mat: Array<IntArray>, i: Int, j: Int) {
    val m = minOf(mat.size - i, mat[0].size - j)
    val arr = IntArray(m) {
        mat[i + it][j + it]
    }
    arr.sort()
    for (k in arr.indices) {
        mat[i + k][j + k] = arr[k]
    }
}