package leetcode.challenge.june2020.week1

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testInvertBinaryTree() {
        val root = TreeNode(4)
        root.left = TreeNode(2)
        root.right = TreeNode(7)
        root.left!!.left = TreeNode(1)
        root.left!!.right = TreeNode(3)
        root.right!!.left = TreeNode(6)
        root.right!!.right = TreeNode(9)

        InvertBinaryTree.invertTree(root)

        Assert.assertEquals(4, root.`val`)
        Assert.assertEquals(7, root.left!!.`val`)
        Assert.assertEquals(2, root.right!!.`val`)
        Assert.assertEquals(9, root.left!!.left!!.`val`)
        Assert.assertEquals(6, root.left!!.right!!.`val`)
        Assert.assertEquals(3, root.right!!.left!!.`val`)
        Assert.assertEquals(1, root.right!!.right!!.`val`)
    }

    @Test
    fun testDeleteNode() {
        val root = ListNode(4)
        root.next = ListNode(5)
        root.next!!.next = ListNode(1)
        root.next!!.next!!.next = ListNode(9)

        deleteNode(root.next)
        Assert.assertArrayEquals(intArrayOf(4, 1, 9), root.toIntArray())

        deleteNode(root.next)
        Assert.assertArrayEquals(intArrayOf(4, 9), root.toIntArray())
    }

}