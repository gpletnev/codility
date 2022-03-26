package leetcode.easy

// https://leetcode.com/problems/first-unique-character-in-a-string/
fun firstUniqChar(s: String): Int {
    val map = LinkedHashMap<Char, Int>()
    for (i in s.indices) {
        if (map.containsKey(s[i])) map[s[i]] = -1
        else map[s[i]] = i
    }
    for (entry in map) {
        if (entry.value != -1) return entry.value
    }
    return -1
}