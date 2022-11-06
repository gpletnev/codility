package leetcode.challenge.`2021`.`03`.week2

import leetcode.BinaryTree
import leetcode.joinToString
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Test {
    @Test
    fun addOneRowTest() {
        assertEquals(
            BinaryTree(listOf(4, 1, 1, 2, null, null, 6, 2, 1, 5)).head.joinToString(),
            addOneRow(BinaryTree(listOf(4, 2, 6, 2, 1, 5)).head!!, 1, 2).joinToString()
        )
        assertEquals(
            BinaryTree(listOf(4, 2, null, 1, 1, 3, null, null, 1)).head.joinToString(),
            addOneRow(BinaryTree(listOf(4, 2, null, 3, 1)).head!!, 1, 3).joinToString()
        )
    }

    @Test
    fun intToRomanTest() {
        assertEquals("III", intToRoman(3))
        assertEquals("IV", intToRoman(4))
        assertEquals("IX", intToRoman(9))
        assertEquals("LVIII", intToRoman(58))
        assertEquals("MCMXCIV", intToRoman(1994))
    }

    @Test
    fun coinChangeTest() {
        assertEquals(3, coinChange(intArrayOf(1, 2, 5), 11))
        assertEquals(-1, coinChange(intArrayOf(2), 3))
        assertEquals(0, coinChange(intArrayOf(1), 0))
        assertEquals(1, coinChange(intArrayOf(1), 1))
        assertEquals(2, coinChange(intArrayOf(1), 2))
    }

    @Test
    fun hasAllCodesTest() {
        assertTrue(hasAllCodes("00110110", 2))
        assertTrue(hasAllCodes("00110", 2))
        assertTrue(hasAllCodes("0110", 1))
        assertFalse(hasAllCodes("0110", 2))
        assertFalse(hasAllCodes("0000000001011100", 4))
    }

    @Test
    fun numFactoredBinaryTreesTest() {
        assertEquals(3, numFactoredBinaryTrees(intArrayOf(2, 4)))
        assertEquals(7, numFactoredBinaryTrees(intArrayOf(2, 4, 5, 10)))
    }
}