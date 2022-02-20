package leetcode.challenge.`2021`.`01`.week1

// https://leetcode.com/problems/longest-substring-without-repeating-characters/
fun lengthOfLongestSubstring(s: String): Int {
    var length = 0
    val index = IntArray(128)

    var l = 0
    var r = 0
    while (r < s.length) {
        val c = s[r].code
        l = maxOf(l, index[c])
        length = maxOf(length, r - l + 1)
        index[c] = ++r
    }

    return length
}