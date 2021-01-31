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

    @Test
    fun nextPermutationTest() {
        var array = intArrayOf(1, 2, 3)
        nextPermutation(array)
        Assert.assertArrayEquals(intArrayOf(1, 3, 2), array)

        array = intArrayOf(3, 2, 1)
        nextPermutation(array)
        Assert.assertArrayEquals(intArrayOf(1, 2, 3), array)

        array = intArrayOf(1, 1, 5)
        nextPermutation(array)
        Assert.assertArrayEquals(intArrayOf(1, 5, 1), array)

        array = intArrayOf(1)
        nextPermutation(array)
        Assert.assertArrayEquals(intArrayOf(1), array)
    }
}