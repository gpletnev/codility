package leetcode.challenge.april2020.week1

object CountingElements {
    fun countElements(arr: IntArray): Int {
        var count = 0
        val arrSet = arr.toHashSet()
        for (i in arr) {
            if (arrSet.contains(i + 1)) {
                count++
            }
        }
        return count
    }
}