package leetcode.challenge.`2020`.`12`.week4

import leetcode.ListNode

// https://leetcode.com/problems/swap-nodes-in-pairs/
fun swapPairs(head: ListNode?): ListNode? {
    if (head?.next == null) return head

    val next = head.next

    head.next = swapPairs(next?.next)
    next?.next = head

    return next
}