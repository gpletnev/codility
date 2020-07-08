package leetcode.easy

import leetcode.easy.array.*
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testRemoveDuplicatesfromSortedArray() {
        Assert.assertEquals(2, removeDuplicates(listOf(1, 1, 2).toIntArray()))
        Assert.assertEquals(5, removeDuplicates(listOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4).toIntArray()))
    }

    @Test
    fun testBestTimeToBuyAndSellStock() {
        Assert.assertEquals(5, BestTimeToBuyAndSellStock.maxProfit(listOf(7, 1, 5, 3, 6, 4).toIntArray()))
        Assert.assertEquals(4, BestTimeToBuyAndSellStock.maxProfit(listOf(1, 2, 3, 4, 5).toIntArray()))
        Assert.assertEquals(0, BestTimeToBuyAndSellStock.maxProfit(listOf(7, 6, 4, 3, 1).toIntArray()))
        Assert.assertEquals(0, BestTimeToBuyAndSellStock.maxProfit(IntArray(0)))
    }

    @Test
    fun testBestTimeToBuyAndSellStockII() {
        Assert.assertEquals(7, BestTimeToBuyAndSellStockII.maxProfit(listOf(7, 1, 5, 3, 6, 4).toIntArray()))
        Assert.assertEquals(4, BestTimeToBuyAndSellStockII.maxProfit(listOf(1, 2, 3, 4, 5).toIntArray()))
        Assert.assertEquals(0, BestTimeToBuyAndSellStockII.maxProfit(listOf(7, 6, 4, 3, 1).toIntArray()))
    }

    @Test
    fun testValidPalindrome() {
        Assert.assertTrue(ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama"))
        Assert.assertFalse(ValidPalindrome.isPalindrome("race a car"))
    }

    @Test
    fun testUglyNumber() {
        Assert.assertEquals(true, UglyNumber.isUgly(6))
        Assert.assertEquals(true, UglyNumber.isUgly(8))
        Assert.assertEquals(true, UglyNumber.isUgly(14))
    }

    @Test
    fun testTwoSum() {
        Assert.assertArrayEquals(intArrayOf(0, 1), twoSum(intArrayOf(2, 7, 11, 15), 9))
    }
}