package leetcode.challenge.`2021`.`01`.week1

import leetcode.toIntArray
import leetcode.toList
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun canFormArrayTest() {
        Assert.assertTrue(canFormArray(intArrayOf(85), arrayOf(intArrayOf(85))))
        Assert.assertTrue(canFormArray(intArrayOf(15, 18), arrayOf(intArrayOf(18), intArrayOf(15))))
        Assert.assertFalse(canFormArray(intArrayOf(49, 18, 16), arrayOf(intArrayOf(16, 18, 49))))
        Assert.assertTrue(
            canFormArray(
                intArrayOf(91, 4, 64, 78),
                arrayOf(intArrayOf(78), intArrayOf(4, 64), intArrayOf(91))
            )
        )
        Assert.assertFalse(canFormArray(intArrayOf(1, 3, 5, 7), arrayOf(intArrayOf(2, 4, 6, 8))))
    }

    @Test
    fun countArrangementTest() {
        Assert.assertEquals(1, countArrangement(1))
        Assert.assertEquals(2, countArrangement(2))
        Assert.assertEquals(3, countArrangement(3))
    }

    @Test
    fun mergeTwoListsTest() {
        Assert.assertNull(mergeTwoLists(intArrayOf().toList(), intArrayOf().toList()))
        Assert.assertArrayEquals(
            intArrayOf(0),
            mergeTwoLists(intArrayOf().toList(), intArrayOf(0).toList())!!.toIntArray()
        )
        Assert.assertArrayEquals(
            intArrayOf(1, 1, 2, 3, 4, 4),
            mergeTwoLists(intArrayOf(1, 3, 4).toList(), intArrayOf(1, 2, 4).toList())!!.toIntArray()
        )
    }

    @Test
    fun deleteDuplicatesTest() {
        Assert.assertArrayEquals(
            intArrayOf(1, 2, 5),
            deleteDuplicates(intArrayOf(1, 2, 3, 3, 4, 4, 5).toList())!!.toIntArray()
        )
        Assert.assertArrayEquals(
            intArrayOf(2, 3),
            deleteDuplicates(intArrayOf(1, 1, 1, 2, 3).toList())!!.toIntArray()
        )
    }

    @Test
    fun findKthPositiveTest() {
        Assert.assertEquals(9, findKthPositive(intArrayOf(2, 3, 4, 7, 11), 5))
        Assert.assertEquals(6, findKthPositive(intArrayOf(1, 2, 3, 4), 2))
    }

    @Test
    fun lengthOfLongestSubstringTest() {
        Assert.assertEquals(0, lengthOfLongestSubstring(""))
        Assert.assertEquals(3, lengthOfLongestSubstring("pwwkew"))
        Assert.assertEquals(3, lengthOfLongestSubstring("abcabcbb"))
        Assert.assertEquals(1, lengthOfLongestSubstring("bbbbb"))
    }
}