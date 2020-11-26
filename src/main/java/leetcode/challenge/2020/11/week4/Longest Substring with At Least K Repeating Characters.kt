package leetcode.challenge.`2020`.`11`.week4

import java.util.*

// https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/
fun longestSubstring(s: String, k: Int): Int {
    val str = s.toCharArray()
    val countMap = IntArray(26)
    val maxUnique = str.toSet().size
    var result = 0
    for (currUnique in 1..maxUnique) {
        // reset countMap
        Arrays.fill(countMap, 0)
        var windowStart = 0
        var windowEnd = 0
        var unique = 0
        var countAtLeastK = 0
        while (windowEnd < str.size) {
            // expand the sliding window
            if (unique <= currUnique) {
                val i = str[windowEnd] - 'a'
                if (countMap[i] == 0) unique++
                countMap[i]++
                if (countMap[i] == k) countAtLeastK++
                windowEnd++
            } else {
                val i = str[windowStart] - 'a'
                if (countMap[i] == k) countAtLeastK--
                countMap[i]--
                if (countMap[i] == 0) unique--
                windowStart++
            }
            if (unique == currUnique && unique == countAtLeastK) result = Math.max(windowEnd - windowStart, result)
        }
    }
    return result
}