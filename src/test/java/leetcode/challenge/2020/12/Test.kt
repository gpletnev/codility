package leetcode.challenge.`2020`.`12`

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun largestRectangleAreaTest() {
        Assert.assertEquals(1, largestRectangleArea(intArrayOf(1)))
        Assert.assertEquals(10, largestRectangleArea(intArrayOf(2, 1, 5, 6, 2, 3)))
    }
}