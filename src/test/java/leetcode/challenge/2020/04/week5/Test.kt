package leetcode.challenge.`2020`.`04`.week5

import leetcode.TreeNode
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {

    @Test
    fun testBinaryTreeMaximumPathSum() {
        var root = TreeNode(2)
        root.left = TreeNode(-1)
        assertEquals(2, BinaryTreeMaximumPathSum.maxPathSum(root))

        root = TreeNode(1)
        root.left = TreeNode(-2)
        root.right = TreeNode(3)
        assertEquals(4, BinaryTreeMaximumPathSum.maxPathSum(root))

        root = TreeNode(1)
        root.left = TreeNode(2)
        root.right = TreeNode(3)
        assertEquals(6, BinaryTreeMaximumPathSum.maxPathSum(root))

        root = TreeNode(-10)
        root.left = TreeNode(9)
        root.right = TreeNode(20)
        root.right!!.left = TreeNode(15)
        root.right!!.right = TreeNode(7)
        assertEquals(42, BinaryTreeMaximumPathSum.maxPathSum(root))

//        root = TreeNode(9)
//        root.left = TreeNode(6)
//        root.right = TreeNode(-3)
//        root.right!!.left = TreeNode(-6)
//        root.right!!.right = TreeNode(2)
//        root.right!!.right!!.left = TreeNode(2)
//        root.right!!.right!!.left!!.left = TreeNode(-6)
//        root.right!!.right!!.left!!.right = TreeNode(-6)
//        root.right!!.right!!.left!!.left!!.left = TreeNode(-6)
//        assertEquals(16, BinaryTreeMaximumPathSum.maxPathSum(root))

        root = TreeNode(5)
        root.left = TreeNode(4)
        root.right = TreeNode(8)
        root.left!!.left = TreeNode(11)
        root.left!!.left!!.left = TreeNode(7)
        root.left!!.left!!.right = TreeNode(2)
        root.right!!.left = TreeNode(13)
        root.right!!.right = TreeNode(4)
        root.right!!.right!!.right = TreeNode(1)
        assertEquals(48, BinaryTreeMaximumPathSum.maxPathSum(root))
    }


    @Test
    fun testCheckIfAStringIsAValidSequenceFromRootToLeavesPathInABinaryTree() {
        val root = TreeNode(0)

        assertEquals(true, CheckIfAStringIsAValidSequenceFromRootToLeavesPathInABinaryTree.isValidSequence(root, intArrayOf(0)))
        assertEquals(false, CheckIfAStringIsAValidSequenceFromRootToLeavesPathInABinaryTree.isValidSequence(root, intArrayOf(1)))

        root.left = TreeNode(1)
        root.right = TreeNode(0)

        root.left!!.left = TreeNode(0)
        root.left!!.right = TreeNode(1)
        root.right!!.left = TreeNode(0)

        root.left!!.left!!.right = TreeNode(1)
        root.left!!.right!!.left = TreeNode(0)
        root.left!!.right!!.right = TreeNode(0)

        assertEquals(true, CheckIfAStringIsAValidSequenceFromRootToLeavesPathInABinaryTree.isValidSequence(root, intArrayOf(0, 1, 0, 1)))
        assertEquals(false, CheckIfAStringIsAValidSequenceFromRootToLeavesPathInABinaryTree.isValidSequence(root, intArrayOf(0, 0, 1)))
        assertEquals(false, CheckIfAStringIsAValidSequenceFromRootToLeavesPathInABinaryTree.isValidSequence(root, intArrayOf(0, 1, 1)))
        assertEquals(true, CheckIfAStringIsAValidSequenceFromRootToLeavesPathInABinaryTree.isValidSequence(root, intArrayOf(0, 0, 0)))
        assertEquals(false, CheckIfAStringIsAValidSequenceFromRootToLeavesPathInABinaryTree.isValidSequence(root, intArrayOf(0, 0)))
    }
}