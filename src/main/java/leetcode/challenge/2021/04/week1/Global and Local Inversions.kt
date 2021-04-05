package leetcode.challenge.`2021`.`04`.week1

// https://leetcode.com/problems/global-and-local-inversions/
fun isIdealPermutation(A: IntArray): Boolean {
    var cmax = 0
    for (i in 0 until A.size - 2) {
        cmax = Math.max(cmax, A[i])
        if (cmax > A[i + 2]) return false
    }
    return true
}