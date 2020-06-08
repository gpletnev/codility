package leetcode.challenge.june2020.week2

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testPowerOfTwo() {
        Assert.assertEquals(true, PowerOfTwo.isPowerOfTwo(1))
        Assert.assertEquals(true, PowerOfTwo.isPowerOfTwo(2))
        Assert.assertEquals(true, PowerOfTwo.isPowerOfTwo(16))
        Assert.assertEquals(false, PowerOfTwo.isPowerOfTwo(218))
        Assert.assertEquals(false, PowerOfTwo.isPowerOfTwo(Int.MIN_VALUE))
    }
}