package leetcode.challenge.june2020.week3

// https://leetcode.com/problems/h-index-ii/
object H_IndexII {
    fun hIndex(citations: IntArray): Int {
        val n = citations.size
        var low = 0
        var high = citations.lastIndex

        while (low <= high) {
            val mid = low + (high - low) / 2
            if (citations[mid] < n - mid)
                low = mid + 1
            else
                high = mid - 1
        }
        return n - low
    }
}