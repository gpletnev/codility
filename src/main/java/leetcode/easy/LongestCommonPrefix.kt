package leetcode.easy

// https://leetcode.com/problems/longest-common-prefix/
fun longestCommonPrefix(strs: Array<String>): String {
    val minStr = strs.minBy { it.length }

    var i = 0
    loop@ while (i <= minStr.lastIndex) {
        val c = minStr[i]
        for (str in strs) {
            if (str[i] != c) {
                break@loop
            }
        }
        i++
    }
    return minStr.substring(0, i)
    /*    var i = 0
        val sorted = strs.sorted()
        while (i <  sorted.first().length) {
            if (sorted.first()[i] == sorted.last()[i]) {
                i++
            } else {
                break
            }
        }
        return if (i == 0) "" else sorted.first().substring(0, i)*/
}