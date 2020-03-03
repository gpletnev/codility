package leetcode.easy

import leetcode.easy.array.maxProfit
import leetcode.easy.array.removeDuplicates
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testRemoveDuplicatesfromSortedArray() {
        Assert.assertEquals(2, removeDuplicates(listOf(1,1,2).toIntArray()))
        Assert.assertEquals(5, removeDuplicates(listOf(0,0,1,1,1,2,2,3,3,4).toIntArray()))
    }

    @Test
    fun testBestTimeToBuyAndSellStockII() {
        Assert.assertEquals(7, maxProfit(listOf(7,1,5,3,6,4).toIntArray()))
        Assert.assertEquals(4, maxProfit(listOf(1,2,3,4,5).toIntArray()))
        Assert.assertEquals(0, maxProfit(listOf(7,6,4,3,1).toIntArray()))
    }
}