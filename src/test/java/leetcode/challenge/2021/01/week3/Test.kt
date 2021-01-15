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
}