package codility.interviews

// Find the smallest positive integer that does not occur in a given sequence.
class SmallestPositiveIntegerInArray {
    companion object {
        @JvmStatic
        fun solution(A: IntArray): Int {
            val set = A.filter { it > 0 && it <= A.size }.toSortedSet()
            var result = 1
            for (s in set) {
                if (result != s) return result
                else result++
            }
            return if (set.isEmpty()) 1 else set.last() + 1
        }
    }
}