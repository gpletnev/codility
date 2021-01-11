package leetcode.challenge.`2020`.`12`.week4

import leetcode.BinaryTree
import leetcode.toIntArray
import leetcode.toList
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun isBalancedTest() {
        Assert.assertTrue(isBalanced(BinaryTree(listOf(3, 9, 20, null, null, 15, 7)).head))
        Assert.assertFalse(isBalanced(BinaryTree(listOf(1, 2, 2, 3, 3, null, null, 4, 4)).head))
        Assert.assertTrue(isBalanced(BinaryTree(listOf()).head))
    }

    @Test
    fun nextGreaterElementTest() {
        Assert.assertEquals(21, nextGreaterElement(12))
        Assert.assertEquals(-1, nextGreaterElement(21))
        Assert.assertEquals(12433567, nextGreaterElement(12376543))
    }

    @Test
    fun swapPairsTest() {
        Assert.assertEquals(null, swapPairs(intArrayOf().toList()))
        Assert.assertArrayEquals(intArrayOf(1), swapPairs(intArrayOf(1).toList())!!.toIntArray())
        Assert.assertArrayEquals(intArrayOf(2, 1, 4, 3), swapPairs(intArrayOf(1, 2, 3, 4).toList())!!.toIntArray())
    }

    @Test
    fun findDiagonalOrderTest() {
        Assert.assertArrayEquals(
            intArrayOf(),
            findDiagonalOrder(arrayOf(intArrayOf()))
        )
        Assert.assertArrayEquals(
            intArrayOf(1),
            findDiagonalOrder(arrayOf(intArrayOf(1)))
        )
        Assert.assertArrayEquals(
            intArrayOf(1, 2, 4, 7, 5, 3, 6, 8, 9),
            findDiagonalOrder(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9)))
        )
    }

    @Test
    fun numDecodingsTest() {
        Assert.assertEquals(2, numDecodings("12"))
        Assert.assertEquals(3, numDecodings("226"))
        Assert.assertEquals(0, numDecodings("0"))
        Assert.assertEquals(1, numDecodings("1"))
    }

    @Test
    fun minJumpsTest() {
        Assert.assertEquals(3, minJumps(intArrayOf(100, -23, -23, 404, 100, 23, 23, 23, 3, 404)))
        Assert.assertEquals(0, minJumps(intArrayOf(7)))
        Assert.assertEquals(1, minJumps(intArrayOf(7, 6, 9, 6, 9, 6, 9, 7)))
        Assert.assertEquals(3, minJumps(intArrayOf(11, 22, 7, 7, 7, 7, 7, 7, 7, 22, 13)))
    }

    @Test
    fun reachNumberTest() {
        Assert.assertEquals(2, reachNumber(3))
        Assert.assertEquals(3, reachNumber(2))
    }
}