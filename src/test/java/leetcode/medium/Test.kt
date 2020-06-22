package leetcode.medium

import org.junit.Assert
import org.junit.Test

class Test {

    @Test
    fun testSearchInRotatedSortedArrayII() {
        Assert.assertEquals(true, SearchInRotatedSortedArrayII.search(intArrayOf(2, 5, 6, 0, 0, 1, 2), 0))
        Assert.assertEquals(false, SearchInRotatedSortedArrayII.search(intArrayOf(2, 5, 6, 0, 0, 1, 2), 3))
    }

    @Test
    fun testWordLadder() {
        Assert.assertEquals(5, WordLadder.ladderLength("hit", "cog", listOf("hot", "dot", "dog", "lot", "log", "cog")))
        Assert.assertEquals(0, WordLadder.ladderLength("hit", "cog", listOf("hot", "dot", "dog", "lot", "log")))
    }
}