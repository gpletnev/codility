package leetcode.challenge.week4

import org.junit.Assert
import org.junit.Test

class Test {

    @Test
    fun testSubarraySumEqualsK() {
        Assert.assertEquals(2, SubarraySumEqualsK.subarraySum(intArrayOf(1, 1, 1), 2))
    }

    @Test
    fun testBitwiseANDOfNumbersRange() {
        Assert.assertEquals(4, BitwiseANDOfNumbersRange.rangeBitwiseAnd(5, 7))
        Assert.assertEquals(0, BitwiseANDOfNumbersRange.rangeBitwiseAnd(0, 1))
    }
}