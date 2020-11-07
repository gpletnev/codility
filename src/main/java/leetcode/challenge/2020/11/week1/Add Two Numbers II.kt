package leetcode.challenge.`2020`.`11`.week1

import leetcode.ListNode
import java.util.*

// https://leetcode.com/problems/add-two-numbers-ii/
fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode {
    val l1Stack = Stack<ListNode>()

    var list1 = l1
    while (list1 != null) {
        l1Stack.push(list1)
        list1 = list1.next
    }

    val l2Stack = Stack<ListNode>()

    var list2 = l2
    while (list2 != null) {
        l2Stack.push(list2)
        list2 = list2.next
    }

    var carry = 0
    var head: ListNode? = null

    while (!l1Stack.isEmpty() || !l2Stack.isEmpty() || carry != 0) {
        val n1 = if (l1Stack.isEmpty()) 0 else l1Stack.pop().`val`
        val n2 = if (l2Stack.isEmpty()) 0 else l2Stack.pop().`val`
        val sum = n1 + n2 + carry
        val newNode = ListNode(sum % 10)
        newNode.next = head
        head = newNode
        carry = sum / 10
    }

    return head!!
}