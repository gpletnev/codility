package leetcode.easy.tree

import leetcode.BinaryTree
import leetcode.TreeNode
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Test {

    @Test
    fun preorderTraversalTest() {
        assertContentEquals(intArrayOf(), preorderTraversal(null).toIntArray())
        val tree = TreeNode(1)
        assertContentEquals(intArrayOf(1), preorderTraversal(tree).toIntArray())
        tree.right = TreeNode(2)
        tree.right!!.left = TreeNode(3)
        assertContentEquals(intArrayOf(1, 2, 3), preorderTraversal(tree).toIntArray())
        tree.left = TreeNode(4)
        assertContentEquals(intArrayOf(1, 4, 2, 3), preorderTraversal(tree).toIntArray())
    }

    @Test
    fun inorderTraversalTest() {
        assertContentEquals(intArrayOf(), inorderTraversal(null).toIntArray())
        val tree = TreeNode(1)
        assertContentEquals(intArrayOf(1), inorderTraversal(tree).toIntArray())
        tree.right = TreeNode(2)
        tree.right!!.left = TreeNode(3)
        assertContentEquals(intArrayOf(1, 3, 2), inorderTraversal(tree).toIntArray())
        tree.left = TreeNode(4)
        assertContentEquals(intArrayOf(4, 1, 3, 2), inorderTraversal(tree).toIntArray())
    }

    @Test
    fun postorderTraversalTest() {
        assertContentEquals(intArrayOf(), postorderTraversal(null).toIntArray())
        val tree = TreeNode(1)
        assertContentEquals(intArrayOf(1), postorderTraversal(tree).toIntArray())
        tree.right = TreeNode(2)
        tree.right!!.left = TreeNode(3)
        assertContentEquals(intArrayOf(3, 2, 1), postorderTraversal(tree).toIntArray())
        tree.left = TreeNode(4)
        assertContentEquals(intArrayOf(4, 3, 2, 1), postorderTraversal(tree).toIntArray())
    }

    @Test
    fun isSymmetricTest() {
        assertFalse(isSymmetric(BinaryTree(listOf(9, -42, -42, null, 76, 76, null, null, 13, null, 13)).head))
        assertTrue(isSymmetric(BinaryTree(listOf(1)).head))
        assertTrue(isSymmetric(BinaryTree(listOf(1, 2, 2, 3, 4, 4, 3)).head))
        assertFalse(isSymmetric(BinaryTree(listOf(1, 2, 2, 3, 4, 4, 3, 5)).head))
        assertFalse(isSymmetric(BinaryTree(listOf(1, 2, 2, null, 3, null, 3)).head))
    }

    @Test
    fun hasPathSumTest() {
        assertTrue(hasPathSum(BinaryTree(listOf(-2, null, -3)).head, -5))
        assertFalse(hasPathSum(null, 0))
        assertFalse(hasPathSum(BinaryTree(listOf(1, 2, 3)).head, 5))
        assertTrue(hasPathSum(BinaryTree(listOf(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1)).head, 22))
    }

    @Test
    fun lowestCommonAncestorTest() {
        var root = BinaryTree(listOf(2, 1)).head
        assertEquals(root, lowestCommonAncestor(root!!, root.left!!, root))
        root = BinaryTree(listOf(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5)).head
        assertEquals(root, lowestCommonAncestor(root!!, root.left!!, root.right!!))
        assertEquals(root.left, lowestCommonAncestor(root, root.left!!, root.left!!.right!!))
    }

    @Test
    fun findTargetTest() {
        assertFalse(findTarget(BinaryTree(listOf(2, 1, 3)).head, 1))
        assertTrue(findTarget(BinaryTree(listOf(5, 3, 6, 2, 4, null, 7)).head, 9))
        assertFalse(findTarget(BinaryTree(listOf(5, 3, 6, 2, 4, null, 7)).head, 28))
    }
}