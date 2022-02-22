package leetcode.challenge.`2021`.`01`.week1

import leetcode.ListNode

// https://leetcode.com/problems/merge-two-sorted-lists/
fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    if (list1 == null) return list2
    if (list2 == null) return list1
    return if (list1.`val` < list2.`val`) {
        list1.next = mergeTwoLists(list1.next, list2)
        list1
    } else {
        list2.next = mergeTwoLists(list1, list2.next)
        list2
    }
}

fun mergeTwoListsIterative(list1: ListNode?, list2: ListNode?): ListNode? {
    var l1 = list1
    var l2 = list2
    var node: ListNode?
    val dummy = ListNode(0)
    node = dummy
    while (l1 != null && l2 != null) {
        if (l1.`val` < l2.`val`) {
            node!!.next = l1
            l1 = l1.next
        } else {
            node!!.next = l2
            l2 = l2.next
        }
        node = node.next
    }
    node!!.next = l1 ?: l2
    return dummy.next
}