package leetcode.hard.array

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {
    @Test
    fun findMedianSortedArraysTest() {
        assertEquals(2.0, findMedianSortedArrays(intArrayOf(1, 3), intArrayOf(2)), 0.1)
        assertEquals(2.5, findMedianSortedArrays(intArrayOf(1, 3), intArrayOf(2, 4)), 0.1)
    }

}