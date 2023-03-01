package leetcode.hard

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
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

    @Test
    fun minWindow() {
        assertEquals("A", minWindow("A", "A"))
        assertEquals("", minWindow("a", "aa"))
        assertEquals("BANC", minWindow("ADOBECODEBANC", "ABC"))
    }

    @Test
    fun numBusesToDestination() {
        assertEquals(2, numBusesToDestination(arrayOf(intArrayOf(1, 2, 7), intArrayOf(3, 6, 7)), 1, 6))
        assertEquals(
            -1,
            numBusesToDestination(
                arrayOf(
                    intArrayOf(7, 12),
                    intArrayOf(4, 5, 15),
                    intArrayOf(15, 19),
                    intArrayOf(9, 12, 13)
                ), 15, 12
            )
        )
    }
}