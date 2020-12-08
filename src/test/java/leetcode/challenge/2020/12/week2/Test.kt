package leetcode.challenge.`2020`.`12`.week2

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun numPairsDivisibleBy60Test() {
        Assert.assertEquals(3, numPairsDivisibleBy60(intArrayOf(30, 20, 150, 100, 40)))
        Assert.assertEquals(3, numPairsDivisibleBy60(intArrayOf(60, 60, 60)))
    }
}