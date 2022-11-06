package leetcode.challenge.`2020`.`05`.week1

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {

    @Test
    fun testCousinsInBinaryTree() {
        val root = TreeNode(1)
        root.left = TreeNode(2)
        root.right = TreeNode(3)
        root.left!!.left = TreeNode(4)
        root.right!!.right = TreeNode(5)

        assertEquals(false, CousinsInBinaryTree.isCousins(root, 4, 3))
        assertEquals(true, CousinsInBinaryTree.isCousins(root, 4, 5))
        assertEquals(false, CousinsInBinaryTree.isCousins(root, 2, 3))
    }
}