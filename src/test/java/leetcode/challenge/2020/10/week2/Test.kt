package leetcode.challenge.`2020`.`10`.week2

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testBinarySearch() {
        Assert.assertEquals(4, search(intArrayOf(-1, 0, 3, 5, 9, 12), 9))
        Assert.assertEquals(-1, search(intArrayOf(-1, 0, 3, 5, 9, 12), 2))
    }
}