package leetcode.challenge.`2021`.`03`.week1

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun distributeCandiesTest() {
        Assert.assertEquals(3, distributeCandies(intArrayOf(1, 1, 2, 2, 3, 3)))
        Assert.assertEquals(2, distributeCandies(intArrayOf(1, 1, 2, 3)))
        Assert.assertEquals(1, distributeCandies(intArrayOf(1, 1, 1, 1)))
    }

    @Test
    fun findErrorNumsTest() {
        Assert.assertArrayEquals(intArrayOf(2, 3), findErrorNums(intArrayOf(1, 2, 2, 4)))
        Assert.assertArrayEquals(intArrayOf(1, 2), findErrorNums(intArrayOf(1, 1)))
    }
}