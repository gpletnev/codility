package leetcode.challenge.`2021`.`01`.week1

import leetcode.toIntArray
import leetcode.toList
import org.junit.jupiter.api.Test
import kotlin.test.*

class Test {
    @Test
    fun canFormArrayTest() {
        assertTrue(canFormArray(intArrayOf(85), arrayOf(intArrayOf(85))))
        assertTrue(canFormArray(intArrayOf(15, 18), arrayOf(intArrayOf(18), intArrayOf(15))))
        assertFalse(canFormArray(intArrayOf(49, 18, 16), arrayOf(intArrayOf(16, 18, 49))))
        assertTrue(
            canFormArray(
                intArrayOf(91, 4, 64, 78),
                arrayOf(intArrayOf(78), intArrayOf(4, 64), intArrayOf(91))
            )
        )
        assertFalse(canFormArray(intArrayOf(1, 3, 5, 7), arrayOf(intArrayOf(2, 4, 6, 8))))
    }

    @Test
    fun countArrangementTest() {
        assertEquals(1, countArrangement(1))
        assertEquals(2, countArrangement(2))
        assertEquals(3, countArrangement(3))
    }

    @Test
    fun mergeTwoListsTest() {
        assertNull(mergeTwoLists(intArrayOf().toList(), intArrayOf().toList()))
        assertContentEquals(
            intArrayOf(0),
            mergeTwoLists(intArrayOf().toList(), intArrayOf(0).toList())!!.toIntArray()
        )
        assertContentEquals(
            intArrayOf(1, 1, 2, 3, 4, 4),
            mergeTwoLists(intArrayOf(1, 3, 4).toList(), intArrayOf(1, 2, 4).toList())!!.toIntArray()
        )
    }

    @Test
    fun deleteDuplicatesTest() {
        assertContentEquals(
            intArrayOf(1, 2, 5),
            deleteDuplicates(intArrayOf(1, 2, 3, 3, 4, 4, 5).toList())!!.toIntArray()
        )
        assertContentEquals(
            intArrayOf(2, 3),
            deleteDuplicates(intArrayOf(1, 1, 1, 2, 3).toList())!!.toIntArray()
        )
    }

    @Test
    fun findKthPositiveTest() {
        assertEquals(9, findKthPositive(intArrayOf(2, 3, 4, 7, 11), 5))
        assertEquals(6, findKthPositive(intArrayOf(1, 2, 3, 4), 2))
    }

    @Test
    fun lengthOfLongestSubstringTest() {
        assertEquals(0, lengthOfLongestSubstring(""))
        assertEquals(3, lengthOfLongestSubstring("pwwkew"))
        assertEquals(3, lengthOfLongestSubstring("abcabcbb"))
        assertEquals(1, lengthOfLongestSubstring("bbbbb"))
    }
}