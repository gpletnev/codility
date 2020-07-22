package leetcode

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testBinaryTree() {
        val binaryTree = BinaryTree(listOf(3, 9, 20, null, null, 15, 7))
        val head = TreeNode(3)
        head.left = TreeNode(9)
        head.right = TreeNode(20)
        head.left!!.left = null
        head.left!!.right = null
        head.right!!.left = TreeNode(15)
        head.right!!.right = TreeNode(7)
        Assert.assertEquals(head.`val`, binaryTree.head?.`val`)
        Assert.assertEquals(head.left?.`val`, binaryTree.head?.left?.`val`)
        Assert.assertEquals(head.right?.`val`, binaryTree.head?.right?.`val`)
        Assert.assertEquals(head.left?.left, binaryTree.head?.left?.left)
        Assert.assertEquals(head.left?.right, binaryTree.head?.left?.right)
        Assert.assertEquals(head.right?.left?.`val`, binaryTree.head?.right?.left?.`val`)
        Assert.assertEquals(head.right?.right?.`val`, binaryTree.head?.right?.right?.`val`)
    }
}