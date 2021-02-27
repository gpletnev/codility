package leetcode.challenge.`2021`.`02`.week4

// https://leetcode.com/problems/divide-two-integers/
fun divide(dividend: Int, divisor: Int): Int {
    if (dividend == 1 shl 31 && divisor == -1) return (1 shl 31) - 1
    var a: Int = Math.abs(dividend)
    val b: Int = Math.abs(divisor)
    var res = 0
    for (x in 31 downTo 0)
        if ((a ushr x) - b >= 0) {
            res += 1 shl x
            a -= b shl x
        }
    return if (dividend > 0 == divisor > 0) res else -res
}