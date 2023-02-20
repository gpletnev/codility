package leetcode.medium

// https://leetcode.com/problems/longest-palindrome-by-concatenating-two-letter-words/
fun longestPalindrome(words: Array<String>): Int {
    var count = 0
    val map = mutableMapOf<String, Int>()
    words.forEach {
        val reversed = it.reversed()
        if (map.contains(reversed)) {
            val i = map[reversed]!!
            if (i > 1) {
                map[reversed] = i - 1
            } else {
                map.remove(reversed)
            }
            count += 4
        } else {
            map[it] = map.getOrDefault(it, 0) + 1
        }
    }

    if (map.any { it.key == it.key.reversed() }) count += 2
    return count
}