package leetcode.challenge.`2021`.`01`.week2

import leetcode.ListNode

// https://leetcode.com/problems/add-two-numbers/
fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
/*    val dummyHead = ListNode(0)
    var p: ListNode? = l1
    var q: ListNode? = l2
    var curr = dummyHead
    var carry = 0
    while (p != null || q != null) {
        val x = p?.`val` ?: 0
        val y = q?.`val` ?: 0
        val sum = carry + x + y
        carry = sum / 10
        curr.next = ListNode(sum % 10)
        curr = curr.next!!
        if (p != null) p = p.next
        if (q != null) q = q.next
    }
    if (carry > 0) {
        curr.next = ListNode(carry)
    }
    return dummyHead.next!!*/
    return addLists(l1, l2, 0)
}

fun addLists(l1: ListNode?, l2: ListNode?, _carry: Int): ListNode? {
    // base case
    var carry = _carry
    if (l1 == null && l2 == null && carry == 0) return null
    // add
    var digit = carry
    digit += l1?.`val` ?: 0
    digit += l2?.`val` ?: 0

    // calculate carry and digit
    carry = digit / 10
    digit %= 10

    // create head
    val head = ListNode(digit)
    head.next = addLists(l1?.next, l2?.next, carry)
    return head
}