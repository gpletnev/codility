package leetcode.medium

// https://leetcode.com/problems/number-of-provinces/
fun findCircleNum(isConnected: Array<IntArray>): Int {
    var count = 0
    for (i in isConnected.indices) {
        for (j in isConnected[i].indices) {
            if (isConnected[i][j] == 1) {
                count++
                counting(isConnected, j, i)
            }
        }
    }
    return count
}

fun counting(isConnected: Array<IntArray>, column: Int, row: Int) {
    isConnected[row][column] = 0
    isConnected[column][row] = 0
    for (i in isConnected[row].indices) {
        if (isConnected[row][i] == 1) {
            if (row == i) {
                isConnected[row][i] = 0
            } else {
                counting(isConnected, row, i)
            }
        }
    }
}