package leetcode.challenge.`2021`.`01`.week1

// https://leetcode.com/problems/longest-substring-without-repeating-characters/
fun lengthOfLongestSubstring(s: String): Int {
    val n = s.length
    var length = 0
    val index = IntArray(128)

    var j = 0
    var i = 0
    while (j < n) {
        i = maxOf(index[s[j].code], i)
        length = maxOf(length, j - i + 1)
        index[s[j].code] = j + 1
        j++
    }

    return length
}