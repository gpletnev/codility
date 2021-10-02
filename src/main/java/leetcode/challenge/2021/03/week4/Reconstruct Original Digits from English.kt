package leetcode.challenge.`2021`.`03`.week4

// https://leetcode.com/problems/reconstruct-original-digits-from-english/
fun originalDigits(s: String): String {
    if (s.isEmpty()) return ""
    val count = IntArray(128)
    for (element in s) count[element.code]++
    val num = IntArray(10)
    num[0] = count['z'.code]
    num[2] = count['w'.code]
    num[4] = count['u'.code]
    num[6] = count['x'.code]
    num[8] = count['g'.code]
    num[1] = count['o'.code] - count['z'.code] - count['w'.code] - count['u'.code]
    num[3] = count['h'.code] - count['g'.code]
    num[5] = count['v'.code] - count['s'.code] + count['x'.code]
    num[7] = count['s'.code] - count['x'.code]
    num[9] =
        count['i'.code] - count['x'.code] - count['g'.code] - count['v'.code] + count['s'.code] - count['x'.code]
    var ret = String()
    for (i in 0..9) for (j in num[i] downTo 1) ret += i.toString()
    return ret
}