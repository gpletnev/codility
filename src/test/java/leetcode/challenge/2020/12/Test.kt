package leetcode.challenge.`2020`.`12`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {
    @Test
    fun largestRectangleAreaTest() {
        assertEquals(1, largestRectangleArea(intArrayOf(1)))
        assertEquals(10, largestRectangleArea(intArrayOf(2, 1, 5, 6, 2, 3)))
    }
}