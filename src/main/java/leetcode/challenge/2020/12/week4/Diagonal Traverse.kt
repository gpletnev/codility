package leetcode.challenge.`2020`.`12`.week4

// https://leetcode.com/problems/diagonal-traverse/
fun findDiagonalOrder(matrix: Array<IntArray>): IntArray {
    if (matrix.isEmpty()) return IntArray(0)

    val m = matrix.size
    val n = matrix[0].size
    var row = 0
    var col = 0
    val result = IntArray(m * n)

    for (i in result.indices) {
        result[i] = matrix[row][col]
        if ((row + col) % 2 == 0) {
            when {
                col == n - 1 -> {
                    row++
                }
                row == 0 -> {
                    col++
                }
                else -> {
                    row--
                    col++
                }
            }
        } else {
            when {
                row == m - 1 -> {
                    col++
                }
                col == 0 -> {
                    row++
                }
                else -> {
                    row++
                    col--
                }
            }
        }
    }

    return result
}