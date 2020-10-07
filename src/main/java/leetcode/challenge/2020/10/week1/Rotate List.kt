package leetcode.challenge.`2020`.`10`.week1

import leetcode.ListNode

// https://leetcode.com/problems/rotate-list/
fun rotateRight(head: ListNode?, k: Int): ListNode? {
    if (head?.next == null || k == 0) return head

    val node = ListNode(0)
    node.next = head
    var fast: ListNode? = node
    var slow: ListNode? = node

    var i = 0
    while (fast!!.next != null) {
        //Get the total length
        fast = fast.next
        i++
    }

    for (j in i - k % i downTo 1)  //Get the i-n%i th node
        slow = slow!!.next

    fast.next = node.next //Do the rotation

    node.next = slow!!.next
    slow.next = null

    return node.next
}