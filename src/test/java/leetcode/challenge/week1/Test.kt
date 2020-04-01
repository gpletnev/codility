package leetcode.challenge.week1

import leetcode.challenge.week1.SingleNumber.singleNumber
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testSingleNumber() {
        Assert.assertEquals(1, singleNumber(listOf(2, 2, 1).toIntArray()))
        Assert.assertEquals(4, singleNumber(listOf(4, 1, 2, 1, 2).toIntArray()))
    }
}