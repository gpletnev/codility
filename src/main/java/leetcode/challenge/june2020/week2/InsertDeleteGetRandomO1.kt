package leetcode.challenge.june2020.week2

// https://leetcode.com/problems/insert-delete-getrandom-o1/

import kotlin.random.Random

class RandomizedSet {

    /** Initialize your data structure here. */
    private val keyMap = HashMap<Int, Int>()
    private val valueMap = HashMap<Int, Int>()
    var count = 0

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    fun insert(`val`: Int): Boolean {
        return if (keyMap.containsKey(`val`)) {
            false
        } else {
            keyMap[`val`] = count
            valueMap[count] = `val`
            count = keyMap.size
            true
        }
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    fun remove(`val`: Int): Boolean {
        return if (!keyMap.containsKey(`val`)) {
            false
        } else {
            val valueKey = keyMap[`val`]!!
            keyMap.remove(`val`)
            if (valueKey != valueMap.size - 1) {
                valueMap[valueKey] = valueMap[valueMap.size - 1]!!
                keyMap[valueMap[valueMap.size - 1]!!] = valueKey
                valueMap.remove(valueMap.size - 1)
            } else {
                valueMap.remove(valueKey)
            }
            count = keyMap.size
            true
        }
    }

    /** Get a random element from the set. */
    fun getRandom(): Int {
        return valueMap[Random.nextInt(valueMap.size)]!!
    }
}