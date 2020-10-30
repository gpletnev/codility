package leetcode.challenge.`2020`.`10`.week5

import org.junit.Assert
import org.junit.Test

class Test {

    @Test
    fun maxDistToClosestTest() {
        Assert.assertEquals(2, maxDistToClosest(intArrayOf(1, 0, 0, 0, 1, 0, 1)))
        Assert.assertEquals(3, maxDistToClosest(intArrayOf(1, 0, 0, 0)))
        Assert.assertEquals(1, maxDistToClosest(intArrayOf(0, 1)))
    }

    @Test
    fun findNumberOfLISTest() {
        Assert.assertEquals(2, findNumberOfLIS(intArrayOf(1, 3, 5, 4, 7)))
        Assert.assertEquals(5, findNumberOfLIS(intArrayOf(2, 2, 2, 2, 2)))
    }
}