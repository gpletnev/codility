package leetcode.easy

// https://leetcode.com/problems/reshape-the-matrix/
fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
    val m = mat.size
    val n = mat[0].size
    if (m * n != r * c) return mat

    val result = Array(r) { IntArray(c) }

//    var row = 0
//    var col = 0
//    for (i in 0 until m) {
//        for (j in 0 until n) {
//            result[row][col] = mat[i][j]
//            col++
//            if (col == c) {
//                col = 0
//                row++
//            }
//        }
//    }

//    val arr = IntArray(m * n)
//    var offset = 0
//    for (i in 0 until m) {
//        mat[i].copyInto(arr, offset)
//        offset += n
//    }
//
//    offset = 0
//
//    for (i in 0 until r) {
//        result[i] = arr.copyOfRange(offset, offset + c)
//        offset += c
//    }

    for (i in 0 until r * c) result[i / c][i % c] = mat[i / n][i % n]
    return result
}