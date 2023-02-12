package leetcode.challenge.`2020`.`06`.week5

// https://leetcode.com/problems/unique-paths/
object UniquePaths {
    // (m - 1 + n - 1)!/(m - 1)!/(n - 1)!
    fun uniquePaths(m: Int, n: Int): Int {
        val steps = m - 1 + n - 1
        var paths: Long = 1
        for (i in 0 until minOf(m - 1, n - 1))
            paths = paths * (steps - i) / (i + 1)
        return paths.toInt()
    }
}