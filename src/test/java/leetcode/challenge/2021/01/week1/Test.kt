package leetcode.challenge.`2021`.`01`.week1

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun canFormArrayTest() {
        Assert.assertTrue(canFormArray(intArrayOf(85), arrayOf(intArrayOf(85))))
        Assert.assertTrue(canFormArray(intArrayOf(15, 18), arrayOf(intArrayOf(18), intArrayOf(15))))
        Assert.assertFalse(canFormArray(intArrayOf(49, 18, 16), arrayOf(intArrayOf(16, 18, 49))))
        Assert.assertTrue(
            canFormArray(
                intArrayOf(91, 4, 64, 78),
                arrayOf(intArrayOf(78), intArrayOf(4, 64), intArrayOf(91))
            )
        )
        Assert.assertFalse(canFormArray(intArrayOf(1, 3, 5, 7), arrayOf(intArrayOf(2, 4, 6, 8))))
    }

    @Test
    fun countArrangementTest() {
        Assert.assertEquals(1, countArrangement(1))
        Assert.assertEquals(2, countArrangement(2))
        Assert.assertEquals(3, countArrangement(3))
    }
}