package leetcode.challenge.`2020`.`10`.week4

import leetcode.ListNode

// https://leetcode.com/problems/linked-list-cycle-ii/
fun detectCycle(head: ListNode?): ListNode? {
    var slow = head
    var fast = head

    while (fast?.next != null) {
        fast = fast.next!!.next
        slow = slow!!.next
        if (fast == slow) {
            slow = head
            while (slow != fast) {
                slow = slow!!.next
                fast = fast!!.next
            }
            return slow
        }
    }
    return null
}