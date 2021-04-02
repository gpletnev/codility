package leetcode.challenge.`2021`.`04`.week1

import leetcode.toList
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun isPalindromeTest() {
        Assert.assertTrue(isPalindrome(intArrayOf(1, 2, 2, 1).toList()))
        Assert.assertFalse(isPalindrome(intArrayOf(1, 2).toList()))
    }

    @Test
    fun findMaxFormTest() {
        Assert.assertEquals(4, findMaxForm(arrayOf("10", "0001", "111001", "1", "0"), m = 5, n = 3))
        Assert.assertEquals(2, findMaxForm(arrayOf("10", "0", "1"), m = 1, n = 1))
    }
}