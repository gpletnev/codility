package leetcode.challenge.`2021`.`04`.week1

import leetcode.toList
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Test {
    @Test
    fun isPalindromeTest() {
        assertTrue(isPalindrome(intArrayOf(1, 2, 2, 1).toList()))
        assertFalse(isPalindrome(intArrayOf(1, 2).toList()))
    }

    @Test
    fun findMaxFormTest() {
        assertEquals(4, findMaxForm(arrayOf("10", "0001", "111001", "1", "0"), m = 5, n = 3))
        assertEquals(2, findMaxForm(arrayOf("10", "0", "1"), m = 1, n = 1))
    }

    @Test
    fun longestValidParenthesesTest() {
        assertEquals(2, longestValidParentheses("(()"))
        assertEquals(4, longestValidParentheses(")()())"))
        assertEquals(0, longestValidParentheses(""))
    }

    @Test
    fun isIdealPermutationTest() {
        assertTrue(isIdealPermutation(intArrayOf(1, 0, 2)))
        assertFalse(isIdealPermutation(intArrayOf(1, 2, 0)))
    }

    @Test
    fun minOperationsTest() {
        assertEquals(2, minOperations(3))
        assertEquals(9, minOperations(6))
    }

    @Test
    fun halvesAreAlikeTest() {
        assertTrue(halvesAreAlike("book"))
        assertFalse(halvesAreAlike("textbook"))
        assertFalse(halvesAreAlike("MerryChristmas"))
        assertTrue(halvesAreAlike("AbCdEfGh"))
    }
}