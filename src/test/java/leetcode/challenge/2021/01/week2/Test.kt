package leetcode.challenge.`2021`.`01`.week2

import leetcode.toIntArray
import leetcode.toList
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun arrayStringsAreEqualTest() {
        Assert.assertTrue(arrayStringsAreEqual(arrayOf("ab", "c"), arrayOf("a", "bc")))
        Assert.assertFalse(arrayStringsAreEqual(arrayOf("a", "cb"), arrayOf("a", "bc")))
        Assert.assertTrue(arrayStringsAreEqual(arrayOf("abc", "d", "defg"), arrayOf("abcddefg")))
    }

    @Test
    fun createSortedArrayTest() {
        Assert.assertEquals(1, createSortedArray(intArrayOf(1, 5, 6, 2)))
        Assert.assertEquals(3, createSortedArray(intArrayOf(1, 2, 3, 6, 5, 4)))
        Assert.assertEquals(4, createSortedArray(intArrayOf(1, 3, 3, 3, 2, 4, 2, 1, 2)))
    }

    @Test
    fun mergeTest() {
        var nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
        merge(nums1, _m = 3, nums2 = intArrayOf(2, 5, 6), _n = 3)
        Assert.assertArrayEquals(intArrayOf(1, 2, 2, 3, 5, 6), nums1)

        nums1 = intArrayOf(1)
        merge(nums1, _m = 1, nums2 = intArrayOf(), _n = 0)
        Assert.assertArrayEquals(intArrayOf(1), nums1)
    }

    @Test
    fun addTwoNumbersTest() {
        Assert.assertArrayEquals(
            intArrayOf(0),
            addTwoNumbers(intArrayOf(0).toList(), intArrayOf(0).toList())!!.toIntArray()
        )
        Assert.assertArrayEquals(
            intArrayOf(7, 0, 8),
            addTwoNumbers(intArrayOf(2, 4, 3).toList(), intArrayOf(5, 6, 4).toList())!!.toIntArray()
        )
        Assert.assertArrayEquals(
            intArrayOf(8, 9, 9, 9, 0, 0, 0, 1),
            addTwoNumbers(intArrayOf(9, 9, 9, 9, 9, 9, 9).toList(), intArrayOf(9, 9, 9, 9).toList())!!.toIntArray()
        )
    }
}