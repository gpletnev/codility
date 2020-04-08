package leetcode.challenge.week1

// https://leetcode.com/problems/group-anagrams/
object GroupAnagrams {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        return strs.groupBy { it.toCharArray().sorted()}.values.toList()
    }
}