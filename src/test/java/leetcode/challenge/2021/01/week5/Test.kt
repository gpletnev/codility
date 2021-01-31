package leetcode.challenge.`2021`.`01`.week5

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun minimumDeviationTest() {
        Assert.assertEquals(1, minimumDeviation(intArrayOf(1, 2, 3, 4)))
        Assert.assertEquals(3, minimumDeviation(intArrayOf(4, 1, 5, 20, 3)))
        Assert.assertEquals(3, minimumDeviation(intArrayOf(2, 10, 8)))
    }
}