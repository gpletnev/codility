package leetcode.easy

import leetcode.ListNode

// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
fun deleteDuplicates(head: ListNode?): ListNode? {
    var node = head
    while (node?.next != null) {
        while (node.next != null && node.`val` == node.next!!.`val`) {
            node.next = node.next!!.next
        }
        node = node.next
    }
    return head
}