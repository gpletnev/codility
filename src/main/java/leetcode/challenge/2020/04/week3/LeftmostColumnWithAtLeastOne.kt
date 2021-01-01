package leetcode.challenge.`2020`.`04`.week3

// https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/530/week-3/3306

class BinaryMatrix(val matrix: Array<IntArray>) {
    fun get(x: Int, y: Int): Int = matrix[x][y]
    fun dimensions(): List<Int> = listOf(matrix.size, matrix[0].size)
}

object LeftmostColumnWithAtLeastOne {
    fun leftMostColumnWithOne(binaryMatrix: BinaryMatrix): Int {
        val dimension = binaryMatrix.dimensions()
        val n = dimension[0]
        val m = dimension[1]
        var row = n - 1
        var column = m - 1
        var mostLeft = -1
        while (column >= 0 && row >= 0) {
            if (binaryMatrix.get(row, column) == 1) {
                mostLeft = mostLeft(binaryMatrix, row, column)
                column = mostLeft - 1
            } else {
                row--
            }
        }
        return mostLeft
    }

    fun mostLeft(matrix: BinaryMatrix, row: Int, column: Int): Int {
        var l = 0
        var r = column
        while (l < r) {
            val mid = l + (r - l) / 2
            if (matrix.get(row, mid) == 1) {
                r = mid
            } else {
                l = mid + 1
            }
        }
        return l
    }
}