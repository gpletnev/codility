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
}