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
}