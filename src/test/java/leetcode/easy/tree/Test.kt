package leetcode.easy.tree

import leetcode.TreeNode
import org.junit.Assert
import org.junit.Test

class Test {

    @Test
    fun preorderTraversalTest() {
        Assert.assertArrayEquals(intArrayOf(), preorderTraversal(null).toIntArray())
        val tree = TreeNode(1)
        Assert.assertArrayEquals(intArrayOf(1), preorderTraversal(tree).toIntArray())
        tree.right = TreeNode(2)
        tree.right!!.left = TreeNode(3)
        Assert.assertArrayEquals(intArrayOf(1, 2, 3), preorderTraversal(tree).toIntArray())
        tree.left = TreeNode(4)
        Assert.assertArrayEquals(intArrayOf(1, 4, 2, 3), preorderTraversal(tree).toIntArray())
    }

    @Test
    fun inorderTraversalTest() {
        Assert.assertArrayEquals(intArrayOf(), inorderTraversal(null).toIntArray())
        val tree = TreeNode(1)
        Assert.assertArrayEquals(intArrayOf(1), inorderTraversal(tree).toIntArray())
        tree.right = TreeNode(2)
        tree.right!!.left = TreeNode(3)
        Assert.assertArrayEquals(intArrayOf(1, 3, 2), inorderTraversal(tree).toIntArray())
        tree.left = TreeNode(4)
        Assert.assertArrayEquals(intArrayOf(4, 1, 3, 2), inorderTraversal(tree).toIntArray())
    }

    @Test
    fun postorderTraversalTest() {
        Assert.assertArrayEquals(intArrayOf(), postorderTraversal(null).toIntArray())
        val tree = TreeNode(1)
        Assert.assertArrayEquals(intArrayOf(1), postorderTraversal(tree).toIntArray())
        tree.right = TreeNode(2)
        tree.right!!.left = TreeNode(3)
        Assert.assertArrayEquals(intArrayOf(3, 2, 1), postorderTraversal(tree).toIntArray())
        tree.left = TreeNode(4)
        Assert.assertArrayEquals(intArrayOf(4, 3, 2, 1), postorderTraversal(tree).toIntArray())
    }
}