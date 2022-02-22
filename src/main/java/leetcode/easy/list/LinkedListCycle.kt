package leetcode.easy.list

// https://leetcode.com/problems/linked-list-cycle/
object LinkedListCycle {
    fun hasCycle(head: ListNode?): Boolean {
        var slow: ListNode? = head
        var fast: ListNode? = head
        while (fast?.next != null) {
            slow = slow?.next
            fast = fast.next?.next
            if (slow === fast) {
                return true
            }
        }
        return false
    }
}

class ListNode(var next: ListNode?)
