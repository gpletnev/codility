package leetcode.medium


// https://leetcode.com/problems/valid-sudoku/
fun isValidSudoku(board: Array<CharArray>): Boolean {
//    val vset = IntArray(9)
//    val hset = IntArray(9)
//    val bckt = IntArray(9)
//    for (i in 0..8) {
//        for (j in 0..8) {
//            if (board[i][j] != '.') {
//                val num = 1 shl board[i][j] - '0'
//                if (hset[i] and num > 0 || vset[j] and num > 0 || bckt[i / 3 * 3 + j / 3] and num > 0) return false
//                hset[i] = hset[i] or num
//                vset[j] = vset[j] or num
//                bckt[i / 3 * 3 + j / 3] = bckt[i / 3 * 3 + j / 3] or num
//            }
//        }
//    }
//    return true
    for (i in 0..8) {
        val rows = HashSet<Char>()
        val columns = HashSet<Char>()
        val cube = HashSet<Char>()
        for (j in 0..8) {
            if (board[i][j] != '.' && !rows.add(board[i][j])) return false
            if (board[j][i] != '.' && !columns.add(board[j][i])) return false
            val row = 3 * (i / 3)
            val col = 3 * (i % 3)
            if (board[row + j / 3][col + j % 3] != '.' && !cube.add(board[row + j / 3][col + j % 3])) return false
        }
    }
    return true
}