package leetcode.challenge.june2020.week5

// https://leetcode.com/problems/unique-paths/
object UniquePaths {
    fun uniquePaths(m: Int, n: Int): Int {
        val N = m + n - 2
        var result: Long = 1
        for (i in 0 until minOf(m - 1, n - 1))
            result = result * (N - i) / (i + 1)
        return result.toInt()
    }
}