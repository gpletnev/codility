package leetcode.challenge.june2020.week5

import org.junit.Assert
import org.junit.Test

class Test {

    @Test
    fun testUniquePaths() {
        Assert.assertEquals(1, UniquePaths.uniquePaths(1, 2))
        Assert.assertEquals(3, UniquePaths.uniquePaths(3, 2))
        Assert.assertEquals(28, UniquePaths.uniquePaths(7, 3))
        Assert.assertEquals(48620, UniquePaths.uniquePaths(10, 10))
    }
}