package leetcode.challenge.week4

// https://leetcode.com/problems/lru-cache/
class LRUCache(capacity: Int) {
    var map: LinkedHashMap<Int, Int> = object : LinkedHashMap<Int, Int>(capacity, 0.75f, true) {
        override fun removeEldestEntry(eldest: MutableMap.MutableEntry<Int, Int>?): Boolean {
            return size > capacity
        }
    }

    fun get(key: Int): Int {
        return map.getOrDefault(key, -1)
    }

    fun put(key: Int, value: Int) {
        map[key] = value
    }
}