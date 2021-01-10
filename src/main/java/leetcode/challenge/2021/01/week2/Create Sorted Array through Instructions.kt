package leetcode.challenge.`2021`.`01`.week2

// https://leetcode.com/problems/create-sorted-array-through-instructions/
fun createSortedArray(A: IntArray): Int {
    var res = 0
    val n = A.size
    val mod = 1e9.toInt() + 7
    val c = IntArray(100001)
    for (i in 0 until n) {
        res = (res + minOf(get(c, A[i] - 1), i - get(c, A[i]))) % mod
        update(c, A[i])
    }
    return res
}

fun update(c: IntArray, _x: Int) {
    var x = _x
    while (x < 100001) {
        c[x]++
        x += x and -x
    }
}

fun get(c: IntArray, _x: Int): Int {
    var x = _x
    var res = 0
    while (x > 0) {
        res += c[x]
        x -= x and -x
    }
    return res
}