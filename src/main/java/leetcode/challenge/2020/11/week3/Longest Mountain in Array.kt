package leetcode.challenge.`2020`.`11`.week3

// https://leetcode.com/problems/longest-mountain-in-array/
fun longestMountain(A: IntArray): Int {
    var length = 0
    var up = 0
    var down = 0
    for (i in 1..A.lastIndex) {
        if (down > 0 && A[i - 1] < A[i] || A[i - 1] == A[i]) {
            down = 0
            up = 0
        }
        if (A[i - 1] < A[i]) up++
        if (A[i - 1] > A[i]) down++
        if (up > 0 && down > 0 && up + down + 1 > length) length = up + down + 1
    }
    return length
}