package leetcode.easy.list

import leetcode.ListNode

// https://leetcode.com/problems/reverse-linked-list/
fun reverseList(head: ListNode?): ListNode? {
    var node = head
    var prev: ListNode? = null
    while (node != null) {
        val next = node.next
        node.next = prev
        prev = node
        node = next
    }
    return prev
}

//fun reverseList(head: ListNode?): ListNode? {
//    return reverseListInt(head, null)
//}
//
//private tailrec fun reverseListInt(head: ListNode?, newHead: ListNode?): ListNode? {
//    if (head == null) return newHead
//    val next = head.next
//    head.next = newHead
//    return reverseListInt(next, head)
//}