package leetcode.challenge.`2021`.`03`.week3

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun maxProfitTest() {
        Assert.assertEquals(8, maxProfit(intArrayOf(1, 3, 2, 8, 4, 9), 2))
        Assert.assertEquals(6, maxProfit(intArrayOf(1, 3, 7, 5, 10, 3), 3))
    }

    @Test
    fun wiggleMaxLengthTest() {
        Assert.assertEquals(6, wiggleMaxLength(intArrayOf(1, 7, 4, 9, 2, 5)))
        Assert.assertEquals(7, wiggleMaxLength(intArrayOf(1, 17, 5, 10, 13, 15, 10, 5, 16, 8)))
        Assert.assertEquals(2, wiggleMaxLength(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)))
    }
}