package leetcode.challenge.may2020.week1

import leetcode.challenge.may2020.week2.CheckIfItIsAStraightLine
import org.junit.Assert
import org.junit.Test

class Test {

    @Test
    fun testCousinsInBinaryTree() {
        val root = TreeNode(1)
        root.left = TreeNode(2)
        root.right = TreeNode(3)
        root.left!!.left = TreeNode(4)
        root.right!!.right = TreeNode(5)

        Assert.assertEquals(false, CousinsInBinaryTree.isCousins(root, 4, 3))
        Assert.assertEquals(true, CousinsInBinaryTree.isCousins(root, 4, 5))
        Assert.assertEquals(false, CousinsInBinaryTree.isCousins(root, 2, 3))
    }

    @Test
    fun testCheckIfItIsAStraightLine() {
        Assert.assertEquals(true, CheckIfItIsAStraightLine.checkStraightLine(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4), intArrayOf(4, 5), intArrayOf(5, 6), intArrayOf(6, 7))))
        Assert.assertEquals(false, CheckIfItIsAStraightLine.checkStraightLine(arrayOf(intArrayOf(1, 1), intArrayOf(2, 2), intArrayOf(3, 4), intArrayOf(4, 5), intArrayOf(5, 6), intArrayOf(7, 7))))
        Assert.assertEquals(true, CheckIfItIsAStraightLine.checkStraightLine(arrayOf(intArrayOf(1, 1), intArrayOf(1, 2), intArrayOf(1, 4))))
    }
}