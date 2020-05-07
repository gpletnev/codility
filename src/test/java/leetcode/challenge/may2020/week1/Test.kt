package leetcode.challenge.may2020.week1

import org.junit.Assert
import org.junit.Test

class Test {

    @Test
    fun testCousinsInBinaryTree() {
        val root = TreeNode(1)
        root.left = TreeNode(2)
        root.right = TreeNode(3)
        root.left!!.left = TreeNode(4)
        root.right!!.right = TreeNode(5)

        Assert.assertEquals(false, CousinsInBinaryTree.isCousins(root, 4, 3))
        Assert.assertEquals(true, CousinsInBinaryTree.isCousins(root, 4, 5))
        Assert.assertEquals(false, CousinsInBinaryTree.isCousins(root, 2, 3))
    }
}