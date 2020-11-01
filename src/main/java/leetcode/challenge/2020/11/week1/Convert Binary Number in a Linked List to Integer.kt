package leetcode.challenge.`2020`.`11`.week1

import leetcode.ListNode

// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
fun getDecimalValue(head: ListNode?): Int {
    var node = head?.next
    var num = head!!.`val`
    while (node != null) {
        num = num.shl(1).or(node.`val`)
        node = node.next
    }
    return num
}