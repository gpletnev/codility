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
}