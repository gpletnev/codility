package leetcode.challenge.`2021`.`03`.week2

import leetcode.ListNode

// https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
fun swapNodes(head: ListNode?, k: Int): ListNode? {
    var slow: ListNode? = head
    var fast: ListNode? = head
    repeat(k - 1) {
        fast = fast?.next
    }

    val first: ListNode? = fast
    while (fast?.next != null) {
        slow = slow?.next
        fast = fast?.next
    }
    val second: ListNode? = slow

    val temp = first!!.`val`
    first.`val` = second!!.`val`
    second.`val` = temp
    return head
}