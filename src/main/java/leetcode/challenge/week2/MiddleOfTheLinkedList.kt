package leetcode.challenge.week2

// https://leetcode.com/problems/middle-of-the-linked-list/
object MiddleOfTheLinkedList {
    fun middleNode(head: ListNode?): ListNode? {
        var slow = head
        var fast = head
        while (fast?.next != null) {
            slow = slow!!.next
            fast = fast.next!!.next
        }
        return slow
    }
}

class ListNode(val next: ListNode?)