package leetcode.challenge.`2021`.`04`.week2

import leetcode.BinaryTree
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Test {
    @Test
    fun letterCombinationsTest() {
        assertContentEquals(
            arrayOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"),
            letterCombinations("23").toTypedArray()
        )
        assertContentEquals(arrayOf(), letterCombinations("").toTypedArray())
        assertContentEquals(arrayOf("a", "b", "c"), letterCombinations("2").toTypedArray())
    }

    @Test
    fun isAlienSortedTest() {
        assertTrue(isAlienSorted(arrayOf("hello", "leetcode"), "hlabcdefgijkmnopqrstuvwxyz"))
        assertFalse(isAlienSorted(arrayOf("word", "world", "row"), "worldabcefghijkmnpqstuvxyz"))
        assertFalse(isAlienSorted(arrayOf("apple", "app"), "abcdefghijklmnopqrstuvwxyz"))
    }

    @Test
    fun deepestLeavesSumTest() {
        assertEquals(
            15,
            deepestLeavesSum(BinaryTree(listOf(1, 2, 3, 4, 5, null, 6, 7, null, null, null, null, 8)).head!!)
        )
        assertEquals(
            19,
            deepestLeavesSum(BinaryTree(listOf(6, 7, 8, 2, 7, 1, 3, 9, null, 1, 4, null, null, null, 5)).head!!)
        )
    }

    @Test
    fun constructArrayTest() {
        assertContentEquals(intArrayOf(1, 2, 3), constructArray(3, 1))
        assertContentEquals(intArrayOf(1, 3, 2), constructArray(3, 2))
    }
}

