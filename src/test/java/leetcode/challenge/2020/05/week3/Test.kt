package leetcode.challenge.`2020`.`05`.week3

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testMaximumSumCircularSubarray() {
        Assert.assertEquals(3, MaximumSumCircularSubarray.maxSubarraySumCircular(intArrayOf(1, -2, 3, -2)))
        Assert.assertEquals(10, MaximumSumCircularSubarray.maxSubarraySumCircular(intArrayOf(5, -3, 5)))
        Assert.assertEquals(4, MaximumSumCircularSubarray.maxSubarraySumCircular(intArrayOf(3, -1, 2, -1)))
        Assert.assertEquals(3, MaximumSumCircularSubarray.maxSubarraySumCircular(intArrayOf(3, -2, 2, -3)))
        Assert.assertEquals(-1, MaximumSumCircularSubarray.maxSubarraySumCircular(intArrayOf(-2, -3, -1)))
    }

    @Test
    fun testOddEvenLinkedList() {
        Assert.assertEquals("null", OddEvenLinkedList.oddEvenList(null).toString())
        val head = ListNode(1)
        Assert.assertEquals("1 NULL", OddEvenLinkedList.oddEvenList(head).toString())
        head.next = ListNode(2)
        Assert.assertEquals("1 2 NULL", OddEvenLinkedList.oddEvenList(head).toString())
        head.next?.next = ListNode(3)
        Assert.assertEquals("1 3 2 NULL", OddEvenLinkedList.oddEvenList(head).toString())
        head.next?.next?.next = ListNode(4)
        Assert.assertEquals("1 3 2 4 NULL", OddEvenLinkedList.oddEvenList(head).toString())
        head.next?.next?.next?.next = ListNode(5)
        Assert.assertEquals("1 3 5 2 4 NULL", OddEvenLinkedList.oddEvenList(head).toString())
    }

    @Test
    fun testPermutationInString() {
        Assert.assertEquals(true, PermutationInString.checkInclusion("ab", "eidbaooo"))
        Assert.assertEquals(false, PermutationInString.checkInclusion("ab", "eidboaoo"))
    }

    @Test
    fun testStockSpanner() {
        val stockSpanner = StockSpanner()
        Assert.assertEquals(1, stockSpanner.next(100))
        Assert.assertEquals(1, stockSpanner.next(80))
        Assert.assertEquals(1, stockSpanner.next(60))
        Assert.assertEquals(2, stockSpanner.next(70))
        Assert.assertEquals(1, stockSpanner.next(60))
        Assert.assertEquals(4, stockSpanner.next(75))
        Assert.assertEquals(6, stockSpanner.next(85))
    }

    @Test
    fun testKthSmallestElementInBST() {
        val root = TreeNode(3)
        root.left = TreeNode(1)
        root.right = TreeNode(4)
        root.left!!.right = TreeNode(2)
        Assert.assertEquals(1, KthSmallestElementInBST.kthSmallest(root, 1))
        val node = TreeNode(5)
        node.left = root
        node.right = TreeNode(6)
        Assert.assertEquals(3, KthSmallestElementInBST.kthSmallest(node, 3))
        Assert.assertEquals(6, KthSmallestElementInBST.kthSmallest(node, 6))
    }

    @Test
    fun CountSquareSubmatricesWithAllOnes() {
        Assert.assertEquals(15, CountSquareSubmatricesWithAllOnes.countSquares(listOf(intArrayOf(0, 1, 1, 1), intArrayOf(1, 1, 1, 1), intArrayOf(0, 1, 1, 1)).toTypedArray()))
        Assert.assertEquals(7, CountSquareSubmatricesWithAllOnes.countSquares(listOf(intArrayOf(1, 0, 1), intArrayOf(1, 1, 0), intArrayOf(1, 1, 0)).toTypedArray()))
    }
}