package leetcode.challenge.`2021`.`01`.week1

// https://leetcode.com/problems/longest-substring-without-repeating-characters/
fun lengthOfLongestSubstring(s: String): Int {
    var length = 0
    val chars = IntArray(128) { -1 }

    var left = 0
    var right = 0
    while (right < s.length) {
        val c = s[right]
        val i = chars[c.code]

        if (i in left until right) {
            left = i + 1
        }
        length = maxOf(length, right - left + 1)
        chars[c.code] = right++
    }

    return length
}