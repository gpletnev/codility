package leetcode.challenge.`2021`.`01`.week1

import leetcode.ListNode

// https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
fun deleteDuplicates(head: ListNode?): ListNode? {
//    var current = head
//
//    if (current?.next != null) {
//        if (current.`val` == current.next!!.`val`) {
//            while (current?.`val` == head?.`val`) {
//                current = current?.next
//            }
//            return deleteDuplicates(current)
//
//        }
//
//        current.next = deleteDuplicates(current.next)
//    }
//    return current

    if (head == null) return null
    val fakeHead = ListNode(0)
    fakeHead.next = head
    var prev: ListNode? = fakeHead
    var curr = head
    while (curr != null) {
        while (curr!!.next != null && curr.`val` == curr.next!!.`val`) {
            curr = curr.next
        }
        if (prev!!.next == curr) {
            prev = prev.next
        } else {
            prev.next = curr.next
        }
        curr = curr.next
    }
    return fakeHead.next
}