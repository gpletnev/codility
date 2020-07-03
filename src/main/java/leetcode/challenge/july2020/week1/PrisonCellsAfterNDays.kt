package leetcode.challenge.july2020.week1

// https://leetcode.com/problems/prison-cells-after-n-days/
object PrisonCellsAfterNDays {
    fun prisonAfterNDays(cells: IntArray, N: Int): IntArray {
        if (N == 0) return cells

        val nextDay = IntArray(cells.size) { 0 }
        for (i in 1 until cells.lastIndex) {
            nextDay[i] = if (cells[i - 1] == cells[i + 1]) 1 else 0
        }
        nextDay.copyInto(cells)
        val firstDay = cells.clone()

        var count = 0
        var hasCycle = false

        while (count + 1 < N) {
            for (i in 1 until cells.lastIndex) {
                nextDay[i] = if (cells[i - 1] == cells[i + 1]) 1 else 0
            }
            nextDay.copyInto(cells)
            count++
            if (nextDay.contentEquals(firstDay)) {
                hasCycle = true
                break
            }
        }
        if (hasCycle) {
            firstDay.copyInto(cells)
            repeat((N - 1) % count) {
                for (i in 1 until cells.lastIndex) {
                    nextDay[i] = if (cells[i - 1] == cells[i + 1]) 1 else 0
                }
                nextDay.copyInto(cells)
            }
        }
        return cells
    }
}