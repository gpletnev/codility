package leetcode.challenge.april2020.week1

import leetcode.challenge.april2020.week1.CountingElements.countElements
import leetcode.challenge.april2020.week1.SingleNumber.singleNumber
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testSingleNumber() {
        Assert.assertEquals(1, singleNumber(listOf(2, 2, 1).toIntArray()))
        Assert.assertEquals(4, singleNumber(listOf(4, 1, 2, 1, 2).toIntArray()))
    }

    @Test
    fun testMaximumSubarray() {
        Assert.assertEquals(6, MaximumSubarray.maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
    }

    @Test
    fun testCountElements() {
        Assert.assertEquals(2, countElements(listOf(1, 2, 3).toIntArray()))
        Assert.assertEquals(0, countElements(listOf(1, 1, 3, 3, 5, 5, 7, 7).toIntArray()))
        Assert.assertEquals(3, countElements(listOf(1, 3, 2, 3, 5, 0).toIntArray()))
        Assert.assertEquals(2, countElements(listOf(1, 1, 2, 2).toIntArray()))
    }
}