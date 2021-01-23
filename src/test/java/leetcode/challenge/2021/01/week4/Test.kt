package leetcode.challenge.`2021`.`01`.week4

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
}