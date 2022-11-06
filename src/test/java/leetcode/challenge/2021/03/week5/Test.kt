package leetcode.challenge.`2021`.`03`.week5

import leetcode.BinaryTree
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class Test {
    @Test
    fun flipMatchVoyageTest() {
        assertContentEquals(
            intArrayOf(-1),
            flipMatchVoyage(BinaryTree(listOf(1, 2)).head, intArrayOf(2, 1)).toIntArray()
        )
        assertContentEquals(
            intArrayOf(1),
            flipMatchVoyage(BinaryTree(listOf(1, 2, 3)).head, intArrayOf(1, 3, 2)).toIntArray()
        )
        assertContentEquals(
            intArrayOf(),
            flipMatchVoyage(BinaryTree(listOf(1, 2, 3)).head, intArrayOf(1, 2, 3)).toIntArray()
        )
    }

    @Test
    fun maxEnvelopesTest() {
        assertEquals(
            3,
            maxEnvelopes(arrayOf(intArrayOf(5, 4), intArrayOf(6, 4), intArrayOf(6, 7), intArrayOf(2, 3)))
        )
        assertEquals(1, maxEnvelopes(arrayOf(intArrayOf(1, 1), intArrayOf(1, 1), intArrayOf(1, 1))))
    }

    @Test
    fun movesToStampTest() {
        assertContentEquals(intArrayOf(1, 0, 2), movesToStamp("abc", "ababc"))
        assertContentEquals(intArrayOf(2, 3, 0, 1), movesToStamp("abca", "aabcaca"))
    }
}