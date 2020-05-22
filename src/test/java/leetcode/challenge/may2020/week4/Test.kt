package leetcode.challenge.may2020.week4

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testSortCharactersByFrequency() {
        Assert.assertTrue(SortCharactersByFrequency.frequencySort("tree") in listOf("eert", "eetr"))
        Assert.assertTrue(SortCharactersByFrequency.frequencySort("cccaaa") in listOf("cccaaa", "aaaccc"))
        Assert.assertTrue(SortCharactersByFrequency.frequencySort("Aabb") in listOf("bbAa", "bbaA"))
    }
}