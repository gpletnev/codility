package leetcode.challenge.`2020`.`10`.week3

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testRotateArray() {
        var nums = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        rotate(nums, 3)
        Assert.assertArrayEquals(intArrayOf(5, 6, 7, 1, 2, 3, 4), nums)

        nums = intArrayOf(-1, -100, 3, 99)
        rotate(nums, 2)
        Assert.assertArrayEquals(intArrayOf(3, 99, -1, -100), nums)
    }

    @Test
    fun testSearchMatrix() {
        Assert.assertEquals(true, searchMatrix(arrayOf(intArrayOf(1, 3, 5, 7), intArrayOf(10, 11, 16, 20), intArrayOf(23, 30, 34, 50)), 3))
        Assert.assertEquals(false, searchMatrix(arrayOf(intArrayOf(1, 3, 5, 7), intArrayOf(10, 11, 16, 20), intArrayOf(23, 30, 34, 50)), 13))
        Assert.assertEquals(false, searchMatrix(arrayOf(), 3))
    }
}