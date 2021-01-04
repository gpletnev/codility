package leetcode.challenge.`2021`.`01`.week1

import leetcode.toIntArray
import leetcode.toList
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

    @Test
    fun mergeTwoListsTest() {
        Assert.assertNull(mergeTwoLists(intArrayOf().toList(), intArrayOf().toList()))
        Assert.assertArrayEquals(
            intArrayOf(0),
            mergeTwoLists(intArrayOf().toList(), intArrayOf(0).toList())!!.toIntArray()
        )
        Assert.assertArrayEquals(
            intArrayOf(1, 1, 2, 3, 4, 4),
            mergeTwoLists(intArrayOf(1, 3, 4).toList(), intArrayOf(1, 2, 4).toList())!!.toIntArray()
        )
    }
}