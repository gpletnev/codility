package leetcode.challenge.`2020`.`12`.week2

import leetcode.BinaryTree
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun numPairsDivisibleBy60Test() {
        Assert.assertEquals(3, numPairsDivisibleBy60(intArrayOf(30, 20, 150, 100, 40)))
        Assert.assertEquals(3, numPairsDivisibleBy60(intArrayOf(60, 60, 60)))
    }

    @Test
    fun testBSTIterator() {
        val binaryTree = BinaryTree(listOf(7, 3, 15, null, null, 9, 20))
        val bstIterator = BSTIterator(binaryTree.head)
        Assert.assertEquals(3, bstIterator.next())
        Assert.assertEquals(7, bstIterator.next())
        Assert.assertEquals(true, bstIterator.hasNext())
        Assert.assertEquals(9, bstIterator.next())
        Assert.assertEquals(true, bstIterator.hasNext())
        Assert.assertEquals(15, bstIterator.next())
        Assert.assertEquals(true, bstIterator.hasNext())
        Assert.assertEquals(20, bstIterator.next())
        Assert.assertEquals(false, bstIterator.hasNext())
    }
}