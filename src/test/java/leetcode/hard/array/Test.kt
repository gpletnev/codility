package leetcode.hard.array

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun findMedianSortedArraysTest() {
        Assert.assertEquals(2.0, findMedianSortedArrays(intArrayOf(1, 3), intArrayOf(2)), 0.1)
        Assert.assertEquals(2.5, findMedianSortedArrays(intArrayOf(1, 3), intArrayOf(2, 4)), 0.1)
    }

}