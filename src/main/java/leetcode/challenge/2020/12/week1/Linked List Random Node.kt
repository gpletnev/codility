package leetcode.challenge.`2020`.`12`.week1

import leetcode.ListNode

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

// https://leetcode.com/problems/linked-list-random-node/
class Solution(val head: ListNode) {

    /** @param head The linked list's head.
    Note that the head is guaranteed to be not null, so it contains at least one node. */


    /** Returns a random node's value. */
    fun getRandom(): Int {
        val size = getSize()
        val r = (1..size).random()
        return get(r).`val`

        //return getRandomValue()
    }

    private fun getRandomValue(): Int {
        var node: ListNode? = head
        var count = 1
        var randomValue = node!!.`val`
        while (node != null) {
            if ((1..count).random() == 1)
                randomValue = node.`val`
            node = node.next
            count++
        }
        return randomValue
    }

    fun getSize(): Int {
        var node: ListNode? = head
        var count = 1
        while (node?.next != null) {
            node = node.next
            count++
        }
        return count
    }

    fun get(i: Int): ListNode {
        var count = 1
        var node = head
        while (count < i) {
            count++
            node = node.next!!
        }
        return node
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * var obj = Solution(head)
 * var param_1 = obj.getRandom()
 */