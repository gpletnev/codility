package leetcode.challenge.`2020`.`11`.week2

import org.junit.Assert
import org.junit.Test

class Test {

    @Test
    fun flipAndInvertImageTest() {
        Assert.assertArrayEquals(
                arrayOf(intArrayOf(1)),
                flipAndInvertImage(arrayOf(intArrayOf(0))))
        Assert.assertArrayEquals(
                arrayOf(intArrayOf(1, 0, 0), intArrayOf(0, 1, 0), intArrayOf(1, 1, 1)),
                flipAndInvertImage(arrayOf(intArrayOf(1, 1, 0), intArrayOf(1, 0, 1), intArrayOf(0, 0, 0))))
        Assert.assertArrayEquals(
                arrayOf(intArrayOf(1, 1, 0, 0), intArrayOf(0, 1, 1, 0), intArrayOf(0, 0, 0, 1), intArrayOf(1, 0, 1, 0)),
                flipAndInvertImage(arrayOf(intArrayOf(1, 1, 0, 0), intArrayOf(1, 0, 0, 1), intArrayOf(0, 1, 1, 1), intArrayOf(1, 0, 1, 0))))
    }

    @Test
    fun validSquareTest() {
        Assert.assertEquals(true, validSquare(intArrayOf(0, 0), intArrayOf(0, 1), intArrayOf(1, 1), intArrayOf(1, 0)))
        Assert.assertEquals(false, validSquare(intArrayOf(0, 0), intArrayOf(0, 1), intArrayOf(1, 1), intArrayOf(1, 1)))
        Assert.assertEquals(false, validSquare(intArrayOf(0, 0), intArrayOf(0, 1), intArrayOf(1, 1), intArrayOf(1, 2)))
    }

    @Test
    fun poorPigsTest() {
        Assert.assertEquals(3, poorPigs(8, 15, 15))
        Assert.assertEquals(5, poorPigs(1000, 15, 60))
    }
}