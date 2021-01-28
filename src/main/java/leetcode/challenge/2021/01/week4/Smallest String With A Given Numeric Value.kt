package leetcode.challenge.`2021`.`01`.week4

// https://leetcode.com/problems/smallest-string-with-a-given-numeric-value/
fun getSmallestString(n: Int, k: Int): String {
    val c = CharArray(n)
    var sum = 0
    for (i in n - 1 downTo 0) {
        val x = minOf(25, k - n - sum)
        c[i] = (x + 'a'.toInt()).toChar()
        sum += x
    }
    return String(c)
}