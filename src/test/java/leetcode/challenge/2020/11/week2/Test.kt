package leetcode.challenge.`2020`.`11`.week2

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {

    @Test
    fun flipAndInvertImageTest() {
        Assertions.assertArrayEquals(arrayOf(intArrayOf(1)), flipAndInvertImage(arrayOf(intArrayOf(0))))
        Assertions.assertArrayEquals(
            arrayOf(intArrayOf(1, 0, 0), intArrayOf(0, 1, 0), intArrayOf(1, 1, 1)),
            flipAndInvertImage(arrayOf(intArrayOf(1, 1, 0), intArrayOf(1, 0, 1), intArrayOf(0, 0, 0)))
        )
        Assertions.assertArrayEquals(
            arrayOf(intArrayOf(1, 1, 0, 0), intArrayOf(0, 1, 1, 0), intArrayOf(0, 0, 0, 1), intArrayOf(1, 0, 1, 0)),
            flipAndInvertImage(
                arrayOf(
                    intArrayOf(1, 1, 0, 0),
                    intArrayOf(1, 0, 0, 1),
                    intArrayOf(0, 1, 1, 1),
                    intArrayOf(1, 0, 1, 0)
                )
            )
        )
    }

    @Test
    fun validSquareTest() {
        assertEquals(true, validSquare(intArrayOf(0, 0), intArrayOf(0, 1), intArrayOf(1, 1), intArrayOf(1, 0)))
        assertEquals(false, validSquare(intArrayOf(0, 0), intArrayOf(0, 1), intArrayOf(1, 1), intArrayOf(1, 1)))
        assertEquals(false, validSquare(intArrayOf(0, 0), intArrayOf(0, 1), intArrayOf(1, 1), intArrayOf(1, 2)))
    }

    @Test
    fun poorPigsTest() {
        assertEquals(3, poorPigs(8, 15, 15))
        assertEquals(5, poorPigs(1000, 15, 60))
    }
}