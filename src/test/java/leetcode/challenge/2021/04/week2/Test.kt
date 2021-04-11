package leetcode.challenge.`2021`.`04`.week2

import leetcode.BinaryTree
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun letterCombinationsTest() {
        Assert.assertArrayEquals(
            arrayOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"),
            letterCombinations("23").toTypedArray()
        )
        Assert.assertArrayEquals(arrayOf(), letterCombinations("").toTypedArray())
        Assert.assertArrayEquals(arrayOf("a", "b", "c"), letterCombinations("2").toTypedArray())
    }

    @Test
    fun isAlienSortedTest() {
        Assert.assertTrue(isAlienSorted(arrayOf("hello", "leetcode"), "hlabcdefgijkmnopqrstuvwxyz"))
        Assert.assertFalse(isAlienSorted(arrayOf("word", "world", "row"), "worldabcefghijkmnpqstuvxyz"))
        Assert.assertFalse(isAlienSorted(arrayOf("apple", "app"), "abcdefghijklmnopqrstuvwxyz"))
    }

    @Test
    fun deepestLeavesSumTest() {
        Assert.assertEquals(
            15,
            deepestLeavesSum(BinaryTree(listOf(1, 2, 3, 4, 5, null, 6, 7, null, null, null, null, 8)).head!!)
        )
        Assert.assertEquals(
            19,
            deepestLeavesSum(BinaryTree(listOf(6, 7, 8, 2, 7, 1, 3, 9, null, 1, 4, null, null, null, 5)).head!!)
        )
    }
}

