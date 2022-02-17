package leetcode.medium

import leetcode.ListNode

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    val newHead = ListNode(0)
    newHead.next = head
    var nth: ListNode? = newHead
    var curr: ListNode? = newHead
    var count = n
    while (count > 0) {
        curr = curr!!.next
        count--
    }
    while (curr!!.next != null) {
        curr = curr.next
        nth = nth!!.next
    }
    nth!!.next = nth.next!!.next
    return newHead.next
}