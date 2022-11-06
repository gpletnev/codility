package leetcode.challenge.`2020`.`10`.week5

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {

    @Test
    fun maxDistToClosestTest() {
        assertEquals(2, maxDistToClosest(intArrayOf(1, 0, 0, 0, 1, 0, 1)))
        assertEquals(3, maxDistToClosest(intArrayOf(1, 0, 0, 0)))
        assertEquals(1, maxDistToClosest(intArrayOf(0, 1)))
    }

    @Test
    fun findNumberOfLISTest() {
        assertEquals(2, findNumberOfLIS(intArrayOf(1, 3, 5, 4, 7)))
        assertEquals(5, findNumberOfLIS(intArrayOf(2, 2, 2, 2, 2)))
    }
}