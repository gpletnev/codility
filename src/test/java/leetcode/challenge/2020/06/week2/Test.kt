package leetcode.challenge.`2020`.`06`.week2

import org.junit.jupiter.api.Test
import kotlin.random.Random
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class Test {
    @Test
    fun testPowerOfTwo() {
        assertEquals(true, PowerOfTwo.isPowerOfTwo(1))
        assertEquals(true, PowerOfTwo.isPowerOfTwo(2))
        assertEquals(true, PowerOfTwo.isPowerOfTwo(16))
        assertEquals(false, PowerOfTwo.isPowerOfTwo(218))
        assertEquals(false, PowerOfTwo.isPowerOfTwo(Int.MIN_VALUE))
    }

    @Test
    fun testIsSubsequence() {
        assertEquals(true, IsSubsequence.isSubsequence("abc", "ahbgdc"))
        assertEquals(false, IsSubsequence.isSubsequence("axc", "ahbgdc"))
    }

    @Test
    fun testSearchInsertPosition() {
        assertEquals(2, SearchInsertPosition.searchInsert(intArrayOf(1, 3, 5, 6), 5))
        assertEquals(1, SearchInsertPosition.searchInsert(intArrayOf(1, 3, 5, 6), 2))
        assertEquals(4, SearchInsertPosition.searchInsert(intArrayOf(1, 3, 5, 6), 7))
        assertEquals(0, SearchInsertPosition.searchInsert(intArrayOf(1, 3, 5, 6), 0))
    }

    @Test
    fun testSortColors() {
        var colors = intArrayOf(2, 0, 2, 1, 1, 0)
        SortColors.sortColors(colors)
        assertContentEquals(intArrayOf(0, 0, 1, 1, 2, 2), colors)
        colors = intArrayOf(2, 2, 2, 1, 1, 1)
        SortColors.sortColors(colors)
        assertContentEquals(intArrayOf(1, 1, 1, 2, 2, 2), colors)
        colors = intArrayOf(2, 1, 0)
        SortColors.sortColors(colors)
        assertContentEquals(intArrayOf(0, 1, 2), colors)
    }

    @Test
    fun testInsertDeleteGetRandomO1() {
        // Init an empty set.
        val randomSet = RandomizedSet()

        // Inserts 1 to the set. Returns true as 1 was inserted successfully.
        assertEquals(true, randomSet.insert(1))

        // Returns false as 2 does not exist in the set.
        assertEquals(false, randomSet.remove(2))

        // Inserts 2 to the set, returns true. Set now contains [1,2].
        assertEquals(true, randomSet.insert(2))

        // getRandom should return either 1 or 2 randomly.
        assertTrue(randomSet.getRandom() in 1..2)

        // Removes 1 from the set, returns true. Set now contains [2].
        assertEquals(true, randomSet.remove(1))

        // 2 was already in the set, so return false.
        assertEquals(false, randomSet.insert(2))

        // Since 2 is the only number in the set, getRandom always return 2.
        assertEquals(2, randomSet.getRandom())
    }

    @Test
    fun testInsertDeleteGetRandomO1_2() {
        // Init an empty set.
        val randomSet = RandomizedSet()
        val n = 5000
        val list = ArrayList<Int>(n)
        for (i in 0 until n) {
            list.add(i)
            randomSet.insert(i)
        }
        while (list.isNotEmpty()) {
            val remove = Random.nextBoolean()
            if (remove) {
                val r = Random.nextInt(list.size)
                val value = list[r]
                randomSet.remove(value)
                list.removeAt(r)
            } else {
                randomSet.getRandom()
            }
        }

        assertEquals(false, randomSet.remove(2))
    }

    @Test
    fun testLargestDivisibleSubset() {
        assertContentEquals(intArrayOf(), LargestDivisibleSubset.largestDivisibleSubset(intArrayOf()).toIntArray())
        assertContentEquals(intArrayOf(1), LargestDivisibleSubset.largestDivisibleSubset(intArrayOf(1)).toIntArray())
        assertContentEquals(intArrayOf(1, 2), LargestDivisibleSubset.largestDivisibleSubset(intArrayOf(1, 2, 3)).toIntArray())
    }

    @Test
    fun testCheapestFlightsWithinKStops() {
        assertEquals(200, CheapestFlightsWithinKStops.findCheapestPrice(3, arrayOf(intArrayOf(0, 1, 100), intArrayOf(1, 2, 100), intArrayOf(0, 2, 500)), 0, 2, 1))
        assertEquals(500, CheapestFlightsWithinKStops.findCheapestPrice(3, arrayOf(intArrayOf(0, 1, 100), intArrayOf(1, 2, 100), intArrayOf(0, 2, 500)), 0, 2, 0))
        assertEquals(500, CheapestFlightsWithinKStops.findCheapestPrice(3, arrayOf(intArrayOf(0, 1, 100), intArrayOf(1, 2, 450), intArrayOf(0, 2, 500)), 0, 2, 1))
    }
}
