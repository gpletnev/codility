package leetcode.challenge.`2020`.`07`.week3

import leetcode.ListNode

// https://leetcode.com/problems/remove-linked-list-elements
fun removeElements(_head: ListNode?, `val`: Int): ListNode? {
    var head = _head
    while (head != null && head.`val` == `val`) head = head.next
    var node = head
    while (node?.next != null) {
        if (node.next!!.`val` == `val`) node.next = node.next!!.next
        else node = node.next
    }
    return head
}