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
}