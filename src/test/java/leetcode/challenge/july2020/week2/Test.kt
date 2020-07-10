package leetcode.challenge.july2020.week2

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun test3Sum() {
        var actual = threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))
        Assert.assertArrayEquals(intArrayOf(-1, -1, 2), actual[0].toIntArray())
        Assert.assertArrayEquals(intArrayOf(-1, 0, 1), actual[1].toIntArray())

        actual = threeSum(intArrayOf(0, 0, 0))
        Assert.assertArrayEquals(intArrayOf(0, 0, 0), actual[0].toIntArray())

        actual = threeSum(intArrayOf(-2, 0, 0, 2, 2))
        Assert.assertArrayEquals(intArrayOf(-2, 0, 2), actual[0].toIntArray())
    }

    @Test
    fun testMaximumWidthOfBinaryTree() {
        val root = TreeNode(1)
        root.left = TreeNode(2)
        root.left!!.left = TreeNode(3)
        root.left!!.right = TreeNode(4)
        Assert.assertEquals(2, widthOfBinaryTree(root))

        root.right = TreeNode(5)
        root.right!!.right = TreeNode(6)
        Assert.assertEquals(4, widthOfBinaryTree(root))

        root.left!!.right = null
        root.right!!.right = null
        Assert.assertEquals(2, widthOfBinaryTree(root))

        root.left!!.left!!.left = TreeNode(7)
        root.right!!.right = TreeNode(6)
        root.right!!.right!!.right = TreeNode(8)
        Assert.assertEquals(8, widthOfBinaryTree(root))
    }
}