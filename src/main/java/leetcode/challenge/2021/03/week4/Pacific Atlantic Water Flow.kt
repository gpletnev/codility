package leetcode.challenge.`2021`.`03`.week4

import java.util.*

// https://leetcode.com/problems/pacific-atlantic-water-flow/
private val DIRECTIONS = arrayOf(intArrayOf(0, 1), intArrayOf(1, 0), intArrayOf(-1, 0), intArrayOf(0, -1))
private var numRows: Int = 0
private var numCols = 0
private var landHeights: Array<IntArray> = arrayOf(intArrayOf())

fun pacificAtlantic(matrix: Array<IntArray>): List<List<Int>> {
    // Check if input is empty
    if (matrix.isEmpty() || matrix[0].isEmpty()) {
        return ArrayList<List<Int>>()
    }

    // Save initial values to parameters
    numRows = matrix.size
    numCols = matrix[0].size
    landHeights = matrix

    // Setup each queue with cells adjacent to their respective ocean
    val pacificQueue: Queue<IntArray> = LinkedList()
    val atlanticQueue: Queue<IntArray> = LinkedList()
    for (i in 0 until numRows) {
        pacificQueue.offer(intArrayOf(i, 0))
        atlanticQueue.offer(intArrayOf(i, numCols - 1))
    }
    for (i in 0 until numCols) {
        pacificQueue.offer(intArrayOf(0, i))
        atlanticQueue.offer(intArrayOf(numRows - 1, i))
    }

    // Perform a BFS for each ocean to find all cells accessible by each ocean
    val pacificReachable = bfs(pacificQueue)
    val atlanticReachable = bfs(atlanticQueue)

    // Find all cells that can reach both oceans
    val commonCells: MutableList<List<Int>> = ArrayList()
    for (i in 0 until numRows) {
        for (j in 0 until numCols) {
            if (pacificReachable[i][j] && atlanticReachable[i][j]) {
                commonCells.add(listOf(i, j))
            }
        }
    }
    return commonCells
}

private fun bfs(queue: Queue<IntArray>): Array<BooleanArray> {
    val reachable = Array(numRows) {
        BooleanArray(
            numCols
        )
    }
    while (!queue.isEmpty()) {
        val cell = queue.poll()
        // This cell is reachable, so mark it
        reachable[cell[0]][cell[1]] = true
        for (dir in DIRECTIONS) { // Check all 4 directions
            val newRow = cell[0] + dir[0]
            val newCol = cell[1] + dir[1]
            // Check if new cell is within bounds
            if (newRow < 0 || newRow >= numRows || newCol < 0 || newCol >= numCols) {
                continue
            }
            // Check that the new cell hasn't already been visited
            if (reachable[newRow][newCol]) {
                continue
            }
            // Check that the new cell has a higher or equal height,
            // So that water can flow from the new cell to the old cell
            if (landHeights[newRow][newCol] < landHeights[cell[0]][cell[1]]) {
                continue
            }
            // If we've gotten this far, that means the new cell is reachable
            queue.offer(intArrayOf(newRow, newCol))
        }
    }
    return reachable
}