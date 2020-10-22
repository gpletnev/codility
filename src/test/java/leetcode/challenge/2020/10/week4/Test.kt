package leetcode.challenge.`2020`.`10`.week4

import leetcode.TreeNode
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testMinDepth() {
        var root = TreeNode(3)
        root.left = TreeNode(9)
        root.right = TreeNode(20)
        root.right!!.left = TreeNode(15)
        root.right!!.right = TreeNode(7)
        Assert.assertEquals(2, minDepth(root))

        root = TreeNode(2)
        root.right = TreeNode(3)
        root.right!!.right = TreeNode(4)
        root.right!!.right!!.right = TreeNode(5)
        root.right!!.right!!.right!!.right = TreeNode(6)
        Assert.assertEquals(5, minDepth(root))
    }
}