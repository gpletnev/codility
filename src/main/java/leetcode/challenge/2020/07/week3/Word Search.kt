package leetcode.challenge.`2020`.`07`.week3

// https://leetcode.com/problems/word-search/
fun exist(board: Array<CharArray>, word: String): Boolean {
    if (word.length > board.size * board[0].size) return false

    for (i in board.indices) {
        for (j in board[0].indices) {
            if (board[i][j] == word[0]) {
                if (exist(board, word, i, j)) return true
            }
        }
    }
    return false
}

private fun exist(board: Array<CharArray>, word: String, i: Int, j: Int): Boolean {
    if (word.isEmpty()) return true
    if (!(i in board.indices && j in board[0].indices)) return false

    if (board[i][j] != word[0]) return false

    val temp = board[i][j]
    board[i][j] = '*'
    val subWord = word.substring(1)
    val exist = exist(board, subWord, i - 1, j) ||
            exist(board, subWord, i + 1, j) ||
            exist(board, subWord, i, j - 1) ||
            exist(board, subWord, i, j + 1)

    board[i][j] = temp
    return exist
}
