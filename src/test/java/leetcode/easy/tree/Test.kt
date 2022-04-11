package leetcode.easy.tree

import leetcode.BinaryTree
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

    @Test
    fun isSymmetricTest() {
        Assert.assertFalse(isSymmetric(BinaryTree(listOf(9, -42, -42, null, 76, 76, null, null, 13, null, 13)).head))
        Assert.assertTrue(isSymmetric(BinaryTree(listOf(1)).head))
        Assert.assertTrue(isSymmetric(BinaryTree(listOf(1, 2, 2, 3, 4, 4, 3)).head))
        Assert.assertFalse(isSymmetric(BinaryTree(listOf(1, 2, 2, 3, 4, 4, 3, 5)).head))
        Assert.assertFalse(isSymmetric(BinaryTree(listOf(1, 2, 2, null, 3, null, 3)).head))
    }

    @Test
    fun hasPathSumTest() {
        Assert.assertTrue(hasPathSum(BinaryTree(listOf(-2, null, -3)).head, -5))
        Assert.assertFalse(hasPathSum(null, 0))
        Assert.assertFalse(hasPathSum(BinaryTree(listOf(1, 2, 3)).head, 5))
        Assert.assertTrue(hasPathSum(BinaryTree(listOf(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1)).head, 22))
    }

    @Test
    fun lowestCommonAncestorTest() {
        var root = BinaryTree(listOf(2, 1)).head
        Assert.assertEquals(root, lowestCommonAncestor(root!!, root.left!!, root))
        root = BinaryTree(listOf(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5)).head
        Assert.assertEquals(root, lowestCommonAncestor(root!!, root.left!!, root.right!!))
        Assert.assertEquals(root.left, lowestCommonAncestor(root, root.left!!, root.left!!.right!!))
    }
}