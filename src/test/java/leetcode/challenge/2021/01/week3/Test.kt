package leetcode.challenge.`2021`.`01`.week3

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun getMaximumGeneratedTest() {
        Assert.assertEquals(3, getMaximumGenerated(7))
        Assert.assertEquals(1, getMaximumGenerated(2))
        Assert.assertEquals(2, getMaximumGenerated(3))
    }

    @Test
    fun findKthLargestTest() {
        Assert.assertEquals(5, findKthLargest(intArrayOf(3, 2, 1, 5, 6, 4), 2))
        Assert.assertEquals(4, findKthLargest(intArrayOf(3, 2, 3, 1, 2, 4, 5, 5, 6), 4))
    }

    @Test
    fun countVowelStringsText() {
        Assert.assertEquals(5, countVowelStrings(1))
        Assert.assertEquals(15, countVowelStrings(2))
        Assert.assertEquals(35, countVowelStrings(3))
        Assert.assertEquals(70, countVowelStrings(4))
    }

    @Test
    fun maxOperationsTest() {
        Assert.assertEquals(3, maxOperations(intArrayOf(1, 1, 1, 2, 2, 2, 4), 3))
        Assert.assertEquals(2, maxOperations(intArrayOf(2, 1, 3, 4), 5))
        Assert.assertEquals(2, maxOperations(intArrayOf(2, 1, 3, 3, 4), 6))
    }

    @Test
    fun longestPalindromeTest() {
        Assert.assertEquals("a", longestPalindrome("a"))
        Assert.assertTrue(longestPalindrome("ac") in listOf("a", "c"))
        Assert.assertEquals("bb", longestPalindrome("cbbd"))
        Assert.assertTrue(longestPalindrome("babad") in listOf("bab", "aba"))
        Assert.assertTrue(longestPalindrome("aababccccd") in listOf("cccc"))
    }
}