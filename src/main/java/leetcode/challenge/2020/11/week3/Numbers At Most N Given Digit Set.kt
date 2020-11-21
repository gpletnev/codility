package leetcode.challenge.`2020`.`11`.week3

// https://leetcode.com/problems/numbers-at-most-n-given-digit-set/
fun atMostNGivenDigitSet(digits: Array<String>, n: Int): Int {
    val chars = java.lang.String.valueOf(n).toCharArray()
    val len = chars.size
    var res = 1
    var pres: Int
    var smaller = -1

    var i = 1
    var m = 1
    while (i <= chars.size) {
        pres = res
        res = 0
        val x = chars[len - i] - '0'
        for (d in digits) {
            val value = Integer.valueOf(d)
            if (value < x) res += m else if (value == x) res += pres
        }
        smaller += m
        i++
        m *= digits.size
    }

    return res + smaller
}