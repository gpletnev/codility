package leetcode.challenge.`2021`.`03`.week5

import leetcode.BinaryTree
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun flipMatchVoyageTest() {
        Assert.assertArrayEquals(
            intArrayOf(-1),
            flipMatchVoyage(BinaryTree(listOf(1, 2)).head, intArrayOf(2, 1)).toIntArray()
        )
        Assert.assertArrayEquals(
            intArrayOf(1),
            flipMatchVoyage(BinaryTree(listOf(1, 2, 3)).head, intArrayOf(1, 3, 2)).toIntArray()
        )
        Assert.assertArrayEquals(
            intArrayOf(),
            flipMatchVoyage(BinaryTree(listOf(1, 2, 3)).head, intArrayOf(1, 2, 3)).toIntArray()
        )
    }

    @Test
    fun maxEnvelopesTest() {
        Assert.assertEquals(
            3,
            maxEnvelopes(arrayOf(intArrayOf(5, 4), intArrayOf(6, 4), intArrayOf(6, 7), intArrayOf(2, 3)))
        )
        Assert.assertEquals(1, maxEnvelopes(arrayOf(intArrayOf(1, 1), intArrayOf(1, 1), intArrayOf(1, 1))))
    }
}