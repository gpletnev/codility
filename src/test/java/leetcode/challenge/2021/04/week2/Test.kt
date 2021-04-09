package leetcode.challenge.`2021`.`04`.week2

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
}