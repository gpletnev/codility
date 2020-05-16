package leetcode.challenge.may2020.week3

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

}