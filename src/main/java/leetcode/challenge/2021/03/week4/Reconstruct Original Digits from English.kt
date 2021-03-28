package leetcode.challenge.`2021`.`03`.week4

// https://leetcode.com/problems/reconstruct-original-digits-from-english/
fun originalDigits(s: String): String {
    if (s.isEmpty()) return ""
    val count = IntArray(128)
    for (element in s) count[element.toInt()]++
    val num = IntArray(10)
    num[0] = count['z'.toInt()]
    num[2] = count['w'.toInt()]
    num[4] = count['u'.toInt()]
    num[6] = count['x'.toInt()]
    num[8] = count['g'.toInt()]
    num[1] = count['o'.toInt()] - count['z'.toInt()] - count['w'.toInt()] - count['u'.toInt()]
    num[3] = count['h'.toInt()] - count['g'.toInt()]
    num[5] = count['v'.toInt()] - count['s'.toInt()] + count['x'.toInt()]
    num[7] = count['s'.toInt()] - count['x'.toInt()]
    num[9] =
        count['i'.toInt()] - count['x'.toInt()] - count['g'.toInt()] - count['v'.toInt()] + count['s'.toInt()] - count['x'.toInt()]
    var ret = String()
    for (i in 0..9) for (j in num[i] downTo 1) ret += i.toString()
    return ret
}