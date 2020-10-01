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
}