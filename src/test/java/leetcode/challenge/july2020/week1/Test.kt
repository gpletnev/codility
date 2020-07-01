package leetcode.challenge.july2020.week1

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testArrangingCoins() {
        Assert.assertEquals(0, ArrangingCoins.arrangeCoins(0))
        Assert.assertEquals(1, ArrangingCoins.arrangeCoins(1))
        Assert.assertEquals(1, ArrangingCoins.arrangeCoins(2))
        Assert.assertEquals(2, ArrangingCoins.arrangeCoins(5))
        Assert.assertEquals(3, ArrangingCoins.arrangeCoins(8))
    }
}