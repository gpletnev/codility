package leetcode.challenge.`2020`.`10`.week3

// https://leetcode.com/problems/minimum-domino-rotations-for-equal-row/
fun minDominoRotations(A: IntArray, B: IntArray): Int {
    /*    val countA = IntArray(7)
        val countB = IntArray(7)
        val same = IntArray(7)
        val n = A.size
        for (i in 0 until n) {
            countA[A[i]]++
            countB[B[i]]++
            if (A[i] == B[i])
                same[A[i]]++
        }
        for (i in 1..6)
            if (countA[i] + countB[i] - same[i] == n)
                return n - Math.max(countA[i], countB[i])
        return -1*/

    val s = HashSet(listOf(1, 2, 3, 4, 5, 6))
    val countA = IntArray(7)
    val countB = IntArray(7)
    for (i in A.indices) {
        s.retainAll(HashSet(listOf<Any>(A[i], B[i])))
        countA[A[i]]++
        countB[B[i]]++
    }
    for (i in s)
        return A.size - Math.max(countA[i], countB[i])

    return -1
}