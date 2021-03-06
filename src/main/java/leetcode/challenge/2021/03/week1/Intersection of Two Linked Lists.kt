package leetcode.challenge.`2021`.`03`.week1

import leetcode.ListNode

// https://leetcode.com/problems/intersection-of-two-linked-lists/
fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
    if (headA == null || headB == null) return null

    var a = headA
    var b = headB

    while (a !== b) {
        a = if (a == null) headB else a.next
        b = if (b == null) headA else b.next
    }

    return a
}