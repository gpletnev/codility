package leetcode.challenge.`2021`.`01`.week2

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun arrayStringsAreEqualTest() {
        Assert.assertTrue(arrayStringsAreEqual(arrayOf("ab", "c"), arrayOf("a", "bc")))
        Assert.assertFalse(arrayStringsAreEqual(arrayOf("a", "cb"), arrayOf("a", "bc")))
        Assert.assertTrue(arrayStringsAreEqual(arrayOf("abc", "d", "defg"), arrayOf("abcddefg")))
    }
}