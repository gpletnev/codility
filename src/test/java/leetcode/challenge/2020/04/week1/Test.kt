package leetcode.challenge.`2020`.`04`.week1

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Test {
    @Test
    fun isHappy() {
        assertTrue(HappyNumber.isHappy(19))
        assertFalse(HappyNumber.isHappy(2))
    }

    @Test
    fun testSingleNumber() {
        assertEquals(1, SingleNumber.singleNumber(listOf(2, 2, 1).toIntArray()))
        assertEquals(4, SingleNumber.singleNumber(listOf(4, 1, 2, 1, 2).toIntArray()))
    }

    @Test
    fun testMaximumSubarray() {
        assertEquals(6, MaximumSubarray.maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
    }

    @Test
    fun testCountElements() {
        assertEquals(2, CountingElements.countElements(listOf(1, 2, 3).toIntArray()))
        assertEquals(0, CountingElements.countElements(listOf(1, 1, 3, 3, 5, 5, 7, 7).toIntArray()))
        assertEquals(3, CountingElements.countElements(listOf(1, 3, 2, 3, 5, 0).toIntArray()))
        assertEquals(2, CountingElements.countElements(listOf(1, 1, 2, 2).toIntArray()))
    }
}