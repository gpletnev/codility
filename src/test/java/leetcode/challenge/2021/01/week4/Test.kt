package leetcode.challenge.`2021`.`01`.week4

import leetcode.toList
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNull
import kotlin.test.assertTrue

class Test {
    @Test
    fun mostCompetitiveTest() {
        assertFalse(closeStrings("abbzzca", "babzzcz"))
        assertTrue(closeStrings("abc", "bca"))
        assertFalse(closeStrings("a", "aa"))
        assertTrue(closeStrings(word1 = "cabbba", word2 = "abbccc"))
        assertFalse(closeStrings(word1 = "cabbba", word2 = "aabbss"))
    }

    @Test
    fun diagonalSortTest() {
        assertEquals(
            arrayOf(
                intArrayOf(1, 1, 1, 1),
                intArrayOf(1, 2, 2, 2),
                intArrayOf(1, 2, 3, 3)
            ).joinToString { it.joinToString() },
            diagonalSort(
                arrayOf(
                    intArrayOf(3, 3, 1, 1),
                    intArrayOf(2, 2, 1, 2),
                    intArrayOf(1, 1, 1, 2)
                )
            ).joinToString { it.joinToString() }
        )
    }

    @Test
    fun mergeKListsTest() {
        assertNull(mergeKLists(arrayOf(intArrayOf().toList())))
        assertNull(mergeKLists(arrayOf(intArrayOf().toList())))

    }

    @Test
    fun kLengthApartTest() {
        assertTrue(kLengthApart(intArrayOf(1, 0, 0, 0, 1, 0, 0, 1), 2))
        assertFalse(kLengthApart(intArrayOf(1, 0, 0, 1, 0, 1), 2))
        assertTrue(kLengthApart(intArrayOf(1, 1, 1, 1, 1), 0))
        assertTrue(kLengthApart(intArrayOf(0, 1, 0, 1), 1))
    }

    @Test
    fun minimumEffortPathTest() {
        assertEquals(
            2,
            minimumEffortPath(
                arrayOf(
                    intArrayOf(1, 2, 2),
                    intArrayOf(3, 8, 2),
                    intArrayOf(5, 3, 5)
                )
            )
        )
        assertEquals(
            1,
            minimumEffortPath(
                arrayOf(
                    intArrayOf(1, 2, 3),
                    intArrayOf(3, 8, 4),
                    intArrayOf(5, 3, 5)
                )
            )
        )
        assertEquals(
            0,
            minimumEffortPath(
                arrayOf(
                    intArrayOf(1, 2, 1, 1, 1),
                    intArrayOf(1, 2, 1, 2, 1),
                    intArrayOf(1, 2, 1, 2, 1),
                    intArrayOf(1, 2, 1, 2, 1),
                    intArrayOf(1, 1, 1, 2, 1)
                )
            )
        )
    }

    @Test
    fun concatenatedBinaryTest() {
        assertEquals(1, concatenatedBinary(1))
        assertEquals(6, concatenatedBinary(2))
        assertEquals(27, concatenatedBinary(3))
        assertEquals(220, concatenatedBinary(4))
        assertEquals(1765, concatenatedBinary(5))
        assertEquals(14126, concatenatedBinary(6))
        assertEquals(113015, concatenatedBinary(7))
        assertEquals(1808248, concatenatedBinary(8))
        assertEquals(28931977, concatenatedBinary(9))
        assertEquals(462911642, concatenatedBinary(10))
        assertEquals(406586234, concatenatedBinary(11))
        assertEquals(505379714, concatenatedBinary(12))
    }

    @Test
    fun getSmallestStringTest() {
        assertEquals("aay", getSmallestString(3, 27))
        assertEquals("aaszz", getSmallestString(5, 73))
    }
}