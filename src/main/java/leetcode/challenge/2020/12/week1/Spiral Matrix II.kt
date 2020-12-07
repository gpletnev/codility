package leetcode.challenge.`2020`.`12`.week1

// https://leetcode.com/problems/spiral-matrix-ii/
fun generateMatrix(n: Int): Array<IntArray> {
    val m = Array(n) { IntArray(n) }
    var top = 0
    var bottom = n - 1
    var left = 0
    var right = n - 1
    var num = 1

    while (left <= right && top <= bottom) {
        for (i in left..right) {
            m[top][i] = num++
        }
        top++
        for (i in top..bottom) {
            m[i][right] = num++
        }
        right--
        for (i in right downTo left) {
            m[bottom][i] = num++
        }
        bottom--
        for (i in bottom downTo top) {
            m[i][left] = num++
        }
        left++
    }
    return m
}