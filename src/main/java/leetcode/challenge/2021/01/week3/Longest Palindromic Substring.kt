package leetcode.challenge.`2021`.`01`.week3

// https://leetcode.com/problems/longest-palindromic-substring/
fun longestPalindrome(s: String): String {
    var start = 0
    var end = 0
    for (i in s.indices) {
        val len1 = expandAroundCenter(s, i - 1, i)
        val len2 = expandAroundCenter(s, i, i)
        val len = maxOf(len1, len2)
        if (len > end + 1 - start) {
            start = i - len / 2
            end = i + (len - 1) / 2
        }
    }
    return s.substring(start, end + 1)
}

private fun expandAroundCenter(s: String, left: Int, right: Int): Int {
    var l = left
    var r = right
    while (l >= 0 && r <= s.lastIndex && s[l] == s[r]) {
        l--
        r++
    }
    return r - l - 1
}