package leetcode.challenge.`2020`.`11`.week4

import leetcode.BinaryTree
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun robTest() {
        var root = BinaryTree(listOf(3, 2, 3, null, 3, null, 1)).head
        Assert.assertEquals(7, rob(root))

        root = BinaryTree(listOf(3, 4, 5, 1, 3, null, 1)).head
        Assert.assertEquals(9, rob(root))
    }

    @Test
    fun calculateTest() {
        Assert.assertEquals(7, calculate("3+2*2"))
        Assert.assertEquals(1, calculate(" 3/2"))
        Assert.assertEquals(5, calculate("3+5 / 2"))
    }

    @Test
    fun smallestRepunitDivByKTest() {
        Assert.assertEquals(22, smallestRepunitDivByK(23))
        Assert.assertEquals(1, smallestRepunitDivByK(1))
        Assert.assertEquals(-1, smallestRepunitDivByK(2))
        Assert.assertEquals(3, smallestRepunitDivByK(3))
        Assert.assertEquals(16, smallestRepunitDivByK(17))
        Assert.assertEquals(-1, smallestRepunitDivByK(5))
    }

    @Test
    fun longestSubstringTest() {
        Assert.assertEquals(3, longestSubstring("aaabb", 3))
        Assert.assertEquals(5, longestSubstring("ababbc", 2))
    }

    @Test
    fun canPartitionTest() {
        Assert.assertEquals(true, canPartition(intArrayOf(1, 5, 11, 5)))
        Assert.assertEquals(false, canPartition(intArrayOf(1, 2, 3, 5)))
    }

    @Test
    fun maxSlidingWindowTest() {
        Assert.assertArrayEquals(intArrayOf(1), maxSlidingWindow(intArrayOf(1), 1))
        Assert.assertArrayEquals(intArrayOf(1, -1), maxSlidingWindow(intArrayOf(1, -1), 1))
        Assert.assertArrayEquals(intArrayOf(11), maxSlidingWindow(intArrayOf(9, 11), 2))
        Assert.assertArrayEquals(intArrayOf(4), maxSlidingWindow(intArrayOf(4, -2), 2))
        Assert.assertArrayEquals(intArrayOf(3, 3, 5, 5, 6, 7), maxSlidingWindow(intArrayOf(1, 3, -1, -3, 5, 3, 6, 7), 3))
    }
}