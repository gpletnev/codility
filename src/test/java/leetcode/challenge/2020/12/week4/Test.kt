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
}