package leetcode.medium

// https://leetcode.com/problems/find-all-anagrams-in-a-string/
fun findAnagrams(s: String, p: String): List<Int> {
    if (s.length < p.length) return listOf()

    val result = mutableListOf<Int>()

    val chars = IntArray(26)
    for (c in p) {
        chars[c - 'a']++
    }

    var start = 0
    var end = 0
    val len = p.length
    var diff = len

    while (end < len) {
        val c = s[end]
        chars[c - 'a']--
        if (chars[c - 'a'] >= 0) diff--
        end++
    }

    if (diff == 0) result.add(0)

    while (end < s.length) {
        var c = s[start]

        if (chars[c - 'a'] >= 0) diff++
        chars[c - 'a']++
        start++

        c = s[end]
        chars[c - 'a']--
        if (chars[c - 'a'] >= 0) diff--

        if (diff == 0) result.add(start)

        end++
    }

    return result
}