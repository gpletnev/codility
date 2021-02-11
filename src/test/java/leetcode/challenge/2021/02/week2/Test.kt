package leetcode.challenge.`2021`.`02`.week2

import leetcode.BinaryTree
import leetcode.joinToString
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun peekingIteratorTest() {
        val iterator = listOf(1, 2, 3).iterator()
        val peekingIterator = PeekingIterator(iterator)

        Assert.assertEquals(1, peekingIterator.next())
        Assert.assertEquals(2, peekingIterator.peek())
        Assert.assertEquals(2, peekingIterator.next())
        Assert.assertEquals(3, peekingIterator.next())
        Assert.assertEquals(false, peekingIterator.hasNext())
    }

    @Test
    fun convertBSTTest() {
        var root = BinaryTree(listOf(4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8)).head
        Assert.assertEquals(
            listOf(30, 36, 21, 36, 35, 26, 15, null, null, null, 33, null, null, null, 8).joinToString(),
            convertBST(root).joinToString()
        )

        root = BinaryTree(listOf(0, null, 1)).head
        Assert.assertEquals(
            listOf(1, null, 1).joinToString(),
            convertBST(root).joinToString()
        )

        root = BinaryTree(listOf(1, 0, 2)).head
        Assert.assertEquals(
            listOf(3, 3, 2).joinToString(),
            convertBST(root).joinToString()
        )

        root = BinaryTree(listOf(3, 2, 4, 1)).head
        Assert.assertEquals(
            listOf(7, 9, 4, 10).joinToString(),
            convertBST(root).joinToString()
        )
    }

    @Test
    fun isAnagramTest() {
        Assert.assertTrue(isAnagram("anagram", "nagaram"))
        Assert.assertFalse(isAnagram("rat", "car"))
        Assert.assertFalse(isAnagram("a", "ab"))
    }
}