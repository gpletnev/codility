package leetcode.challenge.`2020`.`12`.week5

// https://leetcode.com/problems/game-of-life/solution/
fun gameOfLife(board: Array<IntArray>) {

    // Neighbors array to find 8 neighboring cells for a given cell
    val neighbors = intArrayOf(0, 1, -1)

    val rows: Int = board.size
    val cols: Int = board[0].size

    // Create a copy of the original board
    val copyBoard = Array(rows) { IntArray(cols) }

    // Create a copy of the original board
    for (row in 0 until rows) {
        for (col in 0 until cols) {
            copyBoard[row][col] = board[row][col]
        }
    }

    // Iterate through board cell by cell.
    for (row in 0 until rows) {
        for (col in 0 until cols) {

            // For each cell count the number of live neighbors.
            var liveNeighbors = 0
            for (i in 0..2) {
                for (j in 0..2) {
                    if (!(neighbors[i] == 0 && neighbors[j] == 0)) {
                        val r = row + neighbors[i]
                        val c = col + neighbors[j]

                        // Check the validity of the neighboring cell.
                        // and whether it was originally a live cell.
                        // The evaluation is done against the copy, since that is never updated.
                        if (r < rows && r >= 0 && c < cols && c >= 0 && copyBoard[r][c] == 1) {
                            liveNeighbors += 1
                        }
                    }
                }
            }

            // Rule 1 or Rule 3
            if (copyBoard[row][col] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
                board[row][col] = 0
            }
            // Rule 4
            if (copyBoard[row][col] == 0 && liveNeighbors == 3) {
                board[row][col] = 1
            }
        }
    }
}