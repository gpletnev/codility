package leetcode.challenge.`2021`.`03`.week1

class MyHashMap() {

    /** Initialize your data structure here. */
    val map = IntArray(1000000) { -1 }


    /** value will always be non-negative. */
    fun put(key: Int, value: Int) {
        map[key] = value
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    fun get(key: Int): Int {
        return map[key]
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    fun remove(key: Int) {
        map[key] = -1
    }

}