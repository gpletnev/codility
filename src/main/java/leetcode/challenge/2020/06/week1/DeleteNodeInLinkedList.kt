package leetcode.challenge.`2020`.`06`.week1

import leetcode.ListNode

// https://leetcode.com/problems/delete-node-in-a-linked-list/
fun deleteNode(node: ListNode?) {
    node!!.`val` = node.next!!.`val`
    node.next = node.next!!.next
}
