package leetcode.challenge.`2021`.`02`.week3

// https://leetcode.com/problems/arithmetic-slices/
fun numberOfArithmeticSlices(A: IntArray): Int {
    var count = 0
    var sum = 0
    for (i in 2..A.lastIndex) {
        if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
            count++
            sum += count
        } else count = 0
    }
    return sum
}