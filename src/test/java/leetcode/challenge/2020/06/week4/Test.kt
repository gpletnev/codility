package leetcode.challenge.`2020`.`06`.week4

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {
    @Test
    fun testSingleNumberII() {
        assertEquals(3, SingleNumberII.singleNumber(intArrayOf(2, 2, 3, 2)))
        assertEquals(99, SingleNumberII.singleNumber(intArrayOf(0, 1, 0, 1, 0, 1, 99)))
    }

    @Test
    fun testCountCompleteTreeNodes() {
        val root = TreeNode(1)
        root.left = TreeNode(2)
        root.right = TreeNode(3)
        root.left!!.left = TreeNode(4)
        root.left!!.right = TreeNode(5)
        root.right!!.left = TreeNode(6)

        assertEquals(6, CountCompleteTreeNodes.countNodes(root))
    }

    @Test
    fun testFindTheDuplicateNumber() {
        assertEquals(2, FindTheDuplicateNumber.findDuplicate(intArrayOf(1, 3, 4, 2, 2)))
        assertEquals(3, FindTheDuplicateNumber.findDuplicate(intArrayOf(3, 1, 3, 4, 2)))
    }

    @Test
    fun testSumRootToLeafNumbers() {
        var root = TreeNode(1)
        root.left = TreeNode(2)
        root.right = TreeNode(3)
        assertEquals(25, SumRootToLeafNumbers.sumNumbers(root))

        root = TreeNode(4)
        root.left = TreeNode(9)
        root.right = TreeNode(0)
        root.left!!.left = TreeNode(5)
        root.left!!.right = TreeNode(1)
        assertEquals(1026, SumRootToLeafNumbers.sumNumbers(root))

        root = TreeNode(9)
        assertEquals(9, SumRootToLeafNumbers.sumNumbers(root))
    }
}