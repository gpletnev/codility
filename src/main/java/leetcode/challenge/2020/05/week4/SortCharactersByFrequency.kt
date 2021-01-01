package leetcode.challenge.`2020`.`05`.week4

// https://leetcode.com/problems/sort-characters-by-frequency/
object SortCharactersByFrequency {
    fun frequencySort(s: String): String {
        return s.toCharArray().groupBy { it }.values.sortedByDescending { it.size }.flatten().joinToString("")
    }
}