package leetcode.challenge.`2021`.`01`.week2

import leetcode.toIntArray
import leetcode.toList
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Test {
    @Test
    fun arrayStringsAreEqualTest() {
        assertTrue(arrayStringsAreEqual(arrayOf("ab", "c"), arrayOf("a", "bc")))
        assertFalse(arrayStringsAreEqual(arrayOf("a", "cb"), arrayOf("a", "bc")))
        assertTrue(arrayStringsAreEqual(arrayOf("abc", "d", "defg"), arrayOf("abcddefg")))
    }

    @Test
    fun createSortedArrayTest() {
        assertEquals(1, createSortedArray(intArrayOf(1, 5, 6, 2)))
        assertEquals(3, createSortedArray(intArrayOf(1, 2, 3, 6, 5, 4)))
        assertEquals(4, createSortedArray(intArrayOf(1, 3, 3, 3, 2, 4, 2, 1, 2)))
    }

    @Test
    fun mergeTest() {
        var nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
        merge(nums1, _m = 3, nums2 = intArrayOf(2, 5, 6), _n = 3)
        assertContentEquals(intArrayOf(1, 2, 2, 3, 5, 6), nums1)

        nums1 = intArrayOf(1)
        merge(nums1, _m = 1, nums2 = intArrayOf(), _n = 0)
        assertContentEquals(intArrayOf(1), nums1)
    }

    @Test
    fun addTwoNumbersTest() {
        assertContentEquals(
            intArrayOf(0),
            addTwoNumbers(intArrayOf(0).toList(), intArrayOf(0).toList())!!.toIntArray()
        )
        assertContentEquals(
            intArrayOf(7, 0, 8),
            addTwoNumbers(intArrayOf(2, 4, 3).toList(), intArrayOf(5, 6, 4).toList())!!.toIntArray()
        )
        assertContentEquals(
            intArrayOf(8, 9, 9, 9, 0, 0, 0, 1),
            addTwoNumbers(intArrayOf(9, 9, 9, 9, 9, 9, 9).toList(), intArrayOf(9, 9, 9, 9).toList())!!.toIntArray()
        )
    }

    @Test
    fun numRescueBoatsTest() {
        assertEquals(1, numRescueBoats(intArrayOf(1, 2), 3))
        assertEquals(3, numRescueBoats(intArrayOf(3, 2, 1, 2), 3))
        assertEquals(4, numRescueBoats(intArrayOf(3, 5, 3, 4), 5))
    }

    @Test
    fun minOperationsTest() {
        assertEquals(2, minOperations(intArrayOf(1, 1, 4, 2, 3), 5))
        assertEquals(-1, minOperations(intArrayOf(5, 6, 7, 8, 9), 4))
        assertEquals(5, minOperations(intArrayOf(3, 2, 20, 1, 1, 3), 10))
    }
}