package leetcode.challenge.`2020`.`11`.week5

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class Test {
    @Test
    fun canReachTest() {
        assertEquals(true, canReach(intArrayOf(4, 2, 3, 0, 3, 1, 2), 5))
        assertEquals(true, canReach(intArrayOf(4, 2, 3, 0, 3, 1, 2), 0))
        assertEquals(false, canReach(intArrayOf(3, 0, 2, 1, 2), 2))
    }

    @Test
    fun getSkylineTest() {
        assertContentEquals(
                listOf(listOf(2, 10), listOf(3, 15), listOf(7, 12), listOf(12, 0), listOf(15, 10), listOf(20, 8), listOf(24, 0)).toTypedArray(),
                getSkyline(arrayOf(intArrayOf(2, 9, 10), intArrayOf(3, 7, 15), intArrayOf(5, 12, 12), intArrayOf(15, 20, 10), intArrayOf(19, 24, 8))).toTypedArray())
    }
}
