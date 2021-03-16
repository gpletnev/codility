package leetcode.challenge.`2021`.`03`.week3

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun maxProfitTest() {
        Assert.assertEquals(8, maxProfit(intArrayOf(1, 3, 2, 8, 4, 9), 2))
        Assert.assertEquals(6, maxProfit(intArrayOf(1, 3, 7, 5, 10, 3), 3))
    }
}