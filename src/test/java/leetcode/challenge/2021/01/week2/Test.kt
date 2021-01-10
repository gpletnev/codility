package leetcode.challenge.`2021`.`01`.week2

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
}