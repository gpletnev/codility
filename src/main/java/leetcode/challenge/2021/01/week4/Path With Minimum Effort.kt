package leetcode.challenge.`2021`.`01`.week4

// https://leetcode.com/problems/path-with-minimum-effort/
fun minimumEffortPath(heights: Array<IntArray>): Int {
    val rows = heights.size
    val cols = heights[0].size
    val dir = arrayOf(intArrayOf(0, 1), intArrayOf(1, 0), intArrayOf(0, -1), intArrayOf(-1, 0))

    //Fill with infinity to relax the nodes later
    val dp = Array(rows) { IntArray(cols) { Int.MAX_VALUE } }

    dp[0][0] = 0

    //This flag is used to check if the answer was found early. This happens when the shortest path is found in few iterations
    //and all shortest paths to nodes don't relax anymore. Without this flag you will get TLE
    var relaxAtLeastOneEdge = true

    //Relax each edge (total nodes - 1) times
    var e = 0
    while (e < rows * cols - 1 && relaxAtLeastOneEdge) {
        relaxAtLeastOneEdge = false

        //Loop through all graph edges
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                //Move in 4 directions as given in problem
                for (k in 0..3) {
                    val newI = i + dir[k][0]
                    val newJ = j + dir[k][1]
                    if (newI !in 0 until rows || newJ !in 0 until cols || dp[i][j] >= dp[newI][newJ]) continue
                    val absDiff = kotlin.math.abs(heights[newI][newJ] - heights[i][j])

                    //Relax a node
                    if (dp[newI][newJ] > maxOf(dp[i][j], absDiff)) {
                        dp[newI][newJ] = maxOf(dp[i][j], absDiff)
                        relaxAtLeastOneEdge = true
                    }
                }
            }
        }
        e++
    }

    return dp[rows - 1][cols - 1]
}