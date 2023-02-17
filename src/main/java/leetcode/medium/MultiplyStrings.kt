package leetcode.medium

// https://leetcode.com/problems/multiply-strings/
fun multiply(num1: String, num2: String): String {
    if (num1 == "0" || num2 == "0") return "0"

    val n1 = StringBuilder(num1).reversed().toString()
    val n2 = StringBuilder(num2).reversed().toString()

    val sums = IntArray(n1.length + n2.length)

    for (i in n1.indices) {
        val a = n1[i] - '0'
        for (j in n2.indices) {
            val b = n2[j] - '0'
            sums[i + j] += a * b
        }
    }

    val res = StringBuilder()
    var carry = 0

    for (sum in sums) {
        val num = (sum + carry) % 10
        carry = (sum + carry) / 10
        res.append(num)
    }

    if (res.last() == '0') res.deleteCharAt(res.lastIndex)
    res.reverse()
    return res.toString()
}