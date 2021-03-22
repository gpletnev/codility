package leetcode.challenge.`2021`.`03`.week3

// https://leetcode.com/problems/reordered-power-of-2/
fun reorderedPowerOf2(N: Int): Boolean {
    val c = counter(N)
    for (i in 0..31) if (counter(1 shl i) == c) return true
    return false
}

fun counter(N: Int): Long {
    var n = N
    var res = 0L
    while (n > 0) {
        res += Math.pow(10.0, (n % 10).toDouble()).toLong()
        n /= 10
    }
    return res
}