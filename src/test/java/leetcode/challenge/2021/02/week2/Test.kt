package leetcode.challenge.`2021`.`02`.week2

import leetcode.BinaryTree
import leetcode.joinToString
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Test {
    @Test
    fun peekingIteratorTest() {
        val iterator = listOf(1, 2, 3).iterator()
        val peekingIterator = PeekingIterator(iterator)

        assertEquals(1, peekingIterator.next())
        assertEquals(2, peekingIterator.peek())
        assertEquals(2, peekingIterator.next())
        assertEquals(3, peekingIterator.next())
        assertEquals(false, peekingIterator.hasNext())
    }

    @Test
    fun convertBSTTest() {
        var root = BinaryTree(listOf(4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8)).head
        assertEquals(
            listOf(30, 36, 21, 36, 35, 26, 15, null, null, null, 33, null, null, null, 8).joinToString(),
            convertBST(root).joinToString()
        )

        root = BinaryTree(listOf(0, null, 1)).head
        assertEquals(
            listOf(1, null, 1).joinToString(),
            convertBST(root).joinToString()
        )

        root = BinaryTree(listOf(1, 0, 2)).head
        assertEquals(
            listOf(3, 3, 2).joinToString(),
            convertBST(root).joinToString()
        )

        root = BinaryTree(listOf(3, 2, 4, 1)).head
        assertEquals(
            listOf(7, 9, 4, 10).joinToString(),
            convertBST(root).joinToString()
        )
    }

    @Test
    fun isAnagramTest() {
        assertTrue(isAnagram("anagram", "nagaram"))
        assertFalse(isAnagram("rat", "car"))
        assertTrue(isAnagram("aa", "aa"))
        assertFalse(isAnagram("a", "ab"))
        assertTrue(isAnagram("", ""))
    }

    @Test
    fun numberOfStepsTest() {
        assertEquals(0, numberOfSteps(0))
        assertEquals(6, numberOfSteps(14))
        assertEquals(4, numberOfSteps(8))
        assertEquals(1, numberOfSteps(1))
        assertEquals(12, numberOfSteps(123))
    }

    @Test
    fun shortestPathBinaryMatrixTest() {
        assertEquals(
            1,
            shortestPathBinaryMatrix(
                arrayOf(
                    intArrayOf(0)
                )
            )
        )
        assertEquals(
            2,
            shortestPathBinaryMatrix(
                arrayOf(
                    intArrayOf(0, 1),
                    intArrayOf(1, 0)
                )
            )
        )
        assertEquals(
            -1,
            shortestPathBinaryMatrix(
                arrayOf(
                    intArrayOf(1, 0, 0),
                    intArrayOf(1, 1, 0),
                    intArrayOf(1, 1, 0)
                )
            )
        )
        assertEquals(
            4,
            shortestPathBinaryMatrix(
                arrayOf(
                    intArrayOf(0, 0, 0),
                    intArrayOf(1, 1, 0),
                    intArrayOf(1, 1, 0)
                )
            )
        )
        assertEquals(
            13,
            shortestPathBinaryMatrix(
                arrayOf(
                    intArrayOf(0, 1, 0, 0, 0),
                    intArrayOf(0, 1, 0, 1, 0),
                    intArrayOf(0, 1, 0, 1, 0),
                    intArrayOf(0, 1, 0, 1, 0),
                    intArrayOf(0, 0, 0, 1, 0),
                )
            )
        )
    }

    @Test
    fun isBipartiteTest() {
        assertTrue(isBipartite(arrayOf(intArrayOf(1, 3), intArrayOf(0, 2), intArrayOf(1, 3), intArrayOf(0, 2))))
        assertFalse(
            isBipartite(
                arrayOf(
                    intArrayOf(1, 2, 3),
                    intArrayOf(0, 2),
                    intArrayOf(1, 1, 3),
                    intArrayOf(0, 2)
                )
            )
        )
    }
}