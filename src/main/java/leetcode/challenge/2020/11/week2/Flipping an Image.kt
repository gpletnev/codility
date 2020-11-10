package leetcode.challenge.`2020`.`11`.week2

// https://leetcode.com/problems/flipping-an-image/solution/
fun flipAndInvertImage(A: Array<IntArray>): Array<IntArray> {
    val n: Int = A.size
    val lastIndex = A[0].lastIndex
    for (row in A) {
        var i = 0
        while (i * 2 < n) {
            if (row[i] == row[lastIndex - i]) {
                row[lastIndex - i] = row[lastIndex - i] xor 1
                row[i] = row[lastIndex - i]
            }
            i++
        }
    }
    return A
}