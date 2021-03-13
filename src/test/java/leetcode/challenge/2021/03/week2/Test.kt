package leetcode.challenge.`2021`.`03`.week2

import leetcode.BinaryTree
import leetcode.joinToString
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun addOneRowTest() {
        Assert.assertEquals(
            BinaryTree(listOf(4, 1, 1, 2, null, null, 6, 2, 1, 5)).head.joinToString(),
            addOneRow(BinaryTree(listOf(4, 2, 6, 2, 1, 5)).head!!, 1, 2).joinToString()
        )
        Assert.assertEquals(
            BinaryTree(listOf(4, 2, null, 1, 1, 3, null, null, 1)).head.joinToString(),
            addOneRow(BinaryTree(listOf(4, 2, null, 3, 1)).head!!, 1, 3).joinToString()
        )
    }

    @Test
    fun intToRomanTest() {
        Assert.assertEquals("III", intToRoman(3))
        Assert.assertEquals("IV", intToRoman(4))
        Assert.assertEquals("IX", intToRoman(9))
        Assert.assertEquals("LVIII", intToRoman(58))
        Assert.assertEquals("MCMXCIV", intToRoman(1994))
    }

    @Test
    fun coinChangeTest() {
        Assert.assertEquals(3, coinChange(intArrayOf(1, 2, 5), 11))
        Assert.assertEquals(-1, coinChange(intArrayOf(2), 3))
        Assert.assertEquals(0, coinChange(intArrayOf(1), 0))
        Assert.assertEquals(1, coinChange(intArrayOf(1), 1))
        Assert.assertEquals(2, coinChange(intArrayOf(1), 2))
    }

    @Test
    fun hasAllCodesTest() {
        Assert.assertTrue(hasAllCodes("00110110", 2))
        Assert.assertTrue(hasAllCodes("00110", 2))
        Assert.assertTrue(hasAllCodes("0110", 1))
        Assert.assertFalse(hasAllCodes("0110", 2))
        Assert.assertFalse(hasAllCodes("0000000001011100", 4))
    }

    @Test
    fun numFactoredBinaryTreesTest() {
        Assert.assertEquals(3, numFactoredBinaryTrees(intArrayOf(2, 4)))
        Assert.assertEquals(7, numFactoredBinaryTrees(intArrayOf(2, 4, 5, 10)))
    }
}