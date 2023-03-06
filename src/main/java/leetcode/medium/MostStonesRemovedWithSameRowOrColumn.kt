package leetcode.medium

// https://leetcode.com/problems/most-stones-removed-with-same-row-or-column/
fun removeStones(stones: Array<IntArray>): Int {
    val visited = mutableSetOf<IntArray>()

    fun dfs(stone: IntArray, stones: Array<IntArray>) {
        if (stone in visited) return

        visited += stone

        stones.filter { (it[0] == stone[0] || it[1] == stone[1]) && (it !in visited) }
            .forEach { sharedStone -> dfs(sharedStone, stones) }
    }

    var count = 0
    for (stone in stones) {
        if (stone !in visited) {
            count++
            dfs(stone, stones)
        }
    }

    return stones.size - count
}
