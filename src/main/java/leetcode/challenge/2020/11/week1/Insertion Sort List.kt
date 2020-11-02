package leetcode.challenge.`2020`.`11`.week1

import leetcode.ListNode

// https://leetcode.com/problems/insertion-sort-list/
fun insertionSortList(_head: ListNode?): ListNode? {
    var head = _head

    if (head?.next == null) {
        return head
    }

    var sortedHead: ListNode = head
    var sortedTail: ListNode = head
    head = head.next
    sortedHead.next = null

    while (head != null) {
        val node: ListNode = head
        head = head.next
        node.next = null

        when {
            node.`val` <= sortedHead.`val` -> {
                node.next = sortedHead
                sortedHead = node
            }
            node.`val` >= sortedTail.`val` -> {
                sortedTail.next = node
                sortedTail = node
            }
            else -> {
                var current: ListNode = sortedHead
                while (current.next != null && current.next!!.`val` < node.`val`) {
                    current = current.next!!
                }
                node.next = current.next
                current.next = node
            }
        }
    }

    return sortedHead
}