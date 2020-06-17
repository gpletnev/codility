package leetcode.challenge.june2020.week3

// https://leetcode.com/problems/surrounded-regions/
object SurroundedRegions {

    var rows = 0
    var cols = 0
    val MARK = '*'

    fun solve(board: Array<CharArray>): Unit {
        rows = board.size
        if (rows < 3) return
        cols = board[0].size
        if (cols < 3) return

        for (i in 0 until rows) {
            if (board[i][0] == 'O') dfs(board, i, 0)
            if (board[i][cols - 1] == 'O') dfs(board, i, cols - 1)
        }
        for (j in 0 until cols) {
            if (board[0][j] == 'O') dfs(board, 0, j)
            if (board[rows - 1][j] == 'O') dfs(board, rows - 1, j)
        }
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                if (board[i][j] == 'O') board[i][j] = 'X'
                if (board[i][j] == MARK) board[i][j] = 'O'
            }
        }
    }

    fun dfs(board: Array<CharArray>, i: Int, j: Int) {
        if (i < 0 || i >= rows || j < 0 || j >= cols || board[i][j] != 'O') return
        board[i][j] = MARK
        dfs(board, i - 1, j)
        dfs(board, i, j - 1)
        dfs(board, i, j + 1)
        dfs(board, i + 1, j)
    }
}