package leetcode.medium

// https://leetcode.com/problems/spiral-matrix/
fun spiralOrder(matrix: Array<IntArray>): List<Int> {
    val list = mutableListOf<Int>()
    var top = 0
    var left = 0
    var bottom = matrix.lastIndex
    var right = matrix[0].lastIndex
    var direction = 0
    while (top <= bottom && left <= right) {
        when (direction) {
            0 -> {
                for (i in left .. right) {
                    list.add(matrix[left][i])
                }
                top++
            }
            1 -> {
                for (i in top .. bottom ) {
                    list.add(matrix[i][right])
                }
                right--
            }
            2 -> {
                for (i in right downTo left) {
                    list.add(matrix[bottom][i])
                }
                bottom--
            }
            3 -> {
                for (i in bottom downTo top) {
                    list.add(matrix[i][left])
                }
                left++
            }
        }
        direction = (direction + 1) % 4

    }
    return list
}
