package leetcode.easy

// https://leetcode.com/problems/ransom-note/
fun canConstruct(ransomNote: String, magazine: String): Boolean {
    if (ransomNote.length > magazine.length) return false
    val magazineMap = magazine.groupingBy { it }.eachCount().toMutableMap()

    for (c in ransomNote) {
        if (magazineMap.getOrDefault(c, 0) - 1 < 0) return false
        else magazineMap[c] = magazineMap[c]!!.minus(1)
    }

    return true
}