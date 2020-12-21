package leetcode.challenge.`2020`.`12`.week3

// https://leetcode.com/problems/smallest-range-ii/
fun smallestRangeII(A: IntArray, K: Int): Int {
    A.sort()
    var sr = A.last() - A.first()

    val lastMinusK = A.last() - K
    val firstPlusK = A.first() + K
    for (i in 0 until A.lastIndex) {
        val a = A[i]
        val b = A[i + 1]
        val high = maxOf(lastMinusK, a + K)
        val low = minOf(firstPlusK, b - K)
        sr = minOf(sr, high - low)
    }
    return sr
}