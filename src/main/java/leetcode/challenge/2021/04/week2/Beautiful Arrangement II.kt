package leetcode.challenge.`2021`.`04`.week2

// https://leetcode.com/problems/beautiful-arrangement-ii/
fun constructArray(n: Int, k: Int): IntArray {
    val ans = IntArray(n)
    var c = 0
    for (v in 1 until n - k) {
        ans[c++] = v
    }
    for (i in 0..k) {
        ans[c++] = if (i % 2 == 0) n - k + i / 2 else n - i / 2
    }
    return ans
}