package yacup.algorithm.qualification

import kotlin.math.log2

fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    println(pow2matrix(n, m))
}

fun pow2matrix(n: Int, m: Int): Int {
    val ln = log2(n.toDouble()).toInt()
    val lm = log2(m.toDouble()).toInt()

    val mn = m * n
    return mn + ln + lm
}
