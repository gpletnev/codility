package leetcode.challenge.`2020`.`05`.week3

// https://leetcode.com/problems/count-square-submatrices-with-all-ones/
object CountSquareSubmatricesWithAllOnes {
    fun countSquares(matrix: Array<IntArray>): Int {
        var res = 0
        for (i in matrix.indices) {
            for (j in matrix[0].indices) {
                if (matrix[i][j] > 0 && i > 0 && j > 0) {
                    matrix[i][j] = minOf(matrix[i - 1][j - 1], matrix[i - 1][j], matrix[i][j - 1]) + 1
                }
                res += matrix[i][j]
            }
        }
        return res
    }
}