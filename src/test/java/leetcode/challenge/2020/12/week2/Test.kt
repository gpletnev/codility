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

    @Test
    fun validMountainArrayTest() {
        Assert.assertEquals(false, validMountainArray(intArrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)))
        Assert.assertEquals(false, validMountainArray(intArrayOf(2, 1)))
        Assert.assertEquals(false, validMountainArray(intArrayOf(3, 5, 5)))
        Assert.assertEquals(true, validMountainArray(intArrayOf(0, 3, 2, 1)))
    }

    @Test
    fun removeDuplicatesTest() {
        var array = intArrayOf(1, 1, 1, 2, 2, 3)
        Assert.assertEquals(5, removeDuplicates(array))
        Assert.assertArrayEquals(intArrayOf(1, 1, 2, 2, 3), array.copyOf(5))

        array = intArrayOf(0, 0, 1, 1, 1, 1, 2, 3, 3)
        Assert.assertEquals(7, removeDuplicates(array))
        Assert.assertArrayEquals(intArrayOf(0, 0, 1, 1, 2, 3, 3), array.copyOf(7))
    }
}