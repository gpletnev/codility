package leetcode.challenge.`2020`.`07`.week3

// https://leetcode.com/articles/top-k-frequent-elements/
fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val sortedMap = nums.groupBy { it }.entries.sortedBy { -it.value.size }.associateBy({ it.key }, { it.value })
    return sortedMap.keys.take(k).toIntArray()
}