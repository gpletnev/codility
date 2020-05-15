package leetcode.challenge.may2020.week3

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testMaximumSumCircularSubarray() {
        Assert.assertEquals(3, MaximumSumCircularSubarray.maxSubarraySumCircular(intArrayOf(1, -2, 3, -2)))
        Assert.assertEquals(10, MaximumSumCircularSubarray.maxSubarraySumCircular(intArrayOf(5, -3, 5)))
        Assert.assertEquals(4, MaximumSumCircularSubarray.maxSubarraySumCircular(intArrayOf(3, -1, 2, -1)))
        Assert.assertEquals(3, MaximumSumCircularSubarray.maxSubarraySumCircular(intArrayOf(3, -2, 2, -3)))
        Assert.assertEquals(-1, MaximumSumCircularSubarray.maxSubarraySumCircular(intArrayOf(-2, -3, -1)))
    }
}