package leetcode.challenge.april2020.week4

// https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/531/week-4/3313/
class FirstUnique(nums: IntArray) {

    private val linkedHashMap = LinkedHashMap<Int, Boolean>()

    init {
        nums.forEach {
            add(it)
        }
    }

    fun showFirstUnique(): Int {
        val first = linkedHashMap.asSequence().firstOrNull { it.value }
        return first?.key ?: -1
    }

    fun add(value: Int) {
        linkedHashMap[value] = !linkedHashMap.contains(value)
    }
}