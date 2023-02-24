package leetcode.challenge.`2020`.`10`.week3

// https://leetcode.com/problems/search-a-2d-matrix/
fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    if (matrix.isEmpty() || matrix[0].isEmpty()) return false
    if (target < matrix[0][0] || target > matrix[matrix.lastIndex][matrix[0].lastIndex]) return false

    /*    var top = 0
        var down = matrix.lastIndex
        val col = matrix[0].lastIndex
        while (top <= down) {
            val mid = top + (down - top) / 2
            if (matrix[mid][0] <= target && matrix[mid][col] >= target) {
                return searchRow(matrix, mid, target)
            }
            if (matrix[mid][col] < target) {
                top = mid + 1
            }
            if (matrix[mid][0] > target) {
                down = mid - 1
            }
        }*/
    val m = matrix.size
    val n = matrix[0].size

    var i = 0
    var j = m * n - 1

    while (i <= j) {
        val mid = i + (j - i) / 2
        val num = matrix[mid / n][mid % n]
        when {
            num > target -> j = mid - 1
            num < target -> i = mid + 1
            else -> return true
        }
    }

    return false
}

fun searchRow(matrix: Array<IntArray>, rowIndex: Int, target: Int): Boolean {
    var left = 0
    var right = matrix[rowIndex].lastIndex
    while (left <= right) {
        val mid = left + (right - left) / 2
        when {
            matrix[rowIndex][mid] < target -> {
                left = mid + 1
            }

            matrix[rowIndex][mid] > target -> {
                right = mid - 1
            }

            else -> {
                return true
            }
        }
    }
    return false
}