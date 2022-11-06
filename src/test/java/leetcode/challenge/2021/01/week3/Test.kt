package leetcode.challenge.`2021`.`01`.week3

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Test {
    @Test
    fun getMaximumGeneratedTest() {
        assertEquals(3, getMaximumGenerated(7))
        assertEquals(1, getMaximumGenerated(2))
        assertEquals(2, getMaximumGenerated(3))
    }

    @Test
    fun findKthLargestTest() {
        assertEquals(5, findKthLargest(intArrayOf(3, 2, 1, 5, 6, 4), 2))
        assertEquals(4, findKthLargest(intArrayOf(3, 2, 3, 1, 2, 4, 5, 5, 6), 4))
    }

    @Test
    fun countVowelStringsText() {
        assertEquals(5, countVowelStrings(1))
        assertEquals(15, countVowelStrings(2))
        assertEquals(35, countVowelStrings(3))
        assertEquals(70, countVowelStrings(4))
    }

    @Test
    fun maxOperationsTest() {
        assertEquals(3, maxOperations(intArrayOf(1, 1, 1, 2, 2, 2, 4), 3))
        assertEquals(2, maxOperations(intArrayOf(2, 1, 3, 4), 5))
        assertEquals(2, maxOperations(intArrayOf(2, 1, 3, 3, 4), 6))
    }

    @Test
    fun longestPalindromeTest() {
        assertEquals("a", longestPalindrome("a"))
        assertTrue(longestPalindrome("ac") in listOf("a", "c"))
        assertEquals("bb", longestPalindrome("cbbd"))
        assertTrue(longestPalindrome("babad") in listOf("bab", "aba"))
        assertTrue(longestPalindrome("aababccccd") in listOf("cccc"))
    }

    @Test
    fun isValidTest() {
        assertTrue(isValid("()"))
        assertTrue(isValid("()[]{}"))
        assertFalse(isValid("(]"))
        assertFalse(isValid("([)]"))
        assertTrue(isValid("{[]}"))
    }

    @Test
    fun mostCompetitiveTest() {
        assertContentEquals(intArrayOf(2, 2), mostCompetitive(intArrayOf(2, 2), 2))
        assertContentEquals(intArrayOf(2, 6), mostCompetitive(intArrayOf(3, 5, 2, 6), 2))
        assertContentEquals(intArrayOf(2, 3, 3, 4), mostCompetitive(intArrayOf(2, 4, 3, 3, 5, 4, 9, 6), 4))
    }
}