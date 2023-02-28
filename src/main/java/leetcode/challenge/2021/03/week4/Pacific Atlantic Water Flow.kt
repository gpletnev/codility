package leetcode.challenge.`2021`.`03`.week4

// https://leetcode.com/problems/pacific-atlantic-water-flow/

fun pacificAtlantic(heights: Array<IntArray>): List<List<Int>> {
    if(heights.isEmpty()) return emptyList()

    val dirs = arrayOf(intArrayOf(0,1),
        intArrayOf(0,-1),
        intArrayOf(1,0),
        intArrayOf(-1,0))

    fun dfs(grid: Array<IntArray>, height: Int, i: Int, j: Int, visited: Array<BooleanArray>) {
        if(i < 0 || i >= grid.size || j < 0 || j >= grid[0].size || grid[i][j] < height || visited[i][j]) return

        visited[i][j] = true

        dirs.forEach { dir ->
            dfs(grid, grid[i][j], dir[0] + i, dir[1] + j, visited)
        }
    }

    val result = mutableListOf<List<Int>>()

    val pacific = Array(heights.size) { BooleanArray(heights[0].size) }
    val atlantic = Array(heights.size) { BooleanArray(heights[0].size) }

    for(i in heights.indices) {
        dfs(heights, Integer.MIN_VALUE, i, 0, pacific)
        dfs(heights, Integer.MIN_VALUE, i, heights[0].size - 1, atlantic)
    }

    for(i in heights[0].indices) {
        dfs(heights, Integer.MIN_VALUE, 0, i, pacific)
        dfs(heights, Integer.MIN_VALUE, heights.size - 1, i, atlantic)
    }

    for(i in heights.indices) {
        for(j in heights[0].indices) {
            if(atlantic[i][j] && pacific[i][j]) result.add(listOf(i, j))
        }
    }

    return result
}


