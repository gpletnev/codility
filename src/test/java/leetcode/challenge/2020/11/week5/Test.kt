package leetcode.challenge.`2020`.`11`.week5

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun canReachTest() {
        Assert.assertEquals(true, canReach(intArrayOf(4, 2, 3, 0, 3, 1, 2), 5))
        Assert.assertEquals(true, canReach(intArrayOf(4, 2, 3, 0, 3, 1, 2), 0))
        Assert.assertEquals(false, canReach(intArrayOf(3, 0, 2, 1, 2), 2))
    }
}
