package leetcode.challenge.`2021`.`01`.week4

import leetcode.ListNode
import java.util.*

// https://leetcode.com/problems/merge-k-sorted-lists/
fun mergeKLists(lists: Array<ListNode?>): ListNode? {
    val priorityQueue = PriorityQueue<Int>()
    lists.forEach {
        var node: ListNode? = it
        while (node != null) {
            priorityQueue.add(node!!.`val`)
            node = node!!.next
        }
    }

    val head: ListNode = if (priorityQueue.isNotEmpty()) ListNode(priorityQueue.poll()) else return null
    var node: ListNode = head

    while (priorityQueue.isNotEmpty()) {
        node.next = ListNode(priorityQueue.poll())
        node = node.next!!
    }

    return head
}