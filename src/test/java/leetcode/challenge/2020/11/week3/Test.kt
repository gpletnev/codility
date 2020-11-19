package leetcode.challenge.`2020`.`11`.week3

import leetcode.BinaryTree
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun rangeSumBSTTest() {
        var tree = BinaryTree(listOf(10, 5, 15, 3, 7, null, 18))
        Assert.assertEquals(32, rangeSumBST(tree.head, 7, 15))

        tree = BinaryTree(listOf(10, 5, 15, 3, 7, 13, 18, 1, null, 6))
        Assert.assertEquals(23, rangeSumBST(tree.head, 6, 10))
    }

    @Test
    fun longestMountainTest() {
        Assert.assertEquals(0, longestMountain(intArrayOf(2, 2, 3)))
        Assert.assertEquals(5, longestMountain(intArrayOf(2, 1, 4, 7, 3, 2, 5)))
        Assert.assertEquals(0, longestMountain(intArrayOf(2, 2, 2)))
    }

    @Test
    fun mirrorReflectionTest() {
        Assert.assertEquals(2, mirrorReflection(2, 1))
    }

    @Test
    fun mergeTest() {
        Assert.assertArrayEquals(arrayOf(intArrayOf(1, 6), intArrayOf(8, 10), intArrayOf(15, 18)),
                merge(arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18))))
        Assert.assertArrayEquals(arrayOf(intArrayOf(1, 5)),
                merge(arrayOf(intArrayOf(1, 4), intArrayOf(4, 5))))
    }
}