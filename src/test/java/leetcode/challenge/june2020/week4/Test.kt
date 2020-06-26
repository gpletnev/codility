package leetcode.challenge.june2020.week4

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testSingleNumberII() {
        Assert.assertEquals(3, SingleNumberII.singleNumber(intArrayOf(2, 2, 3, 2)))
        Assert.assertEquals(99, SingleNumberII.singleNumber(intArrayOf(0, 1, 0, 1, 0, 1, 99)))
    }

    @Test
    fun testCountCompleteTreeNodes() {
        val root = TreeNode(1)
        root.left = TreeNode(2)
        root.right = TreeNode(3)
        root.left!!.left = TreeNode(4)
        root.left!!.right = TreeNode(5)
        root.right!!.left = TreeNode(6)

        Assert.assertEquals(6, CountCompleteTreeNodes.countNodes(root))
    }

    @Test
    fun testFindTheDuplicateNumber() {
        Assert.assertEquals(2, FindTheDuplicateNumber.findDuplicate(intArrayOf(1, 3, 4, 2, 2)))
        Assert.assertEquals(3, FindTheDuplicateNumber.findDuplicate(intArrayOf(3, 1, 3, 4, 2)))
    }

    @Test
    fun testSumRootToLeafNumbers() {
        var root = TreeNode(1)
        root.left = TreeNode(2)
        root.right = TreeNode(3)
        Assert.assertEquals(25, SumRootToLeafNumbers.sumNumbers(root))

        root = TreeNode(4)
        root.left = TreeNode(9)
        root.right = TreeNode(0)
        root.left!!.left = TreeNode(5)
        root.left!!.right = TreeNode(1)
        Assert.assertEquals(1026, SumRootToLeafNumbers.sumNumbers(root))

        root = TreeNode(9)
        Assert.assertEquals(9, SumRootToLeafNumbers.sumNumbers(root))
    }
}