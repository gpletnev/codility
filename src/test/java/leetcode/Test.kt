package leetcode

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

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
        assertEquals(head.`val`, binaryTree.head?.`val`)
        assertEquals(head.left?.`val`, binaryTree.head?.left?.`val`)
        assertEquals(head.right?.`val`, binaryTree.head?.right?.`val`)
        assertEquals(head.left?.left, binaryTree.head?.left?.left)
        assertEquals(head.left?.right, binaryTree.head?.left?.right)
        assertEquals(head.right?.left?.`val`, binaryTree.head?.right?.left?.`val`)
        assertEquals(head.right?.right?.`val`, binaryTree.head?.right?.right?.`val`)
    }
}