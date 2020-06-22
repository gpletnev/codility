package leetcode.challenge.june2020.week4

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testSingleNumberII() {
        Assert.assertEquals(3, SingleNumberII.singleNumber(intArrayOf(2, 2, 3, 2)))
        Assert.assertEquals(99, SingleNumberII.singleNumber(intArrayOf(0, 1, 0, 1, 0, 1, 99)))
    }
}