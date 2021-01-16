package leetcode.challenge.`2021`.`01`.week3

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun getMaximumGeneratedTest() {
        Assert.assertEquals(3, getMaximumGenerated(7))
        Assert.assertEquals(1, getMaximumGenerated(2))
        Assert.assertEquals(2, getMaximumGenerated(3))
    }

    @Test
    fun findKthLargestTest() {
        Assert.assertEquals(5, findKthLargest(intArrayOf(3, 2, 1, 5, 6, 4), 2))
        Assert.assertEquals(4, findKthLargest(intArrayOf(3, 2, 3, 1, 2, 4, 5, 5, 6), 4))
    }
}