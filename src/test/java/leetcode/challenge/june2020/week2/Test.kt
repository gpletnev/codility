package leetcode.challenge.june2020.week2

import org.junit.Assert
import org.junit.Test
import kotlin.random.Random

class Test {
    @Test
    fun testPowerOfTwo() {
        Assert.assertEquals(true, PowerOfTwo.isPowerOfTwo(1))
        Assert.assertEquals(true, PowerOfTwo.isPowerOfTwo(2))
        Assert.assertEquals(true, PowerOfTwo.isPowerOfTwo(16))
        Assert.assertEquals(false, PowerOfTwo.isPowerOfTwo(218))
        Assert.assertEquals(false, PowerOfTwo.isPowerOfTwo(Int.MIN_VALUE))
    }

    @Test
    fun testIsSubsequence() {
        Assert.assertEquals(true, IsSubsequence.isSubsequence("abc", "ahbgdc"))
        Assert.assertEquals(false, IsSubsequence.isSubsequence("axc", "ahbgdc"))
    }

    @Test
    fun testSearchInsertPosition() {
        Assert.assertEquals(2, SearchInsertPosition.searchInsert(intArrayOf(1, 3, 5, 6), 5))
        Assert.assertEquals(1, SearchInsertPosition.searchInsert(intArrayOf(1, 3, 5, 6), 2))
        Assert.assertEquals(4, SearchInsertPosition.searchInsert(intArrayOf(1, 3, 5, 6), 7))
        Assert.assertEquals(0, SearchInsertPosition.searchInsert(intArrayOf(1, 3, 5, 6), 0))
    }

    @Test
    fun testSortColors() {
        var colors = intArrayOf(2, 0, 2, 1, 1, 0)
        SortColors.sortColors(colors)
        Assert.assertArrayEquals(intArrayOf(0, 0, 1, 1, 2, 2), colors)
        colors = intArrayOf(2, 2, 2, 1, 1, 1)
        SortColors.sortColors(colors)
        Assert.assertArrayEquals(intArrayOf(1, 1, 1, 2, 2, 2), colors)
        colors = intArrayOf(2, 1, 0)
        SortColors.sortColors(colors)
        Assert.assertArrayEquals(intArrayOf(0, 1, 2), colors)
    }

    @Test
    fun testInsertDeleteGetRandomO1() {
        // Init an empty set.
        val randomSet = RandomizedSet()

        // Inserts 1 to the set. Returns true as 1 was inserted successfully.
        Assert.assertEquals(true, randomSet.insert(1))

        // Returns false as 2 does not exist in the set.
        Assert.assertEquals(false, randomSet.remove(2))

        // Inserts 2 to the set, returns true. Set now contains [1,2].
        Assert.assertEquals(true, randomSet.insert(2))

        // getRandom should return either 1 or 2 randomly.
        Assert.assertTrue(randomSet.getRandom() in 1..2)

        // Removes 1 from the set, returns true. Set now contains [2].
        Assert.assertEquals(true, randomSet.remove(1))

        // 2 was already in the set, so return false.
        Assert.assertEquals(false, randomSet.insert(2))

        // Since 2 is the only number in the set, getRandom always return 2.
        Assert.assertEquals(2, randomSet.getRandom())
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

        Assert.assertEquals(false, randomSet.remove(2))
    }
}
