package leetcode.hard

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Test {
    @Test
    fun isMatchTest() {
        assertTrue(isMatch("", ""))
        assertFalse(isMatch("aa", "a"))
        assertTrue(isMatch("aa", "a*"))
        assertTrue(isMatch("ab", ".*"))
    }
}