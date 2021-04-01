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
}