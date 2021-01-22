package leetcode.challenge.`2021`.`01`.week4

// https://leetcode.com/problems/determine-if-two-strings-are-close/
fun closeStrings(word1: String, word2: String): Boolean {
    if (word1.length != word2.length) return false

    val map1 = word1.groupBy { it }
    val map2 = word2.groupBy { it }

    return map1.keys == map2.keys
            && map1.values.map { it.size }.sorted() == map2.values.map { it.size }.sorted()
}