package leetcode.challenge.`2020`.`12`.week4

import leetcode.BinaryTree
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
}