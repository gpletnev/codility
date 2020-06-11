package leetcode.challenge.june2020.week2

import org.junit.Assert
import org.junit.Test

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
}