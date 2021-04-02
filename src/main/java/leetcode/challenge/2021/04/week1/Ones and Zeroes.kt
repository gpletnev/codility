package leetcode.challenge.`2021`.`04`.week1

// https://leetcode.com/problems/ones-and-zeroes/
fun findMaxForm(strs: Array<String>, m: Int, n: Int): Int {
    val max = Array(m + 1) { IntArray(n + 1) }
    for (i in strs.indices) {
        val str = strs[i]
        var neededZero = 0
        var neededOne = 0
        for (j in str.indices) {
            if (str[j] == '0') {
                neededZero++
            } else {
                neededOne++
            }
        }
        for (zero in m downTo 0) {
            for (one in n downTo 0) {
                if (zero >= neededZero && one >= neededOne) {
                    val zeroLeft = zero - neededZero
                    val oneLeft = one - neededOne
                    max[zero][one] = Math.max(1 + max[zeroLeft][oneLeft], max[zero][one])
                } else {
                    max[zero][one] = max[zero][one]
                }
            }
        }
    }
    return max[m][n]
}