package leetcode.challenge.`2020`.`06`.week5

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {

    @Test
    fun testUniquePaths() {
        assertEquals(1, UniquePaths.uniquePaths(1, 2))
        assertEquals(3, UniquePaths.uniquePaths(3, 2))
        assertEquals(28, UniquePaths.uniquePaths(7, 3))
        assertEquals(48620, UniquePaths.uniquePaths(10, 10))
    }
}