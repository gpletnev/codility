package leetcode.challenge.`2021`.`01`.week4

// https://leetcode.com/problems/concatenation-of-consecutive-binary-numbers/
fun concatenatedBinary(n: Int): Int {
    var result: Long = 1
    var powerOf2 = 2
    var binaryShift = 1

    for (i in 2..n) {

        if (i >= powerOf2) {
            powerOf2 *= 2
            binaryShift += 1
        }
        result = (result.shl(binaryShift) + i) % 1000000007
    }
    return result.toInt()
}