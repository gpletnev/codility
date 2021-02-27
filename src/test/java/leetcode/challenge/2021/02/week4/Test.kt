package leetcode.challenge.`2021`.`02`.week4

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun findLongestWordTest() {
        Assert.assertEquals("apple", findLongestWord("abpcplea", listOf("ale", "apple", "monkey", "plea")))
        Assert.assertEquals("a", findLongestWord("abpcplea", listOf("a", "b", "c")))
    }

    @Test
    fun scoreOfParenthesesTest() {
        Assert.assertEquals(1, scoreOfParentheses("()"))
        Assert.assertEquals(2, scoreOfParentheses("(())"))
        Assert.assertEquals(2, scoreOfParentheses("()()"))
        Assert.assertEquals(6, scoreOfParentheses("(()(()))"))
    }

    @Test
    fun findUnsortedSubarrayTest() {
        Assert.assertEquals(5, findUnsortedSubarray(intArrayOf(2, 6, 4, 8, 10, 9, 15)))
        Assert.assertEquals(0, findUnsortedSubarray(intArrayOf(1, 2, 3, 4)))
        Assert.assertEquals(0, findUnsortedSubarray(intArrayOf(1)))
    }

    @Test
    fun validateStackSequencesTest() {
        Assert.assertTrue(validateStackSequences(intArrayOf(1, 2, 3, 4, 5), intArrayOf(4, 5, 3, 2, 1)))
        Assert.assertFalse(validateStackSequences(intArrayOf(1, 2, 3, 4, 5), intArrayOf(4, 3, 5, 1, 2)))
    }

    @Test
    fun divideTest() {
        Assert.assertEquals(3, divide(10, 3))
        Assert.assertEquals(-2, divide(7, -3))
        Assert.assertEquals(0, divide(0, 1))
        Assert.assertEquals(1, divide(1, 1))
        Assert.assertEquals(2147483647, divide(-2147483648, -1))
    }
}