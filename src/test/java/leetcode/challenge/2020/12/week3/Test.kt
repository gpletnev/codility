package leetcode.challenge.`2020`.`12`.week3

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun sortedSquaresTest() {
        Assert.assertArrayEquals(intArrayOf(0, 1, 4), sortedSquares(intArrayOf(-1, 0, 2)))
        Assert.assertArrayEquals(intArrayOf(0, 1, 9, 16, 100), sortedSquares(intArrayOf(-4, -1, 0, 3, 10)))
    }
}