package leetcode.challenge.`2021`.`01`.week4

import leetcode.toList
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun mostCompetitiveTest() {
        Assert.assertFalse(closeStrings("abbzzca", "babzzcz"))
        Assert.assertTrue(closeStrings("abc", "bca"))
        Assert.assertFalse(closeStrings("a", "aa"))
        Assert.assertTrue(closeStrings(word1 = "cabbba", word2 = "abbccc"))
        Assert.assertFalse(closeStrings(word1 = "cabbba", word2 = "aabbss"))
    }

    @Test
    fun diagonalSortTest() {
        Assert.assertEquals(
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
        Assert.assertNull(mergeKLists(arrayOf(intArrayOf().toList())))
        Assert.assertNull(mergeKLists(arrayOf(intArrayOf().toList())))

    }

    @Test
    fun kLengthApartTest() {
        Assert.assertTrue(kLengthApart(intArrayOf(1, 0, 0, 0, 1, 0, 0, 1), 2))
        Assert.assertFalse(kLengthApart(intArrayOf(1, 0, 0, 1, 0, 1), 2))
        Assert.assertTrue(kLengthApart(intArrayOf(1, 1, 1, 1, 1), 0))
        Assert.assertTrue(kLengthApart(intArrayOf(0, 1, 0, 1), 1))
    }

    @Test
    fun minimumEffortPathTest() {
        Assert.assertEquals(
            2,
            minimumEffortPath(
                arrayOf(
                    intArrayOf(1, 2, 2),
                    intArrayOf(3, 8, 2),
                    intArrayOf(5, 3, 5)
                )
            )
        )
        Assert.assertEquals(
            1,
            minimumEffortPath(
                arrayOf(
                    intArrayOf(1, 2, 3),
                    intArrayOf(3, 8, 4),
                    intArrayOf(5, 3, 5)
                )
            )
        )
        Assert.assertEquals(
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
        Assert.assertEquals(1, concatenatedBinary(1))
        Assert.assertEquals(6, concatenatedBinary(2))
        Assert.assertEquals(27, concatenatedBinary(3))
        Assert.assertEquals(220, concatenatedBinary(4))
        Assert.assertEquals(1765, concatenatedBinary(5))
        Assert.assertEquals(14126, concatenatedBinary(6))
        Assert.assertEquals(113015, concatenatedBinary(7))
        Assert.assertEquals(1808248, concatenatedBinary(8))
        Assert.assertEquals(28931977, concatenatedBinary(9))
        Assert.assertEquals(462911642, concatenatedBinary(10))
        Assert.assertEquals(406586234, concatenatedBinary(11))
        Assert.assertEquals(505379714, concatenatedBinary(12))
    }

    @Test
    fun getSmallestStringTest() {
        Assert.assertEquals("aay", getSmallestString(3, 27))
        Assert.assertEquals("aaszz", getSmallestString(5, 73))
    }
}