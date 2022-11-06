package leetcode.challenge.`2020`.`05`.week3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {
    @Test
    fun testMaximumSumCircularSubarray() {
        assertEquals(3, MaximumSumCircularSubarray.maxSubarraySumCircular(intArrayOf(1, -2, 3, -2)))
        assertEquals(10, MaximumSumCircularSubarray.maxSubarraySumCircular(intArrayOf(5, -3, 5)))
        assertEquals(4, MaximumSumCircularSubarray.maxSubarraySumCircular(intArrayOf(3, -1, 2, -1)))
        assertEquals(3, MaximumSumCircularSubarray.maxSubarraySumCircular(intArrayOf(3, -2, 2, -3)))
        assertEquals(-1, MaximumSumCircularSubarray.maxSubarraySumCircular(intArrayOf(-2, -3, -1)))
    }

    @Test
    fun testOddEvenLinkedList() {
        assertEquals("null", OddEvenLinkedList.oddEvenList(null).toString())
        val head = ListNode(1)
        assertEquals("1 NULL", OddEvenLinkedList.oddEvenList(head).toString())
        head.next = ListNode(2)
        assertEquals("1 2 NULL", OddEvenLinkedList.oddEvenList(head).toString())
        head.next?.next = ListNode(3)
        assertEquals("1 3 2 NULL", OddEvenLinkedList.oddEvenList(head).toString())
        head.next?.next?.next = ListNode(4)
//        assertEquals("1 3 2 4 NULL", OddEvenLinkedList.oddEvenList(head).toString())
//        head.next?.next?.next?.next = ListNode(5)
//        assertEquals("1 3 5 2 4 NULL", OddEvenLinkedList.oddEvenList(head).toString())
    }

    @Test
    fun testPermutationInString() {
        assertEquals(true, PermutationInString.checkInclusion("ab", "eidbaooo"))
        assertEquals(false, PermutationInString.checkInclusion("ab", "eidboaoo"))
    }

    @Test
    fun testStockSpanner() {
        val stockSpanner = StockSpanner()
        assertEquals(1, stockSpanner.next(100))
        assertEquals(1, stockSpanner.next(80))
        assertEquals(1, stockSpanner.next(60))
        assertEquals(2, stockSpanner.next(70))
        assertEquals(1, stockSpanner.next(60))
        assertEquals(4, stockSpanner.next(75))
        assertEquals(6, stockSpanner.next(85))
    }

    @Test
    fun testKthSmallestElementInBST() {
        val root = TreeNode(3)
        root.left = TreeNode(1)
        root.right = TreeNode(4)
        root.left!!.right = TreeNode(2)
        assertEquals(1, KthSmallestElementInBST.kthSmallest(root, 1))
        val node = TreeNode(5)
        node.left = root
        node.right = TreeNode(6)
        assertEquals(3, KthSmallestElementInBST.kthSmallest(node, 3))
        assertEquals(6, KthSmallestElementInBST.kthSmallest(node, 6))
    }

    @Test
    fun CountSquareSubmatricesWithAllOnes() {
        assertEquals(15, CountSquareSubmatricesWithAllOnes.countSquares(listOf(intArrayOf(0, 1, 1, 1), intArrayOf(1, 1, 1, 1), intArrayOf(0, 1, 1, 1)).toTypedArray()))
        assertEquals(7, CountSquareSubmatricesWithAllOnes.countSquares(listOf(intArrayOf(1, 0, 1), intArrayOf(1, 1, 0), intArrayOf(1, 1, 0)).toTypedArray()))
    }
}