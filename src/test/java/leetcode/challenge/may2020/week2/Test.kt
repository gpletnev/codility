package leetcode.challenge.may2020.week2

import org.junit.Assert
import org.junit.Test

class Test {

    @Test
    fun testCheckIfItIsAStraightLine() {
        Assert.assertEquals(true, CheckIfItIsAStraightLine.checkStraightLine(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4), intArrayOf(4, 5), intArrayOf(5, 6), intArrayOf(6, 7))))
        Assert.assertEquals(false, CheckIfItIsAStraightLine.checkStraightLine(arrayOf(intArrayOf(1, 1), intArrayOf(2, 2), intArrayOf(3, 4), intArrayOf(4, 5), intArrayOf(5, 6), intArrayOf(7, 7))))
        Assert.assertEquals(true, CheckIfItIsAStraightLine.checkStraightLine(arrayOf(intArrayOf(1, 1), intArrayOf(1, 2), intArrayOf(1, 4))))
    }

    @Test
    fun testValidPerfectSquare() {
        Assert.assertEquals(false, ValidPerfectSquare.isPerfectSquare(2147483647))
        Assert.assertEquals(true, ValidPerfectSquare.isPerfectSquare(16))
        Assert.assertEquals(false, ValidPerfectSquare.isPerfectSquare(14))
    }

    @Test
    fun testSingleElementInASortedArray() {
        Assert.assertEquals(2, SingleElementInASortedArray.singleNonDuplicate(intArrayOf(2)))
        Assert.assertEquals(2, SingleElementInASortedArray.singleNonDuplicate(intArrayOf(1, 1, 2)))
        Assert.assertEquals(2, SingleElementInASortedArray.singleNonDuplicate(intArrayOf(1, 1, 2, 3, 3)))
        Assert.assertEquals(2, SingleElementInASortedArray.singleNonDuplicate(intArrayOf(1, 1, 2, 3, 3, 4, 4, 8, 8)))
        Assert.assertEquals(10, SingleElementInASortedArray.singleNonDuplicate(intArrayOf(3, 3, 7, 7, 10, 11, 11)))
    }
}