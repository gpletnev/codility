package leetcode.challenge.`2020`.`12`.week3

import leetcode.BinaryTree
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun sortedSquaresTest() {
        Assert.assertArrayEquals(intArrayOf(0, 1, 4), sortedSquares(intArrayOf(-1, 0, 2)))
        Assert.assertArrayEquals(intArrayOf(0, 1, 9, 16, 100), sortedSquares(intArrayOf(-4, -1, 0, 3, 10)))
    }

    @Test
    fun isValidBSTTest() {
        Assert.assertFalse(isValidBST(BinaryTree(listOf(5, 4, 6, null, null, 3, 7)).head))
        Assert.assertTrue(isValidBST(BinaryTree(listOf(2, 1)).head))
        Assert.assertFalse(isValidBST(BinaryTree(listOf(2, null, 1)).head))
        Assert.assertTrue(isValidBST(BinaryTree(listOf(2, 1, 3)).head))
        Assert.assertFalse(isValidBST(BinaryTree(listOf(5, 1, 4, null, null, 3, 6)).head))
    }

    @Test
    fun fourSumCountTest() {
        Assert.assertEquals(2, fourSumCount(intArrayOf(1, 2), intArrayOf(-2, -1), intArrayOf(-1, 2), intArrayOf(0, 2)))
    }

    @Test
    fun increasingTripletTest() {
        Assert.assertTrue(increasingTriplet(intArrayOf(1, 2, -1, 0, 1)))
        Assert.assertTrue(increasingTriplet(intArrayOf(1, 2, 3, 4, 5)))
        Assert.assertFalse(increasingTriplet(intArrayOf(5, 4, 3, 2, 1)))
        Assert.assertTrue(increasingTriplet(intArrayOf(2, 1, 5, 0, 4, 6)))
    }
}