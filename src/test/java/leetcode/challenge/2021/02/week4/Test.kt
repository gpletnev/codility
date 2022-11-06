package leetcode.challenge.`2021`.`02`.week4

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Test {
    @Test
    fun findLongestWordTest() {
        assertEquals("apple", findLongestWord("abpcplea", listOf("ale", "apple", "monkey", "plea")))
        assertEquals("a", findLongestWord("abpcplea", listOf("a", "b", "c")))
    }

    @Test
    fun scoreOfParenthesesTest() {
        assertEquals(1, scoreOfParentheses("()"))
        assertEquals(2, scoreOfParentheses("(())"))
        assertEquals(2, scoreOfParentheses("()()"))
        assertEquals(6, scoreOfParentheses("(()(()))"))
    }

    @Test
    fun findUnsortedSubarrayTest() {
        assertEquals(5, findUnsortedSubarray(intArrayOf(2, 6, 4, 8, 10, 9, 15)))
        assertEquals(0, findUnsortedSubarray(intArrayOf(1, 2, 3, 4)))
        assertEquals(0, findUnsortedSubarray(intArrayOf(1)))
    }

    @Test
    fun validateStackSequencesTest() {
        assertTrue(validateStackSequences(intArrayOf(1, 2, 3, 4, 5), intArrayOf(4, 5, 3, 2, 1)))
        assertFalse(validateStackSequences(intArrayOf(1, 2, 3, 4, 5), intArrayOf(4, 3, 5, 1, 2)))
    }

    @Test
    fun divideTest() {
        assertEquals(3, divide(10, 3))
        assertEquals(-2, divide(7, -3))
        assertEquals(0, divide(0, 1))
        assertEquals(1, divide(1, 1))
        assertEquals(2147483647, divide(-2147483648, -1))
    }

    @Test
    fun testFreqStack() {
        val fs = FreqStack()
        with(fs) {
            push(5)
            push(7)
            push(5)
            push(7)
            push(4)
            push(5)
            assertEquals(5, pop())
            assertEquals(7, pop())
            assertEquals(5, pop())
            assertEquals(4, pop())
        }

    }
}