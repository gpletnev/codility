package leetcode.challenge.`2020`.`05`.week4

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testSortCharactersByFrequency() {
        Assert.assertTrue(SortCharactersByFrequency.frequencySort("tree") in listOf("eert", "eetr"))
        Assert.assertTrue(SortCharactersByFrequency.frequencySort("cccaaa") in listOf("cccaaa", "aaaccc"))
        Assert.assertTrue(SortCharactersByFrequency.frequencySort("Aabb") in listOf("bbAa", "bbaA"))
    }

    @Test
    fun testUncrossedLines() {
        Assert.assertEquals(2, UncrossedLines.maxUncrossedLines(intArrayOf(1, 4, 2), intArrayOf(1, 2, 4)))
        Assert.assertEquals(3, UncrossedLines.maxUncrossedLines(intArrayOf(2, 5, 1, 2, 5), intArrayOf(10, 5, 2, 1, 5, 2)))
        Assert.assertEquals(2, UncrossedLines.maxUncrossedLines(intArrayOf(1, 3, 7, 1, 7, 5), intArrayOf(1, 9, 2, 5, 1)))
    }

    @Test
    fun testCountingBits() {
        Assert.assertArrayEquals(intArrayOf(0, 1, 1), CountingBits.countBits(2))
        Assert.assertArrayEquals(intArrayOf(0, 1, 1, 2, 1, 2), CountingBits.countBits(5))
    }
}