package leetcode.challenge.`2021`.`01`.week1

import leetcode.ListNode

// https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
fun deleteDuplicates(head: ListNode?): ListNode? {
    var current = head

    if (current?.next != null) {
        if (current.`val` == current.next!!.`val`) {
            while (current?.`val` == head?.`val`) {
                current = current?.next
            }
            return deleteDuplicates(current)

        }

        current.next = deleteDuplicates(current.next)
    }
    return current
}