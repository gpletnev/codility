package codility.lessons.lesson3

// https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
object PermMissingElem {
    @JvmStatic
    fun solution(A: IntArray): Int {
        val n = (A.size + 1).toLong()
        val arithmeticSequenceSum = n * (n + 1) / 2
        val sum = A.sum()
        return (arithmeticSequenceSum - sum).toInt()
    }
}