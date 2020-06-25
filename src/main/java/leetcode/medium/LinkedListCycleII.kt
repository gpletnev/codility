package leetcode.medium

// https://leetcode.com/problems/linked-list-cycle-ii/
object LinkedListCycleII {
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
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}