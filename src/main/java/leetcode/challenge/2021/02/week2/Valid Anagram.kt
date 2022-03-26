package leetcode.challenge.`2021`.`02`.week2

// https://leetcode.com/problems/valid-anagram/
fun isAnagram(s: String, t: String): Boolean {

    val sMap = s.groupingBy { it }.eachCount()
    val tMap = t.groupingBy { it }.eachCount()

    return sMap == tMap
//    if (s.length != t.length) return false
//
//    val sMap = mutableMapOf<Char, Int>()
//    s.forEach {
//        sMap[it] = sMap.getOrDefault(it, 0) + 1
//    }
//    val tMap = mutableMapOf<Char, Int>()
//    t.forEach {
//        tMap[it] = tMap.getOrDefault(it, 0) + 1
//    }
//
//    if (sMap.keys.sorted() != tMap.keys.sorted()) return false
//
//    for (entry in sMap) {
//        if (entry.value != tMap[entry.key])
//            return false
//    }
//
//    return true
}