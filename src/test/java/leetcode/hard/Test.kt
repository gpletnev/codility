package leetcode.hard

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun isMatchTest() {
        Assert.assertTrue(isMatch("", ""))
        Assert.assertFalse(isMatch("aa", "a"))
        Assert.assertTrue(isMatch("aa", "a*"))
        Assert.assertTrue(isMatch("ab", ".*"))
    }
}