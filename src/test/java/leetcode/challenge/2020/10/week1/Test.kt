package leetcode.challenge.`2020`.`10`.week1

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testRecentCounter() {
        val recentCounter = RecentCounter()
        Assert.assertEquals(1, recentCounter.ping(1))
        Assert.assertEquals(2, recentCounter.ping(100))
        Assert.assertEquals(3, recentCounter.ping(3001))
        Assert.assertEquals(3, recentCounter.ping(3002))
    }

    @Test
    fun testCombinationSum() {
        Assert.assertEquals("[]", combinationSum(intArrayOf(2), 1).toString())
        Assert.assertEquals("[[1]]", combinationSum(intArrayOf(1), 1).toString())
        Assert.assertEquals("[[1, 1]]", combinationSum(intArrayOf(1), 2).toString())
        Assert.assertEquals("[[2, 2, 2, 2], [2, 3, 3], [3, 5]]", combinationSum(intArrayOf(2, 3, 5), 8).toString())
        Assert.assertEquals("[[2, 2, 3], [7]]", combinationSum(intArrayOf(2, 3, 6, 7), 7).toString())
    }
}