package leetcode.challenge.`2020`.`08`

import java.util.*

// https://leetcode.com/problems/design-hashset/
internal class MyHashSet {

    /** Initialize your data structure here.  */
    var capacity = 1000
    var container: Array<LinkedList<Int>?> = arrayOfNulls<LinkedList<Int>?>(capacity)
    var count = 0
    var loadFactor = 0.75

    fun add(key: Int) {
        if (contains(key)) return
        if (loadFactor * capacity == count.toDouble()) {
            count = 0
            //rehash
            capacity *= 2
            val oldC = container
            container = arrayOfNulls<LinkedList<Int>?>(capacity)
            for (i in oldC.indices) {
                val list: List<Int>? = oldC[i]
                if (list != null) {
                    for (entry in list) add(entry)
                }
            }
        }
        val hash = key % capacity
        if (container[hash] == null) container[hash] = LinkedList()
        container[hash]!!.add(key)
        ++count
    }

    fun remove(key: Int) {
        val hash = key % capacity
        val list = container[hash]
        if (list != null) {
            val itr = list.iterator()
            while (itr.hasNext()) {
                if (itr.next() == key) {
                    itr.remove()
                    --count
                }
            }
        }
    }

    /** Returns true if this set contains the specified element  */
    operator fun contains(key: Int): Boolean {
        val hash = key % capacity
        val list: List<Int>? = container[hash]
        if (list != null) {
            val itr = list.iterator()
            while (itr.hasNext()) if (itr.next() == key) return true
        }
        return false
    }
}